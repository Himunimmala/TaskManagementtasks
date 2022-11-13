import mx.tc.j2se.tasks.*;

import java.time.Month;
//import nc.com.practice.abstracte;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args)
    {

        Task t1=new Task("Lunch with a beautiful girl on ",LocalDateTime.of(2014, Month.valueOf("AUGUST"),27,6,15));

        Task t2=new Task("Morning run",LocalDateTime.of(2014, Month.valueOf("MARCH"),1,8,15),LocalDateTime.of(2014, Month.valueOf("SEPTEMBER"),1,8,15),LocalTime.of(23,0,0));

        Task t3=new Task("Taking Medication ",LocalDateTime.of(2014, Month.valueOf("APRIL"),12,9,15),LocalDateTime.of(2014, Month.valueOf("SEPTEMBER"),1,8,15),LocalTime.of(23,0,0));

        Task t4=new Task("Meeting with friends",LocalDateTime.of(2014, Month.valueOf("MARCH"),1,8,15),LocalDateTime.of(2014, Month.valueOf("SEPTEMBER"),1,8,15),LocalTime.of(23,0,0));

        /**
         * PRACTICE
         */
        /**
         * Task t2=new Task("Morning run",-7);
         * It is used to check the exception
         */
//        System.out.println("TASK CREATION AND CHECKING WHETHER THE TASK IS CREATED WITH APPROPIATE FUNCTIONALITIES");
//        System.out.println("getting start time:"+t1.getStartTime());
//        t1.setActive(false); //setting the active state to false
//        System.out.println(t1.isActive());
//        Task t3=new Task("Morning run",5);
//        System.out.println(t3.getStartTime());
//        System.out.println(t3.getEndTime());
//        System.out.println(t3.isActive()); //
//        System.out.println(t3.getRepeatInterval());//indicates not repeated task
//        t3.setTime(3,8,1);// changes the unrepeated t2 task to repeated task
//        System.out.println(t3.getRepeatInterval());// checks whether repeated or not
//        t3.setTime(5);// changes the repeated to unrepeated
//        System.out.println("the repeat interval"+t1.getRepeatInterval());// checks whether repeated or not (0-not repeated)
        /**
         * The above stmt gives the nexttime using the current time according to the interval.
         */
        //System.out.println("next time after:"+t1.nextTimeAfter(LocalDateTime.of(2014, Month.valueOf("AUGUST"),20,8,0,1)));


        /**
         * ARRAYLIST IMPLEMENTATION (USER DEFINED)
         */

        ArrayTaskList list = new ArrayTaskList();

        /**
         * adding the task objects to the arraylist
         */
        list.add(t4);
//        list.add(t5);
//        list.add(t6);
//        list.add(t7);
//        list.add(t8);
//        list.add(t9);
//        list.add(t10);
        /**
         * diplays the arraylist
         */
        System.out.println("\n");
        System.out.println("ARRAY LIST IMPLEMENTATION");


        list.display();
        System.out.println("\n");
        System.out.println("size of the array list:"+ list.size());
        System.out.println("\nelement at index in custom ArrayList: " + list.getTask(2).getTitle());

        /*
          list.getTask(19) gives the user defined exception*/

        //Remove element from custom ArrayList
        System.out.println("\n");
       System.out.println("element removed from index: "  + list.remove(t2));

        System.out.println("size "  + list.remove(t2));
        //Again display custom ArrayList

        System.out.println("\nlet's display custom ArrayList again after removal:");

        list.display();
//        System.out.println("\nselection of tasks in interval :");
//
//        list.incoming(1,8);
      // list.hashcode(t4, t10);
//        System.out.println("Hashcode of task: "+list.hashCode(t10));
       // System.out.println("Equals() method: "+list.equals(t4,t10));


        /**
         * USER DEFINED LINKED LIST IMPLEMENTATION
         *//*


        LinkedTaskList linkedlist = new LinkedTaskList();


        *//**
        Adding the task objects to the the linkedlist.
         *//*
        linkedlist.add(t2);
        linkedlist.add(t8);
        linkedlist.add(t4);
        linkedlist.add(t5);
        linkedlist.add(t6);
        linkedlist.add(t7);

        *//**
         Printing the linkedlist.
         *//*
        System.out.println("\n");
        System.out.println("LINKED LIST IMPLEMENTATION");
        linkedlist.display();
        *//**
         size of the linkedlist.
         *//*
        System.out.println("\n");
        System.out.println("Size of the linkedlist: "+linkedlist.size());
        *//**
         * getting the specific task in the linked list using the index.
         *//*
        System.out.println("\n");
        System.out.println("The task value at a specific index using linkedlist: "+linkedlist.getTask(2).getTitle());

        System.out.println("\n");
        System.out.println("element removed from index: "  + linkedlist.remove(t2));
        System.out.println("\n");
        System.out.println("linkedlist after removal:");
        linkedlist.display();
        System.out.println("\n");
        System.out.println("linkedlist in range : ");
        LinkedTaskList t=linkedlist.incoming(0,8);
        for(int i=0;i< t.size();i++) {
            System.out.println(t.getTask(i));
        }

        */
        /**
         * ABSTRACTION CONCEPTS
         */
//        abstractex abstractobj=new AbstractChild();
//        abstractobj.t();
//
//        /**
//         * INTERFACE CONCEPTS
//         */
//
//        Interfaceex a= new Interfaceex() {
//            @Override
//            public void AbstractChild() {
//
//            }
//        };
//
//        AbstractChild acobject=new AbstractChild();
//        acobject.t();



        /**
         * ABSTRACT TASK LIST USING ARRAYTASKLIST
         */

//        System.out.println("ABSTRACT TASK LIST USING ARRAYTASKLIST");
//
//
//

        AbstractTaskList abobject=new ArrayTaskList();
        abobject.add(t1);
        abobject.add(t2);
        abobject.add(t3);

      //  System.out.println(abobject.getStream().collect(Collectors.toSet()).size());

     //   System.out.println(abobject.incoming(abobject,LocalDateTime.of(2014, Month.valueOf("AUGUST"), 25, 8, 00), LocalDateTime.of(2014, Month.valueOf("AUGUST"), 26, 8, 00)));

//        System.out.println(b);
//        abobject.add(t7);
//       /**
//        * Equals() method helps to check whether two tasks are equal or not.
//        */
//
//        AbstractTaskList abobject2=new ArrayTaskList();
//        abobject2.add(t2);
//        abobject2.add(t4);
//        abobject2.add(t6);
//        abobject2.add(t7);
//
//
////        System.out.println("Checking equals() method:"+abobject.equals(abobject2));
////        AbstractTaskList a= abobject2.clone();
////        a.display();
//
//
////        System.out.println(abobject.equals(abobject,abobject2));
//
//        System.out.println(abobject.hashCode(abobject2));

        /**
         * Using iterators to display the arraylist elements
         */

//       Iterator<Task> itr = abobject.iterator();
////
//      Iterator<Task> itr2=Tasks.incoming(itr, LocalDateTime.of(2014, Month.valueOf("AUGUST"), 25, 8, 00), LocalDateTime.of(2014, Month.valueOf("AUGUST"), 26, 8, 00));
////
//     while(itr2.hasNext()) {
//           System.out.println("rans");
//      System.out.println(itr2.next());
//      }

        // Checking the next element  where
        // condition holds true till there is single element
        // in the List using hasnext() method
//        System.out.print("\nUSING ITERATORS TO DISPLAY THE ARRAYLIST ELEMENTS ");
//        while (itr.hasNext()) {
//            //  Moving cursor to next element
//            Task i = itr.next();
////            System.out.println("in list");
//            // Getting elements one by one
//            System.out.print(i.getTitle() + " ");
//
//            // Removing odd elements
//
//        }
//        System.out.print("\nDISPLAY THE ARRAYLIST ELEMENTS ");
//        abobject.display();


/*



        AbstractTaskList oh=abobject;
        System.out.println("size of  the tasks ");
        System.out.println(oh.size());
        System.out.println("displaying the tasks using gettask:");
        System.out.println(abobject.getTask(1).getTitle());
        System.out.println(abobject.remove(t2));
        System.out.println("displaying the tasks after removal");
        abobject.display();
        System.out.println("selection of tasks:");
        AbstractTaskList atl=abobject.incoming(2,9);
        for(int i=0;i<atl.size();i++)
        {
            System.out.println(atl.getTask(i).getTitle());
        }
*/

       /**
         * ABSTRACT TASK LIST USING LINKED LIST
         */
/*        System.out.println("ABSTRACT TASK LIST USING LINKED LIST");
        AbstractTaskList abobjectll=new LinkedTaskList();
        abobjectll.add(t2);
        abobjectll.add(t4);

        Iterator<mx.tc.j2se.tasks.Task> itrll = abobjectll.iterator();

        // Checking the next element  where
        // condition holds true till there is single element
        // in the List using hasnext() method
        System.out.print("\nUSING ITERATORS TO DISPLAY THE LINKED LIST ELEMENTS ");
        while (itrll.hasNext()) {
            //  Moving cursor to next element
            Task ill = itrll.next();
//            System.out.println("in list");
            // Getting elements one by one
            System.out.print(ill.getTitle() + " ");

            // Removing odd elements

        }

        System.out.print("\nDISPLAY THE LINKED LIST ELEMENTS ");
        abobjectll.display();*/
/*
        AbstractTaskList ohll=abobjectll;
        System.out.println("\nsize of  the tasks ");
        System.out.println(ohll.size());
        System.out.println("\ndisplaying the tasks using gettask:");
        System.out.println(abobjectll.getTask(1).getTitle());

        System.out.println(abobjectll.remove(t2));
        System.out.println("\ndisplaying the tasks after removal");
        abobjectll.display();


        */
/** using TASK LIST FACTORY the data can be retrieved as ARRAY or LINKED LIST
         *
         *//*


        TaskListFactory tlf=new TaskListFactory();
        */
/**
         * ARRAY LIST USING ABSTRACT CLASS
         *//*

        System.out.println("\nARRAY LIST USING ABSTRACT CLASS");
        AbstractTaskList ad=tlf.createTaskList(ListTypes.types.ARRAY);
        ad.add(t4);
        ad.add(t5);
        ad.add(t6);
        ad.display();


        */
/**
         * LINKED LIST USING ABSTRACT CLASS
         *//*

        System.out.println("\nLinked LIST USING ABSTRACT CLASS");
        AbstractTaskList adl=tlf.createTaskList(ListTypes.types.LINKED);
        adl.add(t4);
        adl.add(t5);
        adl.add(t6);
        adl.display();




*/



    }
}