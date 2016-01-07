/* Shaumik Ashraf
 * APCS1 pd9
 * HW54 - Red vs Blue
 * 2016-01-05
 */

/*====================================
  class Matrix -- models a square matrix

  TASK: Implement methods below.
        Categorize runtime of each. 
        Test in your main method.
  ====================================*/ 

public class Matrix {

    //constant for default matrix size
    private final static int DEFAULT_SIZE = 2;

    private Object[][] matrix;


    //default constructor intializes a DEFAULT_SIZE*DEFAULT_SIZE matrix
    public Matrix( ) {
	matrix = new Object[DEFAULT_SIZE][DEFAULT_SIZE];
    } //O(1)


    //constructor intializes an a*a matrix
    public Matrix( int a ) {
	matrix = new Object[a][a];
    } //O(1)


    //return size of this matrix, where size is 1 dimension
    //changed to public
    public int size() {
	return( matrix.length );
    } //O(1)



    //return the item at the specified row & column   
    //changed to public
    public Object get( int r, int c ) {
	return( matrix[r][c] );
    } //O(1)



    //return true if this matrix is empty, false otherwise
    //I'm assuming this means matrix is empty at index r,c
    //also, changed to public
    public boolean isEmpty( int r, int c ) {
	return( matrix[r][c]==null );
    } //O(1)



    //overwrite item at specified row and column with newVal
    //return old value
    private Object set( int r, int c, Object newVal ) {
	Object temp = matrix[r][c];
	
	matrix[r][c] = newVal;
	return(temp);
    } //O(1)



    //return String representation of this matrix
    // (make it look like a matrix)
    public String toString() {
    	String s = "";
    	
	for(int i=0; i<matrix.length; i++) {  //iterate thru rows
		s += "[";
		for(int j=0; j<matrix[i].length; j++) {   //iterate thru cols
			s += matrix[i][j];
			if( j+1 != matrix[i].length ) {   //add comma unless last element of row
				s += ",";
			}
		}
		s += ( (i+1 != matrix.length) ? "]\n" : "]" ); //because I can
	}
	
	return(s);
    } //O(n^2)



    //override inherited equals method
    //criteria for equality: matrices have identical dimensions,
    //and identical values in each slot
    public boolean equals( Object rightSide ) {
    	
    	if( matrix==rightSide ) return( true );  //equal pointers/aliasing
	else if( !(rightSide instanceof Matrix) ) return(false);
	else if( matrix.length != ((Matrix)rightSide).size() ) return(false);
	else {
		for(int i=0; i<matrix.length; i++) {   //cudve used for-each loops
			for(int j=0; j<matrix.length; j++) {
				if( matrix[i][j]!=((Matrix)rightSide).get(i,j) ) {
					return(false);  //this breaks loops and exits function
				}
			}
		}
		return(true);  //function never exited, everything must be equal
	}
	
    } //O(n^2) (potentially)



    //swap two columns of this matrix 
    //(1,1) is top left corner of matrix
    //row values increase going down
    //column value increase L-to-R
    //I'm assumin c1 and c2 are positive
    public void swapColumns( int c1, int c2  ) {
	c1 -= 1;
	c2 -= 1;
	Object temp;
	
	for(int i=0; i<matrix.length; i++) {
		temp = matrix[i][c1];
		matrix[i][c1] = matrix[i][c2];
		matrix[i][c2] = temp;
	}
    } //O(n)


    //swap two rows of this matrix 
    //(1,1) is top left corner of matrix
    //row values increase going down
    //column value increase L-to-R
    //I'm assumin r1 and r2 are positive
    public void swapRows( int r1, int r2  ) {
	r1 -= 1;
	r2 -= 1;
	Object[] temp = new Object[matrix.length];
	
	for(int i=0; i<matrix.length; i++) {
		temp[i] = matrix[r1][i];
		matrix[r1][i] = matrix[r2][i];
		matrix[r2][i] = temp[i];
	}
    } //O(n)


    //main method for testing
    public static void main( String[] args ) {

	Matrix A = new Matrix();
	Matrix B = new Matrix(3);
	
	System.out.println("Testing Matrix class");
	System.out.println("Testing size method---------------------------");
	System.out.println("Expected 2; Size of A: " + A.size());
	System.out.println("Expected 3; Size of B: " + B.size());
	
	System.out.println("Testing set & toString method---------------------------");
	for(int i=0; i<A.size(); i++) {
		for(int j=0; j<A.size(); j++) {
			A.set(i, j, new Integer( (int)(Math.random()*100) ) );
		}
	}
	for(int i=0; i<B.size(); i++) {
		for(int j=0; j<B.size(); j++) {
			B.set(i, j, new Integer( (int)(Math.random()*100) ) );
		}
	}
	System.out.println("Matrix A:");
	System.out.println(A);
	System.out.println("Matrix B:");
	System.out.println(B);
	
	System.out.println("Testing set & get & equals method-------------------------------------");
	System.out.println("getting 1,1 of A: "  + A.get(1,1));
	System.out.println("setting 1,1 of A to 'C': "  + A.set(1,1,new String("C")));
	System.out.println("getting 1,1 of A: "  + A.get(1,1));
	System.out.println("getting 1,2 of B: "  + B.get(1,2));
	System.out.println("setting 1,2 of B to 'C': "  + B.set(1,2,new String("S")));
	System.out.println("getting 1,2 of B: "  + B.get(1,2));
	System.out.println("Does A equal B? " + A.equals(B));
	
	System.out.println("Testing swapRows & swapCols method-------------------------------------");
	System.out.println("Matrix B:\n" + B);
	System.out.println("Swapping rows 1,3");
	B.swapRows(1,3);
	System.out.println("Matrix B:\n" + B);
	System.out.println("Swapping cols 2,3");
	B.swapColumns(2,3);
	System.out.println("Matrix B:\n" + B);
	
	System.out.println("Part II---------------------------------------------------------------------");
    	
    }

}//end class Matrix
