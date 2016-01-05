/* Shaumik Ashraf
 * APCS1 pd9
 * HW#53 - Poker Face
 * 2015-01-05
 */
 
/* Q1: Is more work done toward beginning or end of insertion sort? Why?
 * A: More work is done torward the end because the sorted region increases causing more comparisons
 * Q2: For n items, how many passes are necessary to sort?
 * A: n-1 passes are necessary to sort n items
 * Q3: What is known after pass p, and how do you know it?
 * A: After p passes, the first p+1 elements are sorted; this is because the sorted region starts at 1, and gains 1 element per pass
 * Q4: What is the runtime classification of this sort?
 * A: O=n^2
 */


/*======================================
  class InsertionSort -- implements InsertionSort algorithm
  ======================================*/

import java.util.ArrayList;

public class InsertionSort {

    //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
    //precond: lo < hi && size > 0
    //postcond: returns an ArrayList of random integers
    //          from lo to hi, inclusive
    public static ArrayList populate( int size, int lo, int hi ) {
	ArrayList<Integer> retAL = new ArrayList<Integer>();
	while( size > 0 ) {
	    //     offset + rand int on interval [lo,hi]
	    retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
	    size--;
	}
	return retAL;
    }

    //randomly rearrange elements of an ArrayList
    public static void shuffle( ArrayList al ) {
	int randomIndex;
        for( int i = al.size()-1; i > 0; i-- ) {
	    //pick an index at random
            randomIndex = (int)( (i+1) * Math.random() );
	    //swap the values at position i and randomIndex
            al.set( i, al.set( randomIndex, al.get(i) ) );
        }
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // VOID version of SelectionSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void insertionSortV( ArrayList<Comparable> data ) {	    
	
	for(int i=1; i<data.size(); i++) {  //passes
	    for(int j=i; j>0; j--) {            //compare target to sorted region right to left
		if( data.get(i).compareTo(data.get(j-1)) > 0 ) {  //if target less than sorted region target
		    data.add(i, data.remove(i-1));                //swap
		}
	    }
	}

    }//end selectionSort -- O() = n^2


    // ArrayList-returning selectionSort
    // postcondition: order of input ArrayList's elements unchanged
    //                Returns sorted copy of input ArrayList.
    public static ArrayList<Comparable> insertionSort( ArrayList<Comparable> input ) {

	ArrayList<Comparable> rA = new ArrayList<Comparable>( input.size() );
	int len = input.size();
	
	rA.add(0, input.remove(0));
	for(int i=0; i<len; i++) {
		for(int j=i; j>=0; j--) {
			if( input.get(0).compareTo( rA.get(j) ) > 0 ) {
				rA.add( j, input.remove(0) );
				break;
			}
			if( j==0 ) {
				rA.add(0, input.remove(i));
			}
		}
	}

    }//end selectionSort -- O(?)


    //main method for testing
    public static void main( String [] args ) {
	
	  ArrayList glen = new ArrayList<Integer>();
	  glen.add(7);
	  glen.add(1);
	  glen.add(5);
	  glen.add(12);
	  glen.add(3);
	  System.out.println( "ArrayList glen before sorting:\n" + glen );
	  insertionSortV(glen);
	  System.out.println( "ArrayList glen after sorting:\n" + glen );
	
	  ArrayList coco = populate( 10, 1, 1000 );
	  System.out.println( "ArrayList coco before sorting:\n" + coco );
	  insertionSortV(coco);
	  System.out.println( "ArrayList coco after sorting:\n" + coco );
/*
	  ArrayList glen = new ArrayList<Integer>();
	  glen.add(7);
	  glen.add(1);
	  glen.add(5);
	  glen.add(12);
	  glen.add(3);
	  System.out.println( "ArrayList glen before sorting:\n" + glen );
	  ArrayList glenSorted = insertionSort( glen );
	  System.out.println( "sorted version of ArrayList glen:\n" 
	  + glenSorted );
	  System.out.println( "ArrayList glen after sorting:\n" + glen );

	  ArrayList coco = populate( 10, 1, 1000 );
	  System.out.println( "ArrayList coco before sorting:\n" + coco );
	  ArrayList cocoSorted = insertionSort( coco );
	  System.out.println( "sorted version of ArrayList coco:\n" 
	  + cocoSorted );
	  System.out.println( "ArrayList coco after sorting:\n" + coco );
	  System.out.println( coco );
*/

    }//end main

}//end class SelectionSort
