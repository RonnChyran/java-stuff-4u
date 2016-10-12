package algorithms;

public class SelectionSort<E extends Comparable<? super E>> implements SortingAlgorithm<E>{

	@Override
	public void sort(E[] array) {
		for(int i = 0; i < array.length; i++)
		{
			int greatest = this.greatestIndex(array, array.length - i);
			this.swap(array, array.length - 1 - i, greatest);
		}
	}
	
	private int greatestIndex(E[] array, int length)
	{
		int maxIndex = 0;
		for (int i = 0; i < length; i++)
		{
			if(array[i].compareTo(array[maxIndex]) > 0) maxIndex = i;
		}
		return maxIndex;
	}
	
	private void swap(E[] array, int indexA, int indexB) {
		E temp = array[indexA];
		array[indexA] = array[indexB];
		array[indexB] = temp;
	}
	
}