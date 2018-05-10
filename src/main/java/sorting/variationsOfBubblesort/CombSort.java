package sorting.variationsOfBubblesort;

import sorting.AbstractSorting;
import util.Util;

/**
 * The combsort algoritm.
 */
public class CombSort<T extends Comparable<T>> extends AbstractSorting<T> {
	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		int gap = rightIndex - leftIndex + 1;
		
		double fator = 1.25;
		gap /= fator;
		
		while(gap >= 1) {
			for(int i = leftIndex; i + gap <= rightIndex; i++) {
				if(array[i].compareTo(array[gap + i]) > 0) {
					Util.swap(array, i, gap + i);
				}
			}
			gap /= fator;
		}
	}
}
