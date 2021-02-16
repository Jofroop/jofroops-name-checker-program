import java.util.Scanner;

public class meIRL {
    static void EnterName(){
        //set variables
        String validinput = "false";

        //take input
        Scanner nameInput = new Scanner(System.in);
        System.out.println("Please enter your name.");
        String name = nameInput.nextLine();

        while (validinput == "false"){
            //print the input along with an additional message
            System.out.println("Your name is " + name + ".");

            //asking if the name is correct with a y/n prompt
            //this will ask you to re-enter if it is not y or n
            System.out.println("Is this correct? (Y/N)");
            Scanner isNameCorrect = new Scanner(System.in);
            String isCorrectVar = isNameCorrect.nextLine();

            //loop for testing if the input is good
            //if input is bad then it loops back and asks you to enter again
            //a bad input would be "h" or "k" or "beans"
            switch (isCorrectVar.toLowerCase()) {
                case "y":
                    System.out.println("Good. The program will now terminate.");
                    validinput = "true";
                    break;

                case "n":
                    System.out.println("You will now be asked to re-enter your name.");
                    validinput = "true";
                    EnterName();
                    break;

                default:
                    System.out.println("Invalid input.");
                    validinput = "false";
                    break;
        }


        }
    }
    public static void main(String[] args) {
        EnterName();
    }

}
