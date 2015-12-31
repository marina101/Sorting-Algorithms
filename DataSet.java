import java.util.Random;

/**
 * This class generates several different possible data sets:
 * a) a data set of random number of the requested size
 * b) a data set of integers from 10000 going back to 1
 * c) a data set of odds/evens
 * @author Marina Chirchikova
 *
 */
public class DataSet {
	private Integer[] array;
	int size = 0;
		
	/**
	 * Null constructor
	 */
	public DataSet(){
		array = null;
		size = 0;
	}
	
	
	/**
	 * Initializes an array of random Integers of size n
	 * @param n size of array to generate
	 */
	public DataSet(int n){
		size = n;
		array = new Integer[n];
		Random randomGenerator = new Random();

		for(int i = 0; i < n; i++){
			array[i] = randomGenerator.nextInt(10001);
		}
		
		
	}
	
	/**
	 * If s = "back", generates an array of 10000 numbers, counting backward from
	 * 10000 in intervals of 1, until 1
	 * If s is any other string, generates an array of 10000 numbers consisting
	 * of 5000 odd numbers from 1..9999, and then 5000 even number from 2..10000
	 * @param s specifies if you want the array of numbers going "back", if s is
	 * any other value, generates the array of odds and evens
	 */
	public DataSet(String s){
		array = new Integer[10000];
		size = 10000;
		//genenrates data going backwards from 10000 to 1
		if(s.equals("back")){
			
			for(int i = 10000, j=0; i>0; i--, j++){
				array[j] = i;
				
			}//for loop
		}
		//generate 10000 number consisting of 5000 odd number 1..9999, then 5000 even
		//numbers from 2..10000
		else{
			for(int i = 1, j = 0; i<=9999; i+=2, j++){
				array[j] = i;	
			}
			for(int i = 2, j = 5000; i<=10000; i+=2, j++){
				array[j] = i;
			}
		}
	}
	
	/**
	 * Copy constructor
	 * @param the DataSet to be copied
	 */
	public DataSet(DataSet original){
		this.size = original.size;
		
			array = original.array.clone();
		
	}

	/**
	 * Returns the array of integers that was generate
	 * @return array of Integers
	 */
	public Integer[] getData(){
		return array;
	}
	
	public void setData(Integer[] i){
		array = i.clone();
		size = array.length;
	}
	
	/**
	 * Prints the array inside the data set
	 */
	public void printData(){
		for(int i = 0; i<array.length; i++){
			System.out.println(array[i]);
		}
	}
	
	
	
	
}
