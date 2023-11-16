import java.util.Random;

public class generateNumber {
    int random_number;
    generateNumber(){
        Random r=new Random();
        random_number=r.nextInt(101);
        System.out.println("Guess random number between 1 To 100");

}
    int return_val(){
        return random_number;
    }


}