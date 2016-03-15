
//STRINGS ONLY

public class LList {

    private LLNode node;

    public LList() {
	node = new LLNode();
    }

    public void add(String s) {
	
    }

    public void add(int i, String s) {

    }

    public String get(int i) {

    }

    public int size() {

    }

}

class LLNode {

    private String s;
    private LLNode next;

    public LLNode() {
	s = new String();
	next = null;
    }

    public LLNode(String s_arg) {
	s = s_arg;
	next = null;
    }

    public LLNode(String s_arg, Node n_arg) {
	s = s_arg;
	next = n_arg;
    }

    public void setString(String s_arg) { s = s_arg };
    public void setNext(Node n_arg) { next = n_arg };

    public String getString() { return(s); }
    public Node getNext() { return(next); }

}
