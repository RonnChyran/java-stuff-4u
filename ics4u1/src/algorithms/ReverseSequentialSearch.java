package algorithms;

public class ReverseSequentialSearch<E> implements SearchAlgorithm<E> {

	@Override
	public int search(E[] array, E target) {
		for(int i = 0; i < array.length; i++)
		{
			if(array[array.length - (i + 1)].equals(target))
				return i;
		}
		return -1;
	}

}
