import java.util.Scanner;

public class StudentGradeCalculator{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of English:");
        int eng = sc.nextInt();
        System.out.println("Enter the marks of Physics:");
        int phy = sc.nextInt();
        System.out.println("Enter the marks of Chemistry:");
        int chem = sc.nextInt();
        System.out.println("Enter the marks of Maths:");
        int math = sc.nextInt();
        System.out.println("Enter the marks of Computer:");
        int comp = sc.nextInt();
        
        int totalMarks = (eng+phy+chem+math+comp);
        int avgPercent = totalMarks/5;

        System.out.println("Total marks of the Student is: " +totalMarks);
        System.out.println("The AveragePercentage of the Student is:" +avgPercent);

        if(avgPercent>=90){
            System.out.println("Grade 'A1'");
        }
        else if(avgPercent>=80 && avgPercent<90){
            System.out.println("Grade 'A2'");
        }
        else if(avgPercent>=70 && avgPercent<80){
           System.out.println("Grade 'B1'");
        }
        else if(avgPercent>=60 && avgPercent<70){
            System.out.println("Grade 'B2'");
        }
        else if(avgPercent>=50 && avgPercent<60){
          System.out.println("Grade 'C1'");   
        }
        else if(avgPercent>=45 && avgPercent<50){
            System.out.println("Grade 'c2':'Just Pass'");
        }
        else{
            System.out.println("Grade 'D':'Fail'");
        }

    }
}
