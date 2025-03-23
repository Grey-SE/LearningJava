import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Countdown Timer

        //Declare variables

        System.out.print("Enter # of seconds to countdown from: ");
        int response = scanner.nextInt();

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {


            int count = response;

            @Override
            public void run() {
                System.out.println(count);
                count--;
                if(count < 0){
                    System.out.println("Happy New Year!");
                    timer.cancel();
                }
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000); //(task, delay, period in millisecond)

        scanner.close();
    }
}
