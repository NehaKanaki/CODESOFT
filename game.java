import java.util.Scanner;

public class game {
    int input_data(){
        int user_input;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        user_input=sc.nextInt();
        return user_input;
    }
    public static void main(String[] args) {
        generateNumber obj=new generateNumber();
        int val= obj.return_val();
        game ab = new game();
        int user;
        do {
             user = ab.input_data();
            if (user == val) {
                System.out.println("The Number is Correct");
            } else if (user > val) {
                System.out.println("The Number is Too High");
            } else {
                System.out.println("The Number is Too Low");
            }

        }while (user!=val);
    }
}