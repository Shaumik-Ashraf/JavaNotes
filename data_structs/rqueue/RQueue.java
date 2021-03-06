/*****************************************************
 * class RQueue
 * A linked-list-based, randomized queue
 * (a collection with FIIDKO property)
 *
 *       -------------------------------
 *   end |  --->   Q U E U E   --->    | front
 *       -------------------------------
 *
 *  linked list points opposite direction for O(1) en/dequeuing
 *            N <- N <- ... <- N <- N
 *      _end -^                     ^- _front
 *
 ******************************************************/


public class RQueue<T> implements Queue<T> {

    private LLNode<T> _front, _end;
    private int _size;


    // default constructor creates an empty queue
    public RQueue() 
	{
	    _front = _end = null;
	    _size = 0;
	}//end default constructor


    public void enqueue( T enQVal ) 
    {
	LLNode<T> temp = new LLNode(enQVal, null);

	_end.setNext(temp);
	_end = temp;

	_size++;
    }//end enqueue()


    // remove and return thing at front of queue
    // assume _queue ! empty
    public T dequeue() 
    { 
	LLNode<T> temp = _front;

	_front = _front.getNext();
	size--;

	return( temp.getValue() );
	//free(temp);
    }//end dequeue()


    public T peekFront() 
    {
	return( _front.getValue() );
    }


    /******************************************
     * void sample() -- a means of "shuffling" the queue
     * Algo:
     * ...
     * 
    ******************************************/
    public void sample () 
    {
	
    }//end sample()


    public boolean isEmpty() 
    {
	return( _size==0 );
    } //O(?)


    // print each node, separated by spaces
    public String toString() 
    { 
	String ret = "[";
	LLNode<T> nav = _front;

        while( nav.getNext()!=null ) {
	    ret += (nav.toString + ", ");
	    nav = nav.getNext();
	}

	

    }//end toString()



    //main method for testing
    public static void main( String[] args ) {

	/*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v

	Queue<String> PirateQueue = new RQueue<String>();

	System.out.println("\nnow enqueuing..."); 
	PirateQueue.enqueue("Dread");
	PirateQueue.enqueue("Pirate");
	PirateQueue.enqueue("Robert");
	PirateQueue.enqueue("Blackbeard");
	PirateQueue.enqueue("Peter");
	PirateQueue.enqueue("Stuyvesant");

	System.out.println("\nnow testing toString()..."); 
	System.out.println( PirateQueue ); //for testing toString()...

	System.out.println("\nnow dequeuing..."); 
	System.out.println( PirateQueue.dequeue() );
	System.out.println( PirateQueue.dequeue() );
	System.out.println( PirateQueue.dequeue() );
	System.out.println( PirateQueue.dequeue() );
	System.out.println( PirateQueue.dequeue() );
	System.out.println( PirateQueue.dequeue() );

	System.out.println("\nnow dequeuing fr empty queue..."); 
	System.out.println( PirateQueue.dequeue() );

	^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

    }//end main

}//end class RQueue
