import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{


        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://35.185.192.119:3306/CostcoDatabase?useSSL=false", "park240", "Nohacking123");


        TryInput get = new TryInput();

        Scanner input = new Scanner(System.in);
        Simulation simulate = new Simulation();

        int choice = 0;
        boolean decision = true;

        while(decision){
            simulate.DisplayChoices();
            choice = get.getIntChoices();

            switch (choice){
                case 1:
                    simulate.ChoiceOneAction(connection);
                    break;
                case 2:
                    simulate.ChoiceTwoAction(connection);
                    break;
                case 3:
                    simulate.ChoiceThreeAction(connection);
                    break;
                case 4:
                    simulate.ChoiceFourAction(connection);
                    break;
                case 5:
                    simulate.ChoiceFiveAction(connection);
                    break;
                case 6:
                    simulate.ChoiceSixActon(connection);
                    break;
                case 7:
                    decision = false;
                    break;
                default:
                    System.out.println("Please enter a valid option.");
            }
        }










    }
}
