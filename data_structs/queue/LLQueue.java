/* Shaumik Ashraf
 * APCS2 pd9
 * HW25 - Brits Do Not Wait In Line
 * 2016-04-05
 */

/*****************************************************
 * class LLQueue
 * uses a linked list to implement a QUEUE
 * (a collection with FIFO property)
 *
 *       -------------------------------
 *   end |  --->   Q U E U E   --->    | front
 *       -------------------------------
 *
 ******************************************************/

//import java.util.NoSuchElementException;
//import java.util.RuntimException;

public class LLQueue<T> implements Queue<T> {

    private LLNode<T> _front, _end;

    // default constructor creates an empty queue
    public LLQueue()
    { 
		_front = null;
		_end = _front;
    }

    // means of adding a thing to the collection
    public void enqueue( T enQVal ) 
    {
		LLNode<T> temp = new LLNode(enQVal, null);
		if( isEmpty() ) {
			_front = temp;
			_end = temp;
		}
		else {
			_end.setNext(temp);
			_end = temp;
		}
    }//O(1)


    // means of removing a thing from the collection
    // remove and return thing at front of queue
    // assume _queue ! empty
    public T dequeue() 
    { 
	LLNode<T> temp = _front;
	_front = temp.getNext();
	return( temp.getValue() );
    }//O(1)


    // means of peeking at thing next in line for removal
    public T peekFront() 
    {
	return( _front.getValue() );
    }//O(1)


    public boolean isEmpty() 
    {
	int ctr=0;
	LLNode<T> nav = _front;

	if( _front==null ) {
	    return( true );
	}
	else return( false );

	/*
	while( nav!=_end ) {
	    nav = nav.getNext();
	    ctr++;
	}
	ctr += 1;

	return(ctr);
	*/
    }//O(1)


    // print each node, separated by spaces
    public String toString() 
    { 
	String ret = "[";

	for(LLNode<T> nav=_front; nav!=null; nav=nav.getNext() ) {
	    ret += (nav.toString() + ", ");
	}

	ret += "]";
	return(ret);
    }//O(1)


    public static void main( String[] args ) {

	
	Queue<String> LLQueuelJ = new LLQueue<String>();

	System.out.println("\nnow enqueuing thrice..."); 
	LLQueuelJ.enqueue("James");
	LLQueuelJ.enqueue("Todd");
	LLQueuelJ.enqueue("Smith");

	System.out.println("\nnow testing toString()..."); 
	System.out.println( LLQueuelJ ); //for testing toString()...

	System.out.println("\nnow dequeuing thrice..."); 
	System.out.println( LLQueuelJ.dequeue() );
	System.out.println( LLQueuelJ.dequeue() );
	System.out.println( LLQueuelJ.dequeue() );

	System.out.println("\nDequeuing from empty queue should yield error..."); 
	System.out.println( LLQueuelJ.dequeue() );
	/*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
	  ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

    }//end main

}//end class LLQueue
