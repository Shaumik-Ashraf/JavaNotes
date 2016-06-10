/*****************************************************
Shaumik Ashraf, James Cao, Max Anderson
APCS2 
HW44 -- Sort of like magic
2016-05-24 
 * class HeapSort
 * HeapSort implemented through ALHeap
 *****************************************************/

import java.util.List;

public class HeapSort {
    
    private static ALHeap _heap;
    
    /* void sort(int[] a)
     *
     * sorts array a using heap sort algorithm
     */
    public static void sort(int[] a) {
        
        _heap = new ALHeap();
        
        for(int i : a) {
            _heap.add( new Integer(i) );
        }
        
        for(int i=0; i<a.length; i++) {
            a[i] = _heap.removeMin().intValue();
        }

    }
    
    /* void sort(Integer[] a)
     *
     * sorts array a using heap sort algorithm
     */
    public static void sort(Integer[] a) {
        
        _heap = new ALHeap();
        
        for(Integer i : a) {
            _heap.add( i );
        }
        
        for(int i=0; i<a.length; i++) {
            a[i] = _heap.removeMin();
        }
        
    }
    
    /* void sort(List<Integer> a)
     *
     * sorts array a using heap sort algorithm
     */
    public static void sort(List<Integer> a) {
        
        _heap = new ALHeap();
        
        for(Integer i : a) {
            _heap.add( i );
        }
        
        for(int i=0; i<a.size(); i++) {
            a.set(i, _heap.removeMin());
        }
        
    }
    
    /* void putSort(int[] a)
     *
     * prints sorted int array a
     * does NOT modify original array
     */
    public static void putSort(int[] a) {
        
        int[] b = a.clone(); //create copy (NOT alias) of array a
        
        HeapSort.sort(b);
        
        System.out.print("[");
        for(int i : b) {
            System.out.print(i + " "); //Idc about the extra space
        }
        System.out.print("]\n");
        
    }
    
    public static void main(String[] args) {
        
        //first parse args as ints of an array and sort
        //ex: java HeapSort 5 2 6 3 will run HeapSort.sort( {5,2,6,3} )
        int a[] = new int[ args.length ];
        boolean good_args = true;
        
        for(int i=0; i<args.length; i++) {
            try {
                a[i] = Integer.parseInt(args[i]);
            } catch( Exception e ) {
                System.out.println("Invalid arg");
                good_args = false;
                break;
            }
        }
        
        if( good_args ) {
            HeapSort.putSort(a);
        }
        
    }
    
}

