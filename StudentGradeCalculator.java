import java.util.*;
class StudentGradeCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("---------Enter The Marks---------");

        System.out.print("English-");
        n1 = sc.nextInt();
        if(n1>100)
        {
            System.out.println("Marks cannot be grater than 100");
            System.out.print("English-");
            n1 = sc.nextInt();
        }
        
        System.out.print("Maths-");
        n2 = sc.nextInt();
        if(n2>100)
        {
            System.out.println("Marks cannot be grater than 100");
            System.out.print("Maths-");
            n2 = sc.nextInt();
        }

        System.out.print("Science-");
        n3 = sc.nextInt();
        if(n3>100)
        {
            System.out.println("Marks cannot be grater than 100");
            System.out.print("Science-");
            n3 = sc.nextInt();
        }

        int totalmarks = n1 + n2 + n3;
        double percentage = ((double)totalmarks/300)*100;
        System.out.println("Percentage-"+percentage); 
        
        char grade;
        if(percentage>=90){
            grade = 'A';
        }else if(percentage>=80){
            grade = 'B';
        }else if(percentage>=70){
            grade = 'C';
        }else if(percentage>=60){
            grade = 'D';
        }else if(percentage>=50){
            grade = 'E';
        }else{
            grade = 'F';
        }
        
        System.out.println("Total Marks-"+totalmarks); 
        System.out.println("Percentage-"+percentage); 
        System.out.println("Grade-"+grade); 
    }
}