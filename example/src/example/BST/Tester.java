package example.BST;

public class Tester {

	public Tester() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
	}
	public static void CheckIsEmpty(Tree T) throws Exception {
		//if T is EmptyBST --> isEmpty() --> true
		//if T is NonEmptyBST --> isEmpty() --> false
		if( T instanceof EmptyBST) {
			if(!T.isEmpty()) {
				throw new Exception("The tree is EmptyBST and is empty");
			}
		}
		else if(T instanceof NonEmptyBST) {
			if(T.isEmpty()) {
				throw new Exception("The tree is NonEmptyBST and is not empty");
			}
		}
	}
	
	public static void CheckAddMemberCardinality(Tree T, int x)throws Exception{
		int nT = (T.add(x)).cardinality();
		// 1. if element added cardinality increased by one.
		if(nT == (T.cardinality()+1)) {
			if(!T.member(x))
				throw new Exception("The cardinality is increased by one but elemnet is already present");
		}
		//2. Element is already present and not added so the cardinality is not increased
		else if(nT == (T.cardinality())) {
			if(T.member(x)) {
				throw new Exception("The cardinality is not increased by one but elemnet is added");
			}
		}
		else
			throw new Exception("Someting else is wrong!!");
	}

}
