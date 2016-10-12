package algorithms;

public class RecursiveInsertionSort<E extends Comparable<? super E>> implements SortingAlgorithm<E>
{	
	@Override
	public void sort(E[] array) {
		this.insSort(array, 0);
	}
	
	private void insSort(E[] array, int i)
	{
		if(i >= array.length) return;
		E x = array[i];
		int j = this.shift(array, x, i);
		array[j] = x;
		this.insSort(array, ++i);
	}
	
	private int shift(E[] array, E x, int j)
	{
		if(!(j > 0 && x.compareTo(array[j-1]) < 0)) return j;
		array[j] = array[j-1];
		return this.shift(array, x, --j);
	}
}