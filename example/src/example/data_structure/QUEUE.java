package example.data_structure;


/**
 * Write a description of class queue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QUEUE
{
    // instance variables - replace the example below with your own
    private int size,rear,front;
    private Node head;

    /**
     * Constructor for objects of class queue
     */
    public QUEUE()
    {
        // initialise instance variables
        head=null;
        rear = front = -1;
        size=0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int currentSize()
    {
        // put your code here
        return (rear-front)+1;
    }
    public void inqueue(int data){
        Node n=new Node(data);
        if(rear == -1){
            rear++;
            head=n;
        }
        else{
            rear++;
            Node x=isLast();
            x.next=n;
        }
    }
    public void dequeue(){
        Node n = head;
        head = n.next;
        front++;
    }
    public Node isLast(){
        Node n=head;
        while(n.next != null)
            n=n.next;
        return n;
    }
    public void print(){
        Node n=head;
        while(n != null){
            System.out.print(n.getData()+" ");
            n=n.next;
        }
    }    
}
