import com.mysql.cj.protocol.Resultset;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.Scanner;
import java.io.*;

public class ChoiceThree {

    private Scanner input = new Scanner(System.in);
    private TryInput get = new TryInput();

    public void Action(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
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
                    while (rs.next()) {
                        tempCheck = rs.getInt(1);
                    }
                    if (tempCheck != productChoice) {
                        System.out.println("Product does not exist.");
                    } else {
                        case1 = false;
                    }
                } while (case1);

                PreparedStatement getSubCat = connection.prepareStatement("SELECT SubCategory FROM Products WHERE ProductID = ?");
                getSubCat.setInt(1, productChoice);
                ResultSet subCat = getSubCat.executeQuery();
                while (subCat.next()) {
                    subCategory = subCat.getString(1);
                }

                switch (subCategory) {
                    case "Bedroom Collections":
                        PreparedStatement deleteBed = connection.prepareStatement("DELETE FROM BedroomCollections WHERE ProductID = ?");
                        deleteBed.setInt(1, productChoice);
                        deleteBed.executeUpdate();
                        System.out.println("Record deleted");
                        break;
                    case "Bike":
                        PreparedStatement deleteBike = connection.prepareStatement("DELETE FROM Bike WHERE ProductID = ?");
                        deleteBike.setInt(1, productChoice);
                        deleteBike.executeUpdate();
                        System.out.println("Record deleted");
                    case "Ceiling Fan":
                        PreparedStatement deleteFan = connection.prepareStatement("DELETE FROM CeilingFan WHERE ProductID = ?");
                        deleteFan.setInt(1, productChoice);
                        deleteFan.executeUpdate();
                        System.out.println("Record deleted");
                        break;
                    case "Cooking Appliances":
                        PreparedStatement deleteCook = connection.prepareStatement("DELETE FROM CookingAppliances WHERE ProductID = ?");
                        deleteCook.setInt(1, productChoice);
                        deleteCook.executeUpdate();
                        System.out.println("Record deleted");
                        break;
                    case "Desktop":
                        PreparedStatement deleteDesktop = connection.prepareStatement("DELETE FROM Desktop WHERE ProductID = ?");
                        deleteDesktop.setInt(1, productChoice);
                        deleteDesktop.executeUpdate();
                        System.out.println("Record deleted");
                        break;
                    case "Headphones":
                        PreparedStatement deleteHead = connection.prepareStatement("DELETE FROM Headphones WHERE ProductID = ?");
                        deleteHead.setInt(1, productChoice);
                        deleteHead.executeUpdate();
                        System.out.println("Record deleted");
                        break;
                    case "Laptop":
                        PreparedStatement deleteLaptop = connection.prepareStatement("DELETE FROM Laptop WHERE ProductID = ?");
                        deleteLaptop.setInt(1, productChoice);
                        deleteLaptop.executeUpdate();
                        System.out.println("Record deleted");
                        break;
                    case "Luggage":
                        PreparedStatement deleteLug = connection.prepareStatement("DELETE FROM Luggage WHERE ProductID = ?");
                        deleteLug.setInt(1, productChoice);
                        deleteLug.executeUpdate();
                        System.out.println("Record deleted");
                        break;
                    case "Mattresses":
                        PreparedStatement deleteMat = connection.prepareStatement("DELETE FROM Mattresses WHERE ProductID = ?");
                        deleteMat.setInt(1, productChoice);
                        deleteMat.executeUpdate();
                        System.out.println("Record deleted");
                        break;
                    case "Office Furniture":
                        PreparedStatement deleteOff = connection.prepareStatement("DELETE FROM OfficeFurniture WHERE ProductID = ?");
                        deleteOff.setInt(1, productChoice);
                        deleteOff.executeUpdate();
                        System.out.println("Record deleted");
                        break;
                    case "Pendant":
                        PreparedStatement deletePend = connection.prepareStatement("DELETE FROM Pendant WHERE ProductID = ?");
                        deletePend.setInt(1, productChoice);
                        deletePend.executeUpdate();
                        System.out.println("Record deleted");
                        break;
                    case "Refrigerators":
                        PreparedStatement deleteFrid = connection.prepareStatement("DELETE FROM Refrigerators WHERE ProductID = ?");
                        deleteFrid.setInt(1, productChoice);
                        deleteFrid.executeUpdate();
                        System.out.println("Record deleted");
                        break;
                    case "Ring":
                        PreparedStatement deleteRing = connection.prepareStatement("DELETE FROM Ring WHERE ProductID = ?");
                        deleteRing.setInt(1, productChoice);
                        deleteRing.executeUpdate();
                        System.out.println("Record deleted");
                        break;
                    case "Skateboard":
                        PreparedStatement deleteSkate = connection.prepareStatement("DELETE FROM Skateboard WHERE ProductID = ?");
                        deleteSkate.setInt(1, productChoice);
                        deleteSkate.executeUpdate();
                        System.out.println("Record deleted");
                        break;
                    case "Tablet":
                        PreparedStatement deleteTab = connection.prepareStatement("DELETE FROM Tablet WHERE ProductID = ?");
                        deleteTab.setInt(1, productChoice);
                        deleteTab.executeUpdate();
                        System.out.println("Record deleted");
                        break;
                    case "Tv":
                        PreparedStatement deleteTV = connection.prepareStatement("DELETE FROM TV WHERE ProductID = ?");
                        deleteTV.setInt(1, productChoice);
                        deleteTV.executeUpdate();
                        System.out.println("Record deleted");
                        break;
                    case "Washers & Dryers":
                        PreparedStatement deleteWas = connection.prepareStatement("DELETE FROM WashersAndDryers WHERE ProductID = ?");
                        deleteWas.setInt(1, productChoice);
                        deleteWas.executeUpdate();
                        System.out.println("Record deleted");
                        break;
                }
                PreparedStatement deleteProduct = connection.prepareStatement("DELETE FROM Products WHERE ProductID = ?");
                deleteProduct.setInt(1, productChoice);
                deleteProduct.executeUpdate();
                statement.execute("COMMIT");
            } catch (SQLException failure) {
                statement.execute("ROLLBACK");
            }
        }


    }


}
