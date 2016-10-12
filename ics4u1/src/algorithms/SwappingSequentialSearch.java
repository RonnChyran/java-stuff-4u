package algorithms;

public class SwappingSequentialSearch<E> implements SearchAlgorithm<E> {

	@Override
	public int search(E[] array, E target) {
		for(int i = 0; i < array.length; i++)
		{
			if(array[i].equals(target))
			{
				if(i > 0) swap(array, i, i-1);
				return i;
			}
		}
		return -1;
	}
	
	private void swap(E[] array, int indexA, int indexB) {
		E temp = array[indexA];
		array[indexA] = array[indexB];
		array[indexB] = temp;
	}
	
}
