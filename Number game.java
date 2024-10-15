import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        Random num = new Random();
        int n;
        String round ="yes";
        int score=0;
        while (round.equalsIgnoreCase("yes")){
            n= num.nextInt(101);
            System.out.println("Let the number be : " + n);
            for(int i=0;i<6;i++){

                System.out.println("Guess the number:");
                int n1=input.nextInt();
                if(n1==n){
                    System.out.println("Nice!!! you've guessed the right number!");
                    score= score + 10;
                    break;
                }
                else if(n1<n){
                    System.out.println("Oops!! you've guessed too low");
                    if(score>=2){
                        score= score - 2;
                    }
                    if(i==5){
                        System.out.println("The right number is : " + n);
                    }
                }
                else {
                    System.out.println("Oops!! you've guessed too high");
                    if(score>=2){
                        score= score - 2;
                    }
                    if(i==5){
                        System.out.println("The right number is : " + n);
                    }
                }
            }
            System.out.println("Do you play next round?");
            round = input.next();

        }
        System.out.println("your score is :"+score);

    }
}