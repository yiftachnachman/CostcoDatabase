import java.sql.*;
import java.util.Scanner;

public class ChoiceFive {
    private TryInput get = new TryInput();


    public void Action(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()){
            statement.execute("BEGIN");
            try {
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

                System.out.println("How much is in stock?");
                int newStock = get.getInt();

                PreparedStatement updateStock = connection.prepareStatement("UPDATE Products SET Stock = ? WHERE ProductID = ?");
                updateStock.setInt(1, newStock);
                updateStock.setInt(2, productChoice);
                updateStock.executeUpdate();
                statement.execute("COMMIT");

            }catch (SQLException failure){
                statement.execute("ROLLBACK");
                System.out.println("Update Failed.");
                System.out.println("Rollback Initiated");
            }

        }

    }
}
