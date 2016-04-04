
import java.util.ArrayList;

public class ALStack<T> implements Stack<T> {

    private ArrayList<T> _stack;
    //private int size; I am counting on ArrayList keeping track of size, without O(n) time

    public ALStack<T>() {
	_stack = new ArrayList<T>();
    }

    public ALStack<T>(int size) {
	_stack = new ArrayList<T>( size );
    }

    public boolean isEmpty() { 
	return( _stack.size()==0 );
    }

    public T peek() {
	return( _stack.get( _stack.size()-1 ) );
    }

    public T pop() {
	return( _stack.remove( _stack.size()-1 ) );
    }

    public void push( T x ) {
	_stack.add( x );
    }

    public int size() {
	return( _stack.size() );
    }

}
