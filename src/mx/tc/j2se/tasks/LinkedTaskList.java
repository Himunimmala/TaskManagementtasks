package mx.tc.j2se.tasks;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LinkedTaskList extends AbstractTaskList{
    Node head; // head of list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
     class Node {
        Task data;
        Node next;
        // Constructor
       public Node(Task task)
        {
           this.data = task;
            next = null;
        }
    }

    /**
     * inserting new node to the linked list
     * @param
     * @param data
     */
//    LinkedTaskList list =new LinkedTaskList();
    public  void add(Task data)
    {
        // Create a new node with given data
        Node new_node = new Node(data);


        // If the Linked List is empty,
        // then make the new node as head
        if (this.head == null) {
            head = new_node;
        }
        else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = this.head;

            while (last.next != null) {
                last = last.next;
            }

            // Insert the new_node at last node
            last.next = new_node;
        }

        // Return the list by head
//        return list;
    }
    /**
    Getting the task using the index.
     */
    public Task getTask(int index)
    {
        Node current = this.head;
        int count = 0; /* index of Node we are
                          currently looking at */
        while (current != null)
        {
            if (count == index)
                return current.data;
            count++;
            current = current.next;
        }

        /* if we get to this line, the caller was asking
        for a non-existent element so we assert fail */
        assert (false);
        return current.data;
    }

    /**
     * size of the linked list
     * @param
     * @return
     */
    public int size()
    {
        Node currNode = this.head;

       int count=0;

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
           count=count+1;
            // Go to next node
            currNode = currNode.next;
        }
        return count;
    }

    /**
     * removing the linkedlist node according to the task
     * @param
     * @param task
     * @return
     */
    public boolean remove(Task task)
    {
        Node currNode=this.head,prev=null;

        if(currNode.data.getTitle()== task.getTitle())
        {
//            System.out.println("first element removal");
             this.head=currNode.next;
            return true;

        }
        if(this.head==null)
        {
            throw new IllegalArgumentException("exception due to null linked list");
//            return false;
        }


        while (currNode != null && currNode.data.getTitle() != task.getTitle()) {
            // If currNode does not hold key
            // continue to next node
            prev = currNode;
            currNode = currNode.next;
        }

        // If the key was present, it should be at currNode
        // Therefore the currNode shall not be null
        if (currNode != null) {
            // Since the key is at currNode
            // Unlink currNode from linked list
            prev.next = currNode.next;


        }


        return true;

    }

    /**
     * displaying the linked list
     * @param
     */
    public  void display()
    {
        Node currNode = this.head;

//        System.out.print("LinkedList: \n");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data.getTitle()+" "+currNode.data.getStartTime()+" "+currNode.data.getEndTime()+" "+currNode.data.getRepeatInterval()+"\n");
            //System.out.print(currNode.data.toString());
            // Go to next node
            currNode = currNode.next;
        }
    }
//
//    public LinkedTaskList incoming(LocalDateTime from, LocalDateTime to)
//    {
//        String t="";
//        int i;
//        LinkedTaskList lar=new LinkedTaskList();
//        Node currNode=this.head;
//        while(currNode.next!=null)
//        {
//
//            if(currNode.data.getStartTime().isAfter(from)) {
//                if (currNode.data.getEndTime().isBefore(to)) {
////                    System.out.println(t);
////                    System.out.println("in the loop");
//                    lar.add(currNode.data);
//                }
//            }
//            currNode = currNode.next;
//        }
//
////        System.out.println("in the list");
//        return lar;
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        LinkedTaskList that = (LinkedTaskList) o;
//        return Objects.equals(head, that.head);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(head);
//    }

//    public boolean equals(ArrayTaskList o1, ArrayTaskList o2) {
//       if(o1.equals(o2))
//       {
//           return true;
//       }
//       return false;
//
//    }
//
//
//    public int hashCode(Task t1) {
//        return t1.hashCode();
//    }


    public Stream<Task> getStream()
    {

        //Stream b;
        List b = null;
        //Task b;
        for(int i=0;i<this.size();i++) {
            b=  Stream.of(this.getTask(i)).collect(Collectors.toList());

        }

        return  b.stream();

    }
}
