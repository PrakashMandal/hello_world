package example.data_structure;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		linkList L1 = new linkList();
		for(int i=0;i<m;i++)
			L1.insert(sc.nextInt());
		/*
		int n = sc.nextInt();
		linkList L2 = new linkList();
		while(n!=0) {
			L2.insert(sc.nextInt());
			n--;
		}*/
		sc.close();
		Node head;
		ArrayList<Node> list = new ArrayList<Node>();
		head = removeDuplicate(L1.getHead());
		System.out.println("Elements : ");
		while(head!=null) {
			list.add(head);
			System.out.print(head.data+" ");
			head = head.next;
		}
		for(int i=0;i<m;i++)
			System.out.println(list.get(i).data);
	}
	static Node removeDuplicate(Node head) {
		Node temp = head;
        Node Next;
        while(temp !=null){
            Next = temp;
            System.out.print("\n"+temp.data+" : ");
            while(Next.next != null){
            	System.out.print(Next.data+" ");
            	if(Next.next.data == temp.data) {
            		Next.next = Next.next.next;
            	}
            	else Next = Next.next;
        	}
            temp = temp.next;
        }
        System.out.println("end");
        return head;
	}

}
