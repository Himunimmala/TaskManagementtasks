package mx.tc.j2se.tasks;

import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public abstract class AbstractTaskList {

    int size;
    private mx.tc.j2se.tasks.Task Task;
    private java.util.stream.Stream<mx.tc.j2se.tasks.Task> Stream;

//    private boolean type = true;



    //    private Task;
    public void add(Task task) {

    }

    ;

    public void display() {

    }

    ;

    public boolean remove(Task task) {
        return true;
    }

    ;

    public int size() {
        return size;
    }

    public Task getTask(int index) {
        return Task;
    }

//    public AbstractTaskList incoming(int from, int to) {
//        return new ArrayTaskList();
//    }


    public Iterator<mx.tc.j2se.tasks.Task> iterator() {
        Iterator<mx.tc.j2se.tasks.Task> iter = new Iterator<mx.tc.j2se.tasks.Task>() {
            private int currentIndex = 0;
            @Override
            public boolean hasNext() {
                return currentIndex < size() && currentIndex!=size() && getTask(currentIndex)!=null;
            }

            @Override
            public mx.tc.j2se.tasks.Task next() {
                if (hasNext()) {
                 return getTask(currentIndex++);
                }
                else
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

            }
        };
        return iter;

    }
    public int hashCode(AbstractTaskList abobject)
    {
        if(this.equals(abobject)) {
            System.out.println("in hashcode equals");
            System.out.println("hashcode of 1st one:"+abobject.hashCode());
            System.out.println("hashcode of 2nd one:"+this.hashCode());

            return abobject.hashCode();
        }
        System.out.println("hashcode of 1st one:"+abobject.hashCode());
        System.out.println("hashcode of 2nd one:"+this.hashCode());
        return this.hashCode();
    }

    @Override
    public boolean equals(Object o) {
       if(o instanceof AbstractTaskList)
       {
           AbstractTaskList ol= (AbstractTaskList) o;
           if(this.size()== 0 && ol.size()==0)
           {
               return true;
           }
           else if(this.size()==ol.size())
           {
               Iterator<Task> l=this.iterator();
               Iterator<Task> l2=ol.iterator();
               while(l.hasNext())
               {
                   Object o1=l.next();
                   Object o2=l2.next();
                   if(!( o1==null ? o2==null : o1.equals(o2)))
                   {
                       return false;
                   }
               }
               return true;
           }

       }
       return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, Task);
    }

    public AbstractTaskList clone()
    {
       AbstractTaskList atl=new ArrayTaskList() {
       };

//        Iterator<mx.tc.j2se.tasks.Task> itr = atl.iterator();

        // Checking the next element  where
        // condition holds true till there is single element
        // in the List using hasnext() method

//        while (itr.hasNext()) {
//            //  Moving cursor to next element
//            Task i = itr.next();
////            System.out.println("in list");
//            // Getting elements one by one
//            System.out.println(i);
//            atl.add(i);
//
//            // Removing odd elements
//
//        }
        for(int i=0;i<this.size();i++)
        {
            //System.out.println(this.getTask(i));
            atl.add(this.getTask(i));
            //System.out.println(atl.getTask(0).getTitle());
        }
   // atl.display();
        return atl;
    }

    public Stream<Task> getStream()
    {
       
        return  Stream;
    };
    public Stream<Task> incoming(AbstractTaskList ab,LocalDateTime from, LocalDateTime to)
    {

//        ArrayTaskList t=new ArrayTaskList();

       Stream<Task> abt1=ab.getStream();
      //abt1.collect(Collectors.toSet()).stream().forEach(System.out::println);
        Stream<Task> a=abt1.filter(u -> u.getStartTime().isAfter(from) && u.getEndTime().isBefore(to));
       //System.out.println(a);
//        int i=0;
//       return i;
        return a;
    }


}
