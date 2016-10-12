package algorithms;

public class ClosestIntegerBinarySearch implements SearchAlgorithm<Integer> {

	
	@Override
	public int search(Integer[] array, Integer target) {
		int top = array.length - 1;
		int bottom = 0;
		int middle = (top + bottom) / 2;
		while (top >= bottom) {
			if(array[middle].equals(target))	{
				return array[middle];
			} else if(array[middle] > target){
				top = middle - 1;
			} else {
				bottom = middle + 1;
			}
			middle = (top + bottom) / 2;
		}
		return middle;
	}

}
