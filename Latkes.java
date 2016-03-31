/*
Shaumik Ashraf



*/

/*****************************************************
 * Stack
 * Implements a stack of Strings using an array as underlying container.
 *****************************************************/

/* LIFO */

public class Latkes {

    private String[] _stack;
    private int _stackSize;


    //constructor
    public Latkes( int size ) 
    { 
	if( size<1 ) {
	    //throw new Exception( "Stack BS" );
		size = 10;
	}
	_stack = new String[size];
	_stackSize = 0;
    }

    //means of insertion
    public void push( String s )
    { 
	if( _stackSize+1 > _stack.length ) {
	    //throw new Exception( "StackOverFlowError" );
		String[] temp = new String[ _stack.length * 2 ];
		for(int i=0; i<_stack.length; i++) {
			temp[i] = _stack[i];
		}
		_stack = temp;
		//System.gc();
	}
	_stack[_stackSize] = s;
	_stackSize++;
    }

    //means of removal
    public String pop( ) 
    { 
	if( isEmpty() ) {
		return null;
	}
	_stackSize--;
	return( _stack[_stackSize] );
    }

    //chk for emptiness
    public boolean isEmpty() 
    { 
	return( _stackSize==0 );
    }

    //chk for fullness
    public boolean isFull() 
    {
	return( _stackSize==_stack.length );
    }


    //main method for testing
    public static void main( String[] args ) {
	
	
	Latkes tastyStack = new Latkes(10);

	tastyStack.push("aoo");
	tastyStack.push("boo");
	tastyStack.push("coo");
	tastyStack.push("doo");
	tastyStack.push("eoo");
	tastyStack.push("foo");
	tastyStack.push("goo");
	tastyStack.push("hoo");
	tastyStack.push("ioo");
	tastyStack.push("joo");
	tastyStack.push("coocoo");
	tastyStack.push("cachoo");

	//cachoo
	System.out.println( tastyStack.pop() );
	//coocoo
	System.out.println( tastyStack.pop() );
	//joo
	System.out.println( tastyStack.pop() );
	//ioo
	System.out.println( tastyStack.pop() );
	//hoo
	System.out.println( tastyStack.pop() );
	//goo
	System.out.println( tastyStack.pop() );
	//foo
	System.out.println( tastyStack.pop() );
	//eoo
	System.out.println( tastyStack.pop() );
	//doo
	System.out.println( tastyStack.pop() );
	//coo
	System.out.println( tastyStack.pop() );
	//boo
	System.out.println( tastyStack.pop() );
	//aoo
	System.out.println( tastyStack.pop() );

	//stack empty by now; SOP(null)
	System.out.println( tastyStack.pop() );
	
	/*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
	  ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

    }//end main()

}//end class Latkes
