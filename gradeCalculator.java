import java.util.Scanner;

public class gradeCalculator {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String name;
        int sub, sum=0, per;

        System.out.print("\nEnter your name :");
        name=sc.next();
        System.out.print("Enter total numer of subject :");
        sub=sc.nextInt();

        int a[]=new int[sub];

        for(int i=0;i<sub;i++){
           System.out.print("Enter marks of "+(i+1)+" subject:");
           a[i]=sc.nextInt();
           sum+=a[i];
        }

       per=(sum/sub);

       System.out.println("\n----------RESULT OF THE STUDENT-----------\n");
       System.out.println("Name Of the Student :"+name);
       System.out.println("Total Number Of subject :"+sub);
       System.out.println("Total Marks Obtained out of "+(sub*100)+" is :"+sum);
       System.out.println("Percentage of the Student :" +per+ "%");
        if(per>=75){
            System.out.println("Grade A");
        } else if ((per>=65)) {
            System.out.println("Grade B");
        } else if ((per>=55)) {
            System.out.println("Grade C");
        } else if ((per>=35)) {
            System.out.println("Grade D");
        }else {
            System.out.println("Fail");
        }
    }
}