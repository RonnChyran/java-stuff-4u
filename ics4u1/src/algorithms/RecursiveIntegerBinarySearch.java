package algorithms;

public class RecursiveIntegerBinarySearch implements SearchAlgorithm<Integer> {

	
	@Override
	public int search(Integer[] array, Integer target) {
		return this.binarySearch(array, target, array.length -1 , 0);
	}
	
	public int binarySearch(Integer[] array, Integer target, int top, int bottom)
	{
		int middle = (top + bottom) / 2;
		if(array[middle].equals(target))
			return middle;
		if(array[middle] > target)
			return this.binarySearch(array, target, middle - 1, bottom);
		if(array[middle] < target)
			return this.binarySearch(array, target, top, middle + 1);
		return -1;
	}

}
