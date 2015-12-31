/**
 * This class implements the selection sort algorithm
 * @author Marina Chirchikova
 *
 */
public class SelectionSort extends Sort{
		
		/**
		 * Constructor
		 * @param data set to be tested
		 */
		public SelectionSort(DataSet a){
			super(a);
			super.sortType= "selection sort";
			
		}
		/**
		 * Applies selection sort to the associated data set
		 */
		public  <E extends Comparable<? super E>> void sortIt(){
			selectsort(arr);
			printInfo();
		}
		
		private <E extends Comparable<? super E>> void selectsort(E[] A) {
		  for (int i=0; i<A.length-1; i++) { // Select i’th record
		    int lowindex = i;                // remember its index
		    for (int j=A.length-1; j>i; j--){ // Find the least value
		      comparisons += 1;
		      if (A[j].compareTo(A[lowindex]) < 0)
		        lowindex = j;        
		      
		    }
		    	Sort.swap(A, i, lowindex);
		    	swaps += 1;
		  }
		}
	
		
		
}
