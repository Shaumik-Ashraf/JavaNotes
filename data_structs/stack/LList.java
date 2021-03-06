/*
Shaumik Ashraf
APCS2 pd9
HW12 -- Truckin' Through the Night
2016-03-15
*/


//STRINGS ONLY

public class LList {

    private LLNode head;

    public LList() {
		head = new LLNode();
    }

	public LList(String[] arr) {
		head = new LLNode();
		for(String s : arr) {
			add(s);
		}
	}

	//override toString method, for debugging
	//i shouldve used size and get instead of redefining -_-
	public String toString() {
		String ret = new String("[");
		String s;
		LLNode nav = head;

		while( nav.getNext()!=null ) {
			s = nav.getString();
			nav = nav.getNext();
			ret += (s + ", ");
		}

		ret += (nav.getString() + "]\n");

		return(ret);
	}

	//helper function that returns last node of linkedlist head
	private LLNode iterate() {
		LLNode nav = head;

		while( nav.getNext()!=null ) {
			nav = nav.getNext();
		}

		return( nav );
	}

	//helper function that returns i-th node of linkedlist head
	private LLNode iterate(int i) {
		LLNode nav = head;
		int c=0;

		while( nav.getNext()!=null && c<i ) {
			nav = nav.getNext();
			c++;
		}

		return( nav );
	}

    public void add(String s) {
		LLNode node = iterate();

		if( node==head && head.getString()==null ) {
			head.setString(s);
		}
		else {
			node.setNext( new LLNode(s) );
		}
    }

    public void add(int i, String s) {
		LLNode node = iterate(i);

		if( node==head && head.getString()==null ) {
			head.setString(s);
		}
		else {
			node.setNext( new LLNode(s) );
		}
    }

    public String get(int i) {
		LLNode nav = iterate(i);
		return( nav.getString() );
    }

    public int size() {
		LLNode nav = head;
		int i;

		i=0;
		while( nav.getNext()!=null ) {
			nav = nav.getNext();
			i++;
		}

		return( i+1 );
    }

	/*================================================
	=========TESTING==================================
	================================================*/
	public static void main(String[] args) {

		LList listy = new LList();

		listy.add("Hello");
		listy.add("this");
		listy.add("is");
		listy.add("aey");
		listy.add("list");

		System.out.println( "A LinkedList::\nsize:" + listy.size() + "\nList:" + listy );
		System.out.println( listy.get(5) + " " + listy.get(1) + " " + listy.get(2) );

	}


}

class LLNode {

    private String s;
    private LLNode next;

    public LLNode() {
		s = null;
		next = null;
    }

    public LLNode(String s_arg) {
		s = s_arg;
		next = null;
    }

    public LLNode(String s_arg, LLNode n_arg) {
		s = s_arg;
		next = n_arg;
    }

    public void setString(String s_arg) { s = s_arg; }
    public void setNext(LLNode n_arg) { next = n_arg; }

    public String getString() { return(s); }
    public LLNode getNext() { return(next); }

}
