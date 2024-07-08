package gradecalculator;
import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your Physics marks:");
            int physics = sc.nextInt();
            System.out.println("Enter your Chemistry marks:");
            int chemistry = sc.nextInt();
            System.out.println("Enter your Mathematics marks:");
            int mathematics = sc.nextInt();
            System.out.println("Enter your English marks:");
            int english = sc.nextInt();
            System.out.println("Enter your Computer marks:");
            int computer = sc.nextInt();
            float percentage = ((physics + chemistry + mathematics + english + computer)/500.0f)*100;
            System.out.println("percentage:");
            System.out.println(percentage);
            System.out.println("The student grade is:");
            if (percentage >=80){
                System.out.println("A");
            }
            else if (percentage >=60 && percentage < 80){
                System.out.println("B");
            }
            else if (percentage >=40 && percentage < 60){
                System.out.println("C");
            }
            else {
                System.out.println("D");
            }
        }

    }
}
    

