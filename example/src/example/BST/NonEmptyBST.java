package example.BST;

public class NonEmptyBST<D extends Comparable> implements Tree<D> {
	D data;
	Tree<D> right,left;
	public NonEmptyBST(D ele) {
		data = ele;
		right = new EmptyBST<D>();
		left = new EmptyBST<D>();
		
	}

	public NonEmptyBST(D data2, Tree<D> left2, Tree<D> right2) {
		// TODO Auto-generated constructor stub
		data = data2;
		left = left2;
		right = right2;
	}
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int cardinality() {
		// TODO Auto-generated method stub
		return 1+left.cardinality()+right.cardinality();
	}

	@Override
	public boolean member(D ele) {
		// TODO Auto-generated method stub
		if(data == ele)
			return true;
		else {
			if(ele.compareTo(data) < 0)
				return left.member(ele);
			else
				return right.member(ele);
		}
	}

	@Override
	public NonEmptyBST<D> add(D ele) {
		// TODO Auto-generated method stub
		if(data == ele)
			return this;
		else {
			if(ele.compareTo(data) < 0)
				return new NonEmptyBST<D>(data , left.add(ele),right);
			else
				return new NonEmptyBST<D>(data , left ,right.add(ele));
		}
	}
}
