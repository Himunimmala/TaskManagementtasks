package mx.tc.j2se.tasks;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Task  {
    String title;
    boolean status;
    LocalDateTime time;
    LocalDateTime start;
    LocalDateTime end;
    LocalTime interval;
    boolean repeated;

    /**
     * Task(String title, int time)
     * It is a non-repition task
     */
    public Task (String title, LocalDateTime time)
    {
        if(time.getHour()<0)
        {
            throw new IllegalArgumentException("time must be greater than zero");
        }
      this.title=title;
      this.time=time;
      this.repeated=false;
      this.status=true;

    }
    public Task (String title, LocalDateTime start, LocalDateTime end, LocalTime interval1)
    {
        if(start.getHour()<0 || end.getHour()<0)
        {
            throw new IllegalArgumentException("time must be greater than zero");
        }
        this.title=title;
        this.start=start;
        this.end=end;
        this.interval=interval1;
        this.repeated=true;
        this.status=true;
        if(this.interval.getHour()<0)
        {
            throw new IllegalArgumentException("interval greater than zero");
        }
    }
    public String getTitle()
    {
        return this.title;
    }
    public void setTitle (String title)
    {
        this.title=title;
    }
    public boolean isActive()
    {
        return this.status;
    }
    public void setActive(boolean active)
    {
        this.status = active;
    }
    public LocalDateTime getTime()
    {
        return this.time;
    }

    public void setTime(LocalDateTime time)
    {
        this.time=time;
        if(isRepeated())
        {
            repeated=false;
        }
    }
   public LocalDateTime getStartTime()
    {

        if(!repeated) {

            return this.time;
        }
        else {

            return this.start;
        }

    }
    public LocalDateTime getEndTime()
    {
        if(!repeated) {

            return this.time;
        }
        else {
            return this.end;
        }
    }
    public LocalTime getRepeatInterval()
    {
        if(!isRepeated())
        {
            if(this.interval.getHour()<0)
            {
                throw new IllegalArgumentException("Interval should be more than 0");
            }
            return LocalTime.of(0,0,0);
        }
        return this.interval;
    }
    public void setTime(LocalDateTime start, LocalDateTime end, LocalTime interval)
    {

        if(!isRepeated())
        {
            repeated=true;
        }
        this.start=start;
        this.end=end;
        this.interval=interval;
    }
    public boolean isRepeated()
    {
        return repeated;
    }
    public LocalDateTime nextTimeAfter (LocalDateTime current)
    {
        if(current.isBefore(end))
        {
//            System.out.println(this.interval.getHour());
            current=current.plusHours(this.interval.getHour());
            current=current.plusMinutes(this.interval.getMinute());
            return current;
        }
        else {
            return LocalDateTime.of(-1,-1,-1,-1,-1,-1);
        }
//        return current;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", status=" + status +
                ", time=" + time +
                ", start=" + start +
                ", end=" + end +
                ", interval=" + interval +
                ", repeated=" + repeated +
                '}';
    }



//    public void accept(Task task) {
//
//    }
}
