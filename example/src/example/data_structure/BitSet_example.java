package example.data_structure;

import java.util.BitSet;

public class BitSet_example {

	public BitSet_example() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BitSet b1 = new BitSet() ;
		BitSet b2 = new BitSet(5);
		
		System.out.println(b1+" "+b2);
		b1.set(3);
		b2.set(2,4,true);
		System.out.println(b1+" "+b2);
	}

}
