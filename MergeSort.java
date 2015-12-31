/**
 * Implements merge sort
 * @author Marina Chirchikova
 *
 */
public class MergeSort extends Sort {
	
	/**
	 * Constructor
	 * @param data set
	 */
	public MergeSort(DataSet a) {
		super(a);
		super.sortType = "merge sort";
	}

	/**
	 * runs merge sort on associated data set
	 */
	public  <E extends Comparable<? super E>> void sortIt(){
		Integer[] temp = new Integer[arr.length];
		mergesort(arr, temp, 0, arr.length-1);
		printInfo();
	}
	

	private <E extends Comparable<? super E>> void mergesort(E[] A, E[] temp, int l, int r) {
	  int mid = (l+r)/2;
	  comparisons += 1;
	  if (l == r) return;
	  mergesort(A, temp, l, mid);
	  mergesort(A, temp, mid+1, r); // Mergesort second half
	  for (int i=l; i<=r; i++) {         // Copy subarray to temp
	    temp[i] = A[i];
	  }
	  // Do the merge operation back to A
	  int i1 = l; int i2 = mid + 1;
	  for (int curr=l; curr<=r; curr++) {  
		
	    if (i1 == mid+1)       {       // Left sublist exhausted
	    comparisons += 1;
	      A[curr] = temp[i2++];
	      swaps +=1;
	    }
	    
	    else if (i2 > r) {              // Right sublist exhausted
	    	comparisons += 2;
	      A[curr] = temp[i1++];
	      swaps +=1;
	    }
	    
	    else if (temp[i1].compareTo(temp[i2])<0){ // Get smaller
	    	comparisons += 3;
	      swaps += 1;
	    	A[curr] = temp[i1++];
	    }
	    else {
	    	comparisons +=3;
	    	A[curr] = temp[i2++];
	    	swaps += 1;
	    }
	  }
	}
}
