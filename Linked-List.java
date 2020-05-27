class LinkedList {
    Node head; // head of list
 
    //linked list node declaration
    class Node {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
 
    /* Insert a new node at the front of the list */
    public void push(int new_data) {
        //allocate and assign data to the node
        Node newNode = new Node(new_data);
        
        //new node becomes head of linked list
        newNode.next = head;
        
        //head points to new node
        head = newNode;
    }
 
    // Given a node,prev_node insert node after prev_node
    public void insertAfter(Node prev_node, int new_data) {
        //check if prev_node is null.
        if (prev_node == null)
        {
            System.out.println("The given node is required and cannot be null");
            return;
        }
        
        //allocate node and assign data to it
        Node newNode = new Node(new_data);
        
        //next of new Node is next of prev_node
        newNode.next = prev_node.next;
        
        //prev_node->next is the new node.
        prev_node.next = newNode;
    }
    
    //inserts a new node at the end of the list
    public void append(int new_data) { 
        //allocate the node and assign data
        Node newNode = new Node(new_data); 
    
            //if linked list is empty, then new node will be the head
        if (head == null) { 
            head = new Node(new_data); 
            return; 
        } 
    
        //set next of new node to null as this is the last node
        newNode.next = null; 
        
        // if not the head node traverse the list and add it to the last
        Node last = head;
        while (last.next != null)
        last = last.next;
        
        //next of last becomes new node
        last.next = newNode;
        return;
    }
    
    //display contents of linked list
    public void displayList() {
        Node pnode = head;

        while (pnode != null) {
            System.out.print(pnode.data+"-->");
            pnode = pnode.next;
        }

        if(pnode == null) {
            System.out.print("null");
        }

        System.out.println("");
    }
}
 
//Main class to call linked list class functions and construct a linked list
class main{
    public static void main(String[] args) {
        /* create an empty list */
        LinkedList lList = new LinkedList();
        // Insert 40.
        lList.append(40);
        // Insert 20 at the beginning.
        lList.push(20);
        // Insert 10 at the beginning.
        lList.push(10);
        // Insert 50 at the end.
        lList.append(50);
        // Insert 30, after 20.
        lList.insertAfter(lList.head.next, 30);
        
        System.out.println("\nFinal linked list: ");
        lList. displayList ();
    }
}