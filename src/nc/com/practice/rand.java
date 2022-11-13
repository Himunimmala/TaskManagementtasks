package nc.com.practice;

import java.time.format.DateTimeFormatter;

public class rand {
    public static void main(String args[])
    {
        DateTimeFormatter format =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        System.out.println(format);
    }
}
