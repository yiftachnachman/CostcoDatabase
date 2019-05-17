import java.awt.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Simulation{

    private ChoiceOne choiceOne = new ChoiceOne();
    private ChoiceTwo choicetwo = new ChoiceTwo();
    private ChoiceThree choicethree = new ChoiceThree();
    private ChoiceFour choiceFour = new ChoiceFour();
    private ChoiceFive choicefive = new ChoiceFive();
    private ChoiceSix choiceSix = new ChoiceSix();
    private Scanner input = new Scanner(System.in);


    public void DisplayChoices(){
        System.out.println("1) Print/Display records from your database/tables");
        System.out.println("2) Create a new record");
        System.out.println("3) Delete records");
        System.out.println("4) Update prices");         //ITEMS IN A STORE DATABASE SHOULD NOT CHANGE
        System.out.println("5) Update stocks");         //ONLY PRICES AND STOCKS OF PRODUCTS SHOULD CHANGE
        System.out.println("6) Generate csv file");
        System.out.println("7) Quit");
    }

    public void ChoiceOneAction(Connection connection) throws SQLException {
        choiceOne.Action(connection);
    }

    public void ChoiceTwoAction(Connection connection) throws SQLException {
        choicetwo.Action(connection);
    }

    public void ChoiceThreeAction(Connection connection) throws SQLException {
        choicethree.Action(connection);
    }

    public void ChoiceFourAction(Connection connection) throws SQLException{
        choiceFour.Action(connection);
    }

    public void ChoiceFiveAction(Connection connection) throws  SQLException {
        choicefive.Action(connection);
    }

    public void ChoiceSixActon(Connection connection) throws SQLException{
        choiceSix.Action(connection);
    }





}
