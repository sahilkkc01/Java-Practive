import java.util.Scanner;

public class Miniproject {
    public static void main(String[] args){

        int MyNum=(int)(Math.random()*100);

        Scanner sc = new Scanner(System.in);
        int number=0;

        do {
            System.out.println("Enter your Number");
            number = sc.nextInt();
            if (number == MyNum) {
                System.out.println("Great : you guess the correct Number");
                break;
            } else if (number > MyNum) {
                System.out.println("No is too large");
            } else {
                System.out.println("No is too small");
            }
        }while (number >= 0) ;

        System.out.print("My number was : ");
        System.out.println(MyNum);

    }
}
