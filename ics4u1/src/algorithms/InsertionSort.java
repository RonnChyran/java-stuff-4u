package algorithms;

public class InsertionSort<E extends Comparable<? super E>> implements SortingAlgorithm<E>{

	@Override
	public void sort(E[] array) {
		for(int i = 0; i < array.length; i++)
		{
			int j = i;
			E x = array[j];
			while(j > 0 && x.compareTo(array[j-1]) < 0)
			{
				array[j] = array[j-1];
				j--;
			}
			array[j] = x;
		}
	}
	
}