/**
 * Super class for all the sorting algorithms. Keeps track of number
 * of swaps and comparisons required
 * @author Marina Chirchikova
 *
 */
public class Sort {
	protected long comparisons;
	protected long swaps;
	protected Integer[] arr;
	protected String sortType;
	
	/**
	 * Constructor - initializes comparisons and swaps to 0
	 * @param dataset
	 */
	public Sort(DataSet a) {
		comparisons = 0;
		swaps = 0;
		arr = a.getData();
	}
	
	/**
	 * Prints number of swaps and comparisons used by the test for its associated data set
	 */
	public void printInfo(){
		System.out.println("For this data set, " + sortType + " uses " + comparisons + " comparisons and " + swaps + " swaps." );
	}
	
	/**
	 * Finds pivot value
	 * @param array
	 * @param left most index
	 * @param right-most index
	 * @return pivot value (the value in the middle of array)
	 */
	public static <E extends Comparable<? super E>> int findpivot(E[] A, int i, int j)
	  { return (i+j)/2; }
	
	/**
	 * Swaps 2 values in an array
	 * @param array
	 * @param first value to swap
	 * @param second value to swap
	 */
	public static <E extends Comparable<? super E>>void swap(E[] A, int i, int lowindex){
		E temp = A[lowindex];
		A[lowindex] = A[i];
		A[i] = temp;
	}
}
