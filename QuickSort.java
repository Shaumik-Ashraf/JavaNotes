/*
Shaumik Ashraf
APCS2 -- pd9
HW34 -- An Optimized Version of This is Java’s Built-in Sort Mechanism
2016-04-19
 */

/*****************************************************
 * class QuickSort
 * Implements quicksort algo to sort an array of ints in place
 *
 * 1. Summary of QuickSort algorithm:
 * QSort(arr): 
 *
 * 2a. Worst pivot choice and associated runtime: 
 *
 * 2b. Best pivot choice and associated runtime:
 *
 * 3. Approach to handling duplicate values in array:
 *
 *****************************************************/

public class QuickSort {

    //--------------v  HELPER METHODS  v--------------
    //swap values at indices x, y in array o
    public static void swap( int x, int y, int[] o ) {
		int tmp = o[x];
		o[x] = o[y];
		o[y] = tmp;
    }

    //print input array 
    public static void printArr( int[] a ) {
		for ( int o : a )
			System.out.print( o + " " );
		System.out.println();
    }

    //shuffle elements of input array
    public static void shuffle( int[] d ) {
		int tmp;
		int swapPos;
		for( int i = 0; i < d.length; i++ ) {
			tmp = d[i];
			swapPos = i + (int)( (d.length - i) * Math.random() );
			swap( i, swapPos, d );
		}
    }

    //return int array of size s, with each element fr range [0,maxVal)
    public static int[] buildArray( int s, int maxVal ) {
		int[] retArr = new int[s];
		for( int i = 0; i < retArr.length; i++ )
			retArr[i] = (int)( maxVal * Math.random() );
		return retArr;
    }
    //--------------^  HELPER METHODS  ^--------------



    /*****************************************************
     * void qsort(int[])
     * @param d -- array of ints to be sorted in place
     *****************************************************/
    public static void qsort( int[] d ) {
		/*
		//for testing helper function...
		qsorthelper(d, d.length-1, 0, 0);
		*/
		
		int high = d.length-1;
		int low = 0;
		
		qsorthelper(d, high, low);
		
    }

    //my helper methods
	//helper function
	private static void qsorthelper( int[]d, int high, int low) {
		if( !(low<high) ) {
			//done!
		}
		else {
			int pivot = partition(d, high, low, (int)(Math.random()*(high-low))+low);
			qsorthelper(d, pivot, low, (int)(Math.random()*(pivot-low))+low);
			qsorthelper(d, high, pivot, (int)(Math.random()*(pivot-low))+);
		}
	}
	
	//partition function
	private static int partition(int[] d, int high, int low, int pivotIndex) {
		int pivotValue = d[pivotIndex];
		int lowerIndex = low;
		int upperIndex = high-1;
	
		swap(pivotIndex, high, d);
		pivotIndex = high;
	
		while( lowerIndex < upperIndex ) {
		
			if( d[lowerIndex] < pivotValue ) lowerIndex++;
			if( d[upperIndex] > pivotValue ) upperIndex--;
			if( d[upperIndex] < pivotValue && d[lowerIndex] > pivotValue ) {
				swap(upperIndex, lowerIndex, d);
			}
			//duplicate pivot value case...
		}
	
		swap( lowerIndex, pivotIndex, d );
		pivotIndex = lowerIndex;
		return( pivotIndex );
		
	}

    //main method for testing
    public static void main( String[] args ) {

	

	//get-it-up-and-running, static test case:
	int [] arr1 = {7,1,5,12,3};
	System.out.println("\narr1 init'd to: " );
	printArr(arr1);

	qsort( arr1 );	
       	System.out.println("arr1 after qsort: " );
	printArr(arr1);
 
	// randomly-generated arrays of n distinct vals
	int[] arrN = new int[10];
	for( int i = 0; i < arrN.length; i++ )
	    arrN[i] = i;
       
	System.out.println("\narrN init'd to: " );
	printArr(arrN);

       	shuffle(arrN);
       	System.out.println("arrN post-shuffle: " );
	printArr(arrN);

	qsort( arrN );
	System.out.println("arrN after sort: " );
	printArr(arrN);
/*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y)	
	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/


	/*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y) 

	//get-it-up-and-running, static test case w/ dupes:
	int [] arr2 = {7,1,5,12,3,7};
	System.out.println("\narr2 init'd to: " );
	printArr(arr2);

	qsort( arr2 );	
       	System.out.println("arr2 after qsort: " );
	printArr(arr2);


	// arrays of randomly generated ints
	int[] arrMatey = new int[20];
	for( int i = 0; i < arrMatey.length; i++ )
	    arrMatey[i] = (int)( 48 * Math.random() );
       
	System.out.println("\narrMatey init'd to: " );
	printArr(arrMatey);

       	shuffle(arrMatey);
       	System.out.println("arrMatey post-shuffle: " );
	printArr(arrMatey);

	qsort( arrMatey );
	System.out.println("arrMatey after sort: " );
	printArr(arrMatey);
	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

    }//end main

}//end class QuickSort
