/**
 * Implements selection sort
 * @author Marina Chirchikova
 *
 */
public class QuickSort extends Sort {
	
	/**
	 * Constructor
	 * @param data set
	 */
	public QuickSort(DataSet a){
		super(a);
		super.sortType= "quick sort";
	}
	
	/**
	 * Runs selection sort on given data set
	 */
	public  <E extends Comparable<? super E>> void sortIt(){
		qsort(arr, 0, arr.length-1);
		printInfo();
	}
	
	
	private <E extends Comparable<? super E>> void qsort(E[] A, int i, int j) 
	{
	int pivotindex = Sort.findpivot(A, i, j);
	Sort.swap(A, pivotindex, j);  
	swaps +=1;
	
	int k = partition(A, i-1, j, A[j]);

	Sort.swap(A, k, j);
	swaps+=1;
	
	if ((k-i) > 1){
		
		qsort(A, i, k-1);
	}
	
	if ((j-k) > 1){
		qsort(A, k+1, j);
	}
	}//method end
	
	//partitions array into subarrays
	private  <E extends Comparable<? super E>> int partition(E[] A, int l, int r, E pivot) 
	{
	  do {
                
	    while (A[++l].compareTo(pivot)<0){
	    	comparisons +=1;
	    }
	    while ((r!=0) && (A[--r].compareTo(pivot)>0)){
	    	comparisons +=1;
	    }
	    Sort.swap(A, l, r);
	    swaps +=1;
	    comparisons +=1; //for do-while loop
	  } while (l < r);
	  Sort.swap(A, l, r);
	  swaps +=1;
	  return l;
	}
	
	
}
