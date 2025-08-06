import java.util.*;
public class Main {
    public static void main (String args[]){
        Random rand = new Random();
        Scanner scanner = new Scanner (System.in);
       // int random = rand.nextInt(5,10);
        int  guess=-1;
        int playagain=1;
        while(playagain==1){
            int random = rand.nextInt(5,10);
          while(guess != random){
        System.out.println("enter a number!");
         guess= scanner.nextInt();
       // System.out.println(random);
        if(guess==random){
            System.out.println("WOW YOU GUESSED IT CORRECT");
        }
        else if(guess>random) {
             System.out.println("OHH! YOUR GUESS IS TOO HIGH");
        }
        else if(guess<random) {
             System.out.println("OHH! YOUR GUESS IS TOO LOW");
        }
          }
         System.out.println("PRESS 1 TO PLAY AGAIN");
          System.out.println("PRESS 0 TO EXIT");
          playagain = scanner.nextInt();
    }
      scanner.close();
}
}
