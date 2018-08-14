package example.BST;

public class BST {

	public BST() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		EmptyBST e = new EmptyBST();
		NonEmptyBST ne = new NonEmptyBST(4);
		Tester.CheckIsEmpty(e);
		Tester.CheckIsEmpty(ne);
		Tester.CheckAddMemberCardinality(e, 4);
		Tester.CheckAddMemberCardinality(ne, 0);
		Tester.CheckAddMemberCardinality(ne, 0);
		System.out.println("All good");
	}

}
