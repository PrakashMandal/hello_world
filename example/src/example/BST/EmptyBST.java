/**
 * 
 */
package example.BST;

/**
 * @author Prakash
 *
 */
public class EmptyBST<D extends Comparable> implements Tree<D> {

	/**
	 * 
	 */
	public EmptyBST() {
		// TODO Auto-generated constructor stub
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int cardinality() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean member(D ele) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public NonEmptyBST<D> add(D ele) {
		// TODO Auto-generated method stub
		return new NonEmptyBST<D>(ele);
	}

}
