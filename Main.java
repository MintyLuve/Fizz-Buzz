import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = getInput(sc);

        for (int num=1; num <= input; num++) {
            String output = "";
            if (num%3 == 0){
                // adds fizz into the string
                output = output + "Fizz ";
            }
            if (num%5 == 0){
                // adds buzz into the string
                output = output + "Buzz ";
            }
            if (num%7 == 0){
                // adds fuzz into the string
                output = output + "Fuzz";
            }
            if (output == ""){
                // turns the output into num
                output = Integer.toString(num);
            }
            // prints output
            System.out.println(output);
        } 
    }
    public static int getInput(Scanner sc){
        System.out.println("Input a number: ");
        int input = sc.nextInt();

        if (input < 0){
            return getInput(sc);
        }
        else{
            return input;
        }
    }
}