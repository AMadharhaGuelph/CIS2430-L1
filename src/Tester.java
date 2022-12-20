import java.util.Scanner;

public class Tester{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String assignmentGrades;
        SubmissionChoices mySubChoices = new SubmissionChoices();

        assignmentGrades = sc.nextLine();

        mySubChoices.parseInput(assignmentGrades);

        System.out.println(mySubChoices.getChoices());
        sc.close();
    }
}