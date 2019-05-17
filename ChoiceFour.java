import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;


public class ChoiceFour {
    private Scanner input = new Scanner(System.in);
    private TryInput get = new TryInput();

    public void Action(Connection connection) throws SQLException{

        try (Statement statement = connection.createStatement()){
            statement.execute("BEGIN");
            try{
                boolean case1 = true;
                int productChoice = 0;
                String subCategory = "";
                do {
                    System.out.print("What is the product's ID?: ");
                    productChoice = get.getInt();
                    int tempCheck = 0;
                    PreparedStatement checkExist = connection.prepareStatement("SELECT ProductID FROM  Products WHERE ProductID = ?");
                    checkExist.setInt(1, productChoice);
                    ResultSet rs = checkExist.executeQuery();
                    while (rs.next()){
                        tempCheck = rs.getInt(1);
                    }
                    if (tempCheck != productChoice){
                        System.out.println("Product does not exist.");
                    }
                    else{
                        case1 = false;
                    }
                }while(case1);

                System.out.println("What is the new price?");
                float newPrice = get.getFloat();
                PreparedStatement updatePrice = connection.prepareStatement("UPDATE Products SET Price = ? WHERE ProductID = ?");
                updatePrice.setFloat(1, newPrice);
                updatePrice.setInt(2, productChoice);
                updatePrice.executeUpdate();
                statement.execute("COMMIT");
                System.out.println("Price updated");

            }catch (SQLException failure){
                statement.execute("ROLLBACK");
                System.out.println("Update Failed.");
                System.out.println("Rollback Initiated.");
            }
        }



    }




}
