package mx.tc.j2se.tasks;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayTaskList<T> extends AbstractTaskList {
    private static final int INITIAL_CAPACITY = 10;
    private int size = 0;
    private Task myData[] = {};

    public ArrayTaskList() {
        myData = new Task[INITIAL_CAPACITY];
    }


    public void add(Task task) {
        try {
            if (task == null) {
                throw new IllegalArgumentException("adding tasking should not be null");
            }
        }
        catch(IllegalArgumentException e)
        {
           System.out.println(e);
        }
        if (size == myData.length) {
            ensureCapacity(); // increase current capacity of list, make it double.
        }
        myData[size++] =  task;

    }

    @SuppressWarnings("unchecked")
    public Task getTask(int index)  {
        // if index is negative or greater than size of size, we throw
        // Exception.
        if(index<0 || index>size)
        {
//            throw new IndexOutOfBoundsException("Index out of range");
            new Exception("Due to Index out of range"); //userdefined exception
        }

        return  myData[index]; // return value on index.
    }

    public int size()
    {
//       System.out.println("size:"+size);
        return size;
    }
    public boolean remove(Task task) {
        if(task==null)
        {
            throw new IllegalArgumentException("task shouldn't be null");
        }
        for(int i=0;i<size;i++) {

            if(myData[i]==task)
            {
               // System.out.println("in");
                for (int j = i; j < size ; j++) {
                    myData[j] = myData[j + 1];
                }
                size--;
                break;
            }
        }

        return true;
    }


    private void ensureCapacity() {
        int newIncreasedCapacity = myData.length * 2;
        myData = Arrays.copyOf(myData, newIncreasedCapacity);
    }

    public void display() {

        for (int i = 0; i < size; i++) {
            System.out.println(myData[i].getTitle());
        }
    }
//    public ArrayTaskList incoming(LocalDateTime from, LocalDateTime to)
//    {
//
//        ArrayTaskList t=new ArrayTaskList();
//        int i;
//        for(i=0;i<size;i++)
//        {
//
//            if(myData[i].getStartTime().isAfter(from)) {
//                if (myData[i].getEndTime().isBefore(to)) {
//                    //System.out.println(t);
//                    t .add(myData[i]);
//                }
//            }
//        }
////        System.out.println("arraytasklist incoming");
//       return t;
//    }
public Stream<Task> getStream()
{

    //Stream b;
//    List b = null;
//    //Task b;
//
//    b =  IntStream.range(0,this.size()).of(this.clone()).;
//
//    System.out.println("in stream");

    return  Stream.of(this.myData);

}


}
