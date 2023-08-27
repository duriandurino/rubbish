import java.util.*;

public class nodeCount{
    
    public class Node{
        int data;
        public Node next;
        public Node(int data){
            this.data=data;
        }
    }
        Node head = new Node(4);
        Node nodeB = new Node(3);
        Node nodeC = new Node(2);
    
        head.next = nodeB;
        nodeB.next = nodeC;
    
    public static void main(String[] args){
    
        
    }
}
