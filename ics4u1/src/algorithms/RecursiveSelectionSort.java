package algorithms;

public class RecursiveSelectionSort<E extends Comparable<? super E>> implements SortingAlgorithm<E>{

	@Override
	public void sort(E[] array) {
		this.selSort(array, array.length - 1);
	}
	
	private void selSort(E[] array, int upperBound)
	{
		if(upperBound < 0) return;
		int greatest = this.greatestIndex(array, upperBound);
		this.swap(array, upperBound, greatest);
		this.selSort(array, --upperBound);
	}
	
	private int greatestIndex(E[] array, int upperBound)
	{
		int maxIndex = 0;
		for (int i = 0; i <= upperBound; i++)
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