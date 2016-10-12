package algorithms;

public class SequentialSearch<E> implements SearchAlgorithm<E> {

	@Override
	public int search(E[] array, E target) {
		for(int i = 0; i < array.length; i++)
		{
			if(array[i].equals(target))
				return i;
		}
		return -1;
	}

}
