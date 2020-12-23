import java.util.Scanner;

public class meIRL {
    static void EnterName(){
        //take input
        Scanner nameInput = new Scanner(System.in);
        System.out.println("Please enter your name.");
        String name = nameInput.nextLine();

        //print the input along with an additional message
        System.out.println("Your name is " + name + ".");

        //asking if the name is correct with a y/n prompt
        //this will ask you to re-enter if it is not y or n
        System.out.println("Is this correct?");
        Scanner isNameCorrect = new Scanner(System.in);
        String isCorrectVar = isNameCorrect.nextLine();

        switch (isCorrectVar.toLowerCase()) {
            case "y":
                System.out.println("Good. The program will now terminate.");
                break;

            case "n":
                System.out.println("You will now be asked to re-enter your name.");
                EnterName();
                break;

        }
    }
    public static void main(String[] args) {
        EnterName();
    }

}
