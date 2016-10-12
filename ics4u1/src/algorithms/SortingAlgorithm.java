package algorithms;

public interface SortingAlgorithm<E extends Comparable<? super E>> {
	void sort(E[] array);
}

