import java.util.InputMismatchException;
import java.util.Scanner;

public class TryInput {
    private Scanner input = new Scanner(System.in);

    public int getIntChoices(){
        boolean isNumeric = false;//This will be set to true when numeric val entered
        while(!isNumeric) {
            try {
                int choice = input.nextInt();
                input.nextLine();
                return choice;
            } catch (InputMismatchException ime) {
                //Display Error message
                System.out.println("Enter only valid options.");
                input.nextLine();//Advance the scanner
            }
        }
        return 0;
    }

    public int getInt(){
        boolean isNumeric = false;//This will be set to true when numeric val entered
        while(!isNumeric) {
            try {
                int choice = input.nextInt();
                input.nextLine();
                return choice;
            } catch (InputMismatchException ime) {
                //Display Error message
                System.out.println("Enter only numbers.");
                input.nextLine();//Advance the scanner
            }
        }
        return 0;
    }

    public float getFloat(){
        boolean isNumeric = false;//This will be set to true when numeric val entered
        while(!isNumeric) {
            try {
                float choice = input.nextFloat();
                input.nextLine();
                return choice;
            } catch (InputMismatchException ime) {
                //Display Error message
                System.out.println("Enter only numbers.");
                input.nextLine();//Advance the scanner
            }
        }
        return 0;
    }
}
