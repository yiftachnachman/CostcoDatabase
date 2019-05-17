import java.io.FileWriter;
import java.util.Scanner;
import java.sql.*;

public class ChoiceSix {
    private TryInput get = new TryInput();
    private Scanner input = new Scanner(System.in);
    private String table;

    public void Action(Connection connection){
        boolean userinput = true;
        do{
            System.out.println("1) All Products");
            System.out.println("2) Bedroom Collections");
            System.out.println("3) Bikes");
            System.out.println("4) Ceiling Fans");
            System.out.println("5) Cooking Appliances");
            System.out.println("6) Desktops");
            System.out.println("7) Headphones");
            System.out.println("8) Laptops");
            System.out.println("9) Luggages");
            System.out.println("10) Mattresses");
            System.out.println("11) Office Furniture");
            System.out.println("12) Pendants");
            System.out.println("13) Refrigerators");
            System.out.println("14) Rings");
            System.out.println("15) Scooters");
            System.out.println("16) Skateboards");
            System.out.println("17) Tablets");
            System.out.println("18) TVs");
            System.out.println("19) Washers and Dryers");
            int choice = get.getIntChoices();
            switch (choice){
                case 1:
                    table = "Products";
                    userinput = false;
                    break;
                case 2:
                    table = "BedroomCollections";
                    userinput = false;
                    break;
                case 3:
                    table = "Bike";
                    userinput = false;
                    break;
                case 4:
                    table = "CeilingFan";
                    userinput = false;
                    break;
                case 5:
                    table = "CookingAppliances";
                    userinput = false;
                    break;
                case 6:
                    table = "Desktop";
                    userinput = false;
                    break;
                case 7:
                    table = "Headphones";
                    userinput = false;
                    break;
                case 8:
                    table = "Laptop";
                    userinput = false;
                    break;
                case 9:
                    table = "Luggage";
                    userinput = false;
                    break;
                case 10:
                    table = "Mattresses";
                    userinput = false;
                    break;
                case 11:
                    table = "OfficeFurniture";
                    userinput = false;
                    break;
                case 12:
                    table = "Pendant";
                    userinput = false;
                    break;
                case 13:
                    table = "Refrigerators";
                    userinput = false;
                    break;
                case 14:
                    table = "Ring";
                    userinput = false;
                    break;
                case 15:
                    table = "Scooter";
                    userinput = false;
                    break;
                case 16:
                    table = "Skateboard";
                    userinput = false;
                    break;
                case 17:
                    table = "Tablet";
                    userinput = false;
                    break;
                case 18:
                    table = "TV";
                    userinput = false;
                    break;
                case 19:
                    table = "WashersandDryers";
                    userinput = false;
                    break;
                default:
                    System.out.println("Please enter a valid option.");
            }
        }while(userinput);
        GenerateCSV(table, connection);
    }

