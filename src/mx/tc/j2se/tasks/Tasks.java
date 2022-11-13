package mx.tc.j2se.tasks;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;

public class Tasks  {
    public static Iterator<Task> incoming(Iterator<Task> tasks, LocalDateTime start, LocalDateTime end)
    {
      AbstractTaskList a=new AbstractTaskList() {
          @Override
          public void add(mx.tc.j2se.tasks.Task task) {
              super.add(task);
          }

          @Override
          public Iterator<mx.tc.j2se.tasks.Task> iterator() {
              return super.iterator();
          }
      };


//        ArrayTaskList b=new ArrayTaskList();
        Iterator<mx.tc.j2se.tasks.Task> itr = a.iterator();
        while(tasks.hasNext())
        {
            Task abool=tasks.next();

            if(  abool.getEndTime().isAfter(end) && abool.getStartTime().isBefore(start) ) {
                //System.out.println("s");
               a.add(abool);
            }
           }

        return a.iterator();
    }
//    SortedMap<LocalDateTime, Set<Task>> calendar(Iterator<Task> tasks, LocalDateTime start, LocalDateTime end)
//    {
//         return
//    }
}
