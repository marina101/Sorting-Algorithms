/**
 * This class implements insertion sort
 * @author user
 *
 */
public class InsertionSort extends Sort{
	
	/**
	 * Constructor
	 * @param data set to be sorted
	 */
	public InsertionSort(DataSet a) {
		super(a);
		super.sortType = "insertion sort";
	}
	
	/**
	 * Runs insertion sort on the associated data set
	 */
	public  <E extends Comparable<? super E>> void sortIt(){
		inssort(arr);
		printInfo();
	}
	
	int j;
	private <E extends Comparable<? super E>> void inssort(E[] A) {
	  for (int i=1 ; i<A.length; i++) {  
		  
		  for (int j = i; (j > 0); j--)
		    { 
			  comparisons += 1;
			  if(A[j].compareTo(A[j-1])<0){
				  Sort.swap(A, j, j-1);
				  swaps +=1;
			  }
		    }
		}
	 
	}//end method
}