    private void GenerateCSV(String table, Connection connection){
        String filename = table + ".csv";
        try {
            FileWriter fw = new FileWriter(filename);

            Statement stmt = connection.createStatement();

            if (table == "Products"){
                ResultSet rs = stmt.executeQuery("SELECT * FROM Products");
                while (rs.next()) {
                    fw.append(Integer.toString(rs.getInt(1)));
                    fw.append('\n');
                }
                rs.close();
            }
            else if (table == "BedroomCollections"){
                ResultSet rs = stmt.executeQuery("SELECT * FROM BedroomCollections");
                while (rs.next()) {
                    fw.append(Integer.toString(rs.getInt(1)));
                    fw.append(',');
                    fw.append(rs.getString(2));
                    fw.append(',');
                    fw.append(rs.getString(3));
                    fw.append(',');
                    fw.append(rs.getString(4));
                    fw.append(',');
                    fw.append('\n');
                }
                rs.close();
            }
            else if(table == "Bike"){
                ResultSet rs = stmt.executeQuery("SELECT * FROM Bike");
                while (rs.next()) {
                    fw.append(Integer.toString(rs.getInt(1)));
                    fw.append(',');
                    fw.append(rs.getString(2));
                    fw.append(',');
                    fw.append(rs.getString(3));
                    fw.append(',');
                    fw.append(rs.getString(4));
                    fw.append(',');
                    fw.append(rs.getString(5));
                    fw.append('\n');
                }
                rs.close();
            }
            else if(table == "CeilingFan"){
                ResultSet rs = stmt.executeQuery("SELECT * FROM CeilingFan");
                while (rs.next()) {
                    fw.append(Integer.toString(rs.getInt(1)));
                    fw.append(',');
                    fw.append(rs.getString(2));
                    fw.append(',');
                    fw.append(rs.getString(3));
                    fw.append(',');
                    fw.append(rs.getString(4));
                    fw.append('\n');
                }
                rs.close();
            }
            else if(table == "CookingAppliances"){
                ResultSet rs = stmt.executeQuery("SELECT * FROM CookingAppliances");
                while (rs.next()) {
                    fw.append(Integer.toString(rs.getInt(1)));
                    fw.append(',');
                    fw.append(rs.getString(2));
                    fw.append(',');
                    fw.append(rs.getString(3));
                    fw.append('\n');
                }
                rs.close();
            }
            else if(table == "Desktop"){
                ResultSet rs = stmt.executeQuery("SELECT * FROM Desktop");
                while (rs.next()) {
                    fw.append(Integer.toString(rs.getInt(1)));
                    fw.append(',');
                    fw.append(rs.getString(2));
                    fw.append(',');
                    fw.append(rs.getString(3));
                    fw.append(',');
                    fw.append(rs.getString(4));
                    fw.append(',');
                    fw.append(rs.getString(5));
                    fw.append('\n');
                }
                rs.close();
            }
            else if(table == "Headphones"){
                ResultSet rs = stmt.executeQuery("SELECT * FROM Headphones");
                while (rs.next()) {
                    fw.append(Integer.toString(rs.getInt(1)));
                    fw.append(',');
                    fw.append(rs.getString(2));
                    fw.append(',');
                    fw.append(rs.getString(3));
                    fw.append(',');
                    fw.append(rs.getString(4));
                    fw.append('\n');
                }
                rs.close();
            }
            else if(table == "Laptop"){
                ResultSet rs = stmt.executeQuery("SELECT * FROM Laptop");
                while (rs.next()) {
                    fw.append(Integer.toString(rs.getInt(1)));
                    fw.append(',');
                    fw.append(rs.getString(2));
                    fw.append(',');
                    fw.append(rs.getString(3));
                    fw.append(',');
                    fw.append(rs.getString(4));
                    fw.append(',');
                    fw.append(rs.getString(5));
                    fw.append(',');
                    fw.append(rs.getString(6));
                    fw.append('\n');
                }
                rs.close();
            }
            else if(table == "Luggage"){
                ResultSet rs = stmt.executeQuery("SELECT * FROM Luggage");
                while (rs.next()) {
                    fw.append(Integer.toString(rs.getInt(1)));
                    fw.append(',');
                    fw.append(rs.getString(2));
                    fw.append(',');
                    fw.append(rs.getString(3));
                    fw.append(',');
                    fw.append(rs.getString(4));
                    fw.append('\n');
                }
                rs.close();
            }
            else if(table == "Mattresses"){
                ResultSet rs = stmt.executeQuery("SELECT * FROM Mattresses");
                while (rs.next()) {
                    fw.append(Integer.toString(rs.getInt(1)));
                    fw.append(',');
                    fw.append(rs.getString(2));
                    fw.append(',');
                    fw.append(rs.getString(3));
                    fw.append(',');
                    fw.append(rs.getString(4));
                    fw.append('\n');
                }
                rs.close();
            }
            else if(table == "OfficeFurniture"){
                ResultSet rs = stmt.executeQuery("SELECT * FROM OfficeFurniture");
                while (rs.next()) {
                    fw.append(Integer.toString(rs.getInt(1)));
                    fw.append(',');
                    fw.append(rs.getString(2));
                    fw.append(',');
                    fw.append(rs.getString(3));
                    fw.append('\n');
                }
                rs.close();
            }
            else if(table == "Refrigerators"){
                ResultSet rs = stmt.executeQuery("SELECT * FROM Refrigerators");
                while (rs.next()) {
                    fw.append(Integer.toString(rs.getInt(1)));
                    fw.append(',');
                    fw.append(rs.getString(2));
                    fw.append(',');
                    fw.append(rs.getString(3));
                    fw.append('\n');
                }
                rs.close();
            }
            else if(table == "Ring"){
                ResultSet rs = stmt.executeQuery("SELECT * FROM Ring");
                while (rs.next()) {
                    fw.append(Integer.toString(rs.getInt(1)));
                    fw.append(',');
                    fw.append(rs.getString(2));
                    fw.append(',');
                    fw.append(rs.getString(3));
                    fw.append(',');
                    fw.append(rs.getString(4));
                    fw.append('\n');
                }
                rs.close();
            }
            else if(table == "Scooter"){
                ResultSet rs = stmt.executeQuery("SELECT * FROM Scooter");
                while (rs.next()) {
                    fw.append(Integer.toString(rs.getInt(1)));
                    fw.append(',');
                    fw.append(rs.getString(2));
                    fw.append(',');
                    fw.append(rs.getString(3));
                    fw.append(',');
                    fw.append(rs.getString(4));
                    fw.append(',');
                    fw.append(rs.getString(5));
                    fw.append('\n');
                }
                rs.close();
            }
            else if(table == "Skateboard"){
                ResultSet rs = stmt.executeQuery("SELECT * FROM Skateboard");
                while (rs.next()) {
                    fw.append(Integer.toString(rs.getInt(1)));
                    fw.append(',');
                    fw.append(rs.getString(2));
                    fw.append(',');
                    fw.append(rs.getString(3));
                    fw.append(',');
                    fw.append(rs.getString(4));
                    fw.append(',');
                    fw.append(rs.getString(5));
                    fw.append('\n');
                }
                rs.close();
            }
            else if(table == "Tablet"){
                ResultSet rs = stmt.executeQuery("SELECT * FROM Tablet");
                while (rs.next()) {
                    fw.append(Integer.toString(rs.getInt(1)));
                    fw.append(',');
                    fw.append(rs.getString(2));
                    fw.append(',');
                    fw.append(rs.getString(3));
                    fw.append(',');
                    fw.append(rs.getString(4));
                    fw.append('\n');
                }
                rs.close();
            }
            else if(table == "TV"){
                ResultSet rs = stmt.executeQuery("SELECT * FROM TV");
                while (rs.next()) {
                    fw.append(Integer.toString(rs.getInt(1)));
                    fw.append(',');
                    fw.append(rs.getString(2));
                    fw.append(',');
                    fw.append(rs.getString(3));
                    fw.append(',');
                    fw.append(rs.getString(4));
                    fw.append('\n');
                }
                rs.close();
            }
            else if(table == "WashersandDryers"){
                ResultSet rs = stmt.executeQuery("SELECT * FROM WashersandDryers");
                while (rs.next()) {
                    fw.append(Integer.toString(rs.getInt(1)));
                    fw.append(',');
                    fw.append(rs.getString(2));
                    fw.append(',');
                    fw.append(rs.getString(3));
                    fw.append(',');
                    fw.append(rs.getString(4));
                    fw.append('\n');
                }
                rs.close();
            }
            fw.flush();
            fw.close();

            stmt.close();
            //connection.close();
            System.out.println("Your CSV File for " + table + " has been successfully created!");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}