import java.util.Scanner;
class StudentGradeCalculator{

    public static void main(String[] args){
        System.out.println("Enter Number of subjects : ");
        Scanner sc = new Scanner(System.in);
        int noOfSubjects = sc.nextInt();


        int totalMarks = 0;
        for(int i=1; i<=noOfSubjects; i++){
            System.out.println("Enter marks obtained in subject " + i);
            int marks = sc.nextInt();
            totalMarks += marks;
        }

        double averagePercentage = (double) totalMarks / (noOfSubjects * 100) * 100;

        char grade ;
        if(averagePercentage >= 90){
            grade = 'A';
        }
        else if(averagePercentage >= 80){
            grade = 'B';
        }
        else if(averagePercentage >=70){
            grade = 'C';
        }
        else if(averagePercentage >= 60){
            grade = 'D';
        }
        else{
            System.out.println("Fail");
        }

        System.out.println("------------------------------");
        System.out.println("Total marks obtained by a student : " +totalMarks);
        System.out.println("Average percentage : " +averagePercentage);


    }


}