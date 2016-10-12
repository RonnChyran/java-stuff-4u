package homework;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * Class loader from
 * http://stackoverflow.com/questions/520328/
 * 
 */
public class ClasspathManager {
	/**
	 * Scans all classes accessible from the context class loader which belong
	 * to the given package and subpackages.
	 * 
	 * @param packageName
	 *            The base package
	 * @return The classes
	 * @throws ClassNotFoundException
	 * @throws IOException
	 */
	@SuppressWarnings("unchecked")
	public static Class[] getClasses(String packageName)
			throws ClassNotFoundException, IOException {
		ClassLoader classLoader = Thread.currentThread()
				.getContextClassLoader(); //get the current class loader
		String path = packageName.replace('.', '/'); //replace package name with path
		Enumeration<URL> resources = classLoader.getResources(path);
		List<File> dirs = new ArrayList<File>(); //enumerate files in classpath
		while (resources.hasMoreElements()) {
			URL resource = resources.nextElement();
			dirs.add(new File(resource.getFile())); 
		}
		ArrayList<Class> classes = new ArrayList<Class>();
		for (File directory : dirs) {
			classes.addAll(findClasses(directory, packageName)); //add all found classes to list
		}
		return classes.toArray(new Class[classes.size()]);
	}

	/**
	 * Recursive method used to find all classes in a given directory and
	 * subdirs.
	 * 
	 * @param directory
	 *            The base directory
	 * @param packageName
	 *            The package name for classes found inside the base directory
	 * @return The classes
	 * @throws ClassNotFoundException
	 */
	@SuppressWarnings("unchecked")
	public static List<Class> findClasses(File directory, String packageName)
			throws ClassNotFoundException {
		List<Class> classes = new ArrayList<Class>();
		if (!directory.exists()) {
			return classes; //no classes in an nonexistent directory
		}
		File[] files = directory.listFiles(); 
		for (File file : files) { //loop through all filesystem entries
			if (file.isDirectory()) { //recursively find class files in subdirectories
				classes.addAll(findClasses(file, packageName + "."
						+ file.getName()));
			} else if (file.getName().endsWith(".class")) {
				classes.add(Class.forName(packageName
						+ '.' 
						+ file.getName().substring(0,
								file.getName().length() - 6))); //load classes from .class files
			}
		}
		return classes;
	}
}
