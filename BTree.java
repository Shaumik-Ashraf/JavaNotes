//Binary Tree

public class BTree {

	class BTNode {
		float value;
		int counter;
		BTNode greater, lesser;
		
		public BTNode(float val) {
			value = val;
			counter = 1;
			greater = NULL;
			lesser = NULL;
		}

		public BTNode(float val, BTNode g, BTNode l) {
			this(val);
			greater = g;
			lesser = l;
		}

		float getValue() { return(value); }
		
		int getCounter() { return(counter); }

		
	}


}
