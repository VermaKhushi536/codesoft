import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of subjects :");
        int numOfSubs = in.nextInt();
        if(numOfSubs<=0){
            System.out.println("Invalid number of subjects. Please enter valid number of subjects.");
            return;
        }

        int total=0;

        System.out.println("Enter marks of subjects :");
        for(int i=1;i<=numOfSubs;i++){
            System.out.print(i + ": ");
            int marks = in.nextInt();
            if(marks<0 || marks>100){
                System.out.println("Invalid marks. Please enter marks from 1 to 100.");
                return;
            }
            else{
                total = total + marks;
            }
        }

        double percent;

        percent=((double)total)/numOfSubs;
        System.out.println("total marks = " + total);

        System.out.println("overall percentage = " +percent);

        if(percent<=100 && percent>=90){
            System.out.println("overall grade = A");
        }
        else if(percent<90 && percent>=80){
            System.out.println("overall grade = B");
        }
        else if(percent<80 && percent>=70){
            System.out.println("overall grade = C");
        }
        else if(percent<70 && percent>=30){
            System.out.println("overall grade = D");
        }
        else{
            System.out.println("overall grade = FAIL");
        }

    }
}