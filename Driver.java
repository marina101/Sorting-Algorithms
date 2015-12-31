/**
 * This class is the driver to test out various sorting algorithms
 * on five different data sets
 * @author Marina Chirchikova
 *
 */
public class Driver {
	public static void main(String[] args){
		
		//DataSet A
		DataSet A = new DataSet(100);
		System.out.println("Comparing sorts for data set A");
		
		//make a deep copy of original data set to not modify original values
		DataSet sda = new DataSet(A);
		SelectionSort sa = new SelectionSort(sda);
		sa.sortIt();
		
		//using a deep copy of same original A data set
		DataSet ida = new DataSet(A);
		InsertionSort ia = new InsertionSort(ida);
		ia.sortIt();
		
		DataSet hda = new DataSet(A);
		HeapSort ha = new HeapSort(hda);
		ha.sortIt();
		
		DataSet mda = new DataSet(A);
		MergeSort ma = new MergeSort(mda);
		ma.sortIt();
		
		DataSet qda = new DataSet(A); 
		QuickSort qa = new QuickSort(qda);
		qa.sortIt();
		
		
		//DataSet B
		DataSet B = new DataSet(1000);
		System.out.println("Comparing sorts for data set B");
		
		DataSet sdb = new DataSet(B);
		SelectionSort sb = new SelectionSort(sdb);
		sb.sortIt();
		
		DataSet idb = new DataSet(B);
		InsertionSort ib = new InsertionSort(idb);
		ib.sortIt();
		
		DataSet hdb = new DataSet(B);
		HeapSort hb = new HeapSort(hdb);
		hb.sortIt();
		
		DataSet mdb = new DataSet(B);
		MergeSort mb = new MergeSort(mdb);
		mb.sortIt();
		
		DataSet qdb = new DataSet(B);
		QuickSort qb = new QuickSort(qdb);
		qb.sortIt();
		
		//DataSet C
		DataSet C = new DataSet(10000);
		System.out.println("Comparing sorts for data set C");
		
		DataSet sdc = new DataSet(C);
		SelectionSort sc = new SelectionSort(sdc);
		sc.sortIt();
		
		DataSet idc = new DataSet(C);
		InsertionSort ic = new InsertionSort(idc);
		ic.sortIt();
		
		DataSet hdc = new DataSet(C);
		HeapSort hc = new HeapSort(hdc);
		hc.sortIt();
		
		DataSet mdc = new DataSet(C);
		MergeSort mc = new MergeSort(mdc);
		mc.sortIt();
		
		DataSet qdc = new DataSet(C);
		QuickSort qc = new QuickSort(qdc);
		qc.sortIt();
		
		//DataSet D
		System.out.println("Now running tests on DataSet D");
		DataSet D = new DataSet("back");
		
		DataSet sdd = new DataSet(D);
		SelectionSort sd = new SelectionSort(sdd);
		sd.sortIt();
		
		DataSet idd = new DataSet(D);
		InsertionSort id = new InsertionSort(idd);
		id.sortIt();
		
		DataSet hdd = new DataSet(D);
		HeapSort hd = new HeapSort(hdd);
		hd.sortIt();
		
		DataSet mdd = new DataSet(D);
		MergeSort md = new MergeSort(mdd);
		md.sortIt();
		
		DataSet qdd = new DataSet(D);
		QuickSort qd = new QuickSort(qdd);
		qd.sortIt();
		
		//Data Set E
		System.out.println("Now running tests on DataSet E");
		DataSet E = new DataSet("odd");
		
		DataSet sde = new DataSet(E);
		SelectionSort se = new SelectionSort(sde);
		se.sortIt();
		
		DataSet ide = new DataSet(E);
		InsertionSort ie = new InsertionSort(ide);
		ie.sortIt();
		
		DataSet hde = new DataSet(E);
		HeapSort he = new HeapSort(hde);
		he.sortIt();
		
		DataSet mde = new DataSet(E);
		MergeSort me = new MergeSort(mde);
		me.sortIt();
		
		DataSet qde = new DataSet(E);
		QuickSort qe = new QuickSort(qde);
		qe.sortIt();
		
		
		
		
	}//main method
}
