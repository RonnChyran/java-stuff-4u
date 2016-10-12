package algorithms;

public class BubbleSort<E extends Comparable<? super E>> implements SortingAlgorithm<E>{

	@Override
	public void sort(E[] array) {
		boolean swapped = true;
		for (int i = 0; swapped; i++)
		{
			swapped = false;
			for(int j = 0; j < array.length - i - 1; j++)
			{
				if(array[j].compareTo(array[j + 1]) > 0){
					this.swap(array, j, j + 1);
					swapped = true;
				}
			}
		}
	}
	
	private void swap(E[] array, int indexA, int indexB) {
		E temp = array[indexA];
		array[indexA] = array[indexB];
		array[indexB] = temp;
	}
	
}