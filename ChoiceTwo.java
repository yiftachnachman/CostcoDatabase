import com.mysql.cj.protocol.Resultset;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.Scanner;
import java.io.*;

public class ChoiceTwo {

    private Scanner input = new Scanner(System.in);
    private TryInput get = new TryInput();


    public void Action(Connection connection) throws SQLException {
        int catChoice = 0;
        String category = "";
        String subCategory = "";
        int subChoice = 0;
        boolean case3 = true;
        do{
            System.out.println("What category does the product belong?");
            System.out.println("1) Appliances");
            System.out.println("2) Clothing Luggage & Handbags");
            System.out.println("3) Computers");
            System.out.println("4) Electronics");
            System.out.println("5) Furniture & Mattresses");
            System.out.println("6) Home Improvement");
            System.out.println("7) Jewelry");
            System.out.println("8) Sports & Fitness");
            catChoice = get.getInt();
            switch (catChoice){
                case 1:
                    category = "Appliances";
                    case3 = false;
                    break;
                case 2:
                    category = "Clothing Luggage & Handbags";
                    case3 = false;
                    break;
                case 3:
                    category = "Computers";
                    case3 = false;
                    break;
                case 4:
                    category = "Electronics";
                    case3 = false;
                    break;
                case 5:
                    category = "Furniture & Mattresses";
                    case3 = false;
                    break;
                case 6:
                    category = "Home Improvement";
                    case3 = false;
                    break;
                case 7:
                    category = "Jewelry";
                    case3 = false;
                    break;
                case 8:
                    category = "Sports & Fitness";
                    case3 = false;
                    break;
                default:
                    System.out.println("Please enter a valid option.");
            }
        }
        while(case3);
        System.out.println("What is the product's subcategory?");
        boolean case4 = true;
        do{
            switch (catChoice){
                case 1:
                    System.out.println("1) Refrigerators");
                    System.out.println("2) Washers & Dryers");
                    System.out.println("3) Cooking Appliances");
                    subChoice = get.getIntChoices();
                    if (subChoice == 1){
                        subCategory = "Refrigerators";
                        case4 = false;
                    }
                    else if (subChoice == 2){
                        subCategory = "Washers & Dryers";
                        case4 = false;
                    }
                    else if (subChoice == 3){
                        subCategory = "Cooking Appliances";
                        case4 = false;
                    }
                    else{
                        System.out.println("Please enter a valid option.");
                    }
                    break;
                case 2:
                    System.out.println("1) Luggage");
                    subChoice = get.getIntChoices();
                    if (subChoice == 1){
                        subCategory = "Luggage";
                        case4 = false;
                    }
                    else{
                        System.out.println("Please enter a valid option.");
                    }
                    break;
                case 3:
                    System.out.println("1) Laptop");
                    System.out.println("2) Desktop");
                    System.out.println("3) Tablet");
                    subChoice = get.getIntChoices();
                    if (subChoice == 1){
                        subCategory = "Laptop";
                        case4 = false;
                    }
                    else if (subChoice == 2){
                        subCategory = "Desktop";
                        case4 = false;
                    }
                    else if (subChoice == 3){
                        subCategory = "Tablet";
                        case4 = false;
                    }
                    else{
                        System.out.println("Please enter a valid option.");
                    }
                    break;
                case 4:
                    System.out.println("1) Tv");
                    System.out.println("2) Headphones");
                    subChoice = get.getIntChoices();
                    if (subChoice == 1){
                        subCategory = "Tv";
                        case4 = false;
                    }
                    if (subChoice == 2){
                        subCategory = "Headphones";
                        case4 = false;
                    }
                    else{
                        System.out.println("Please enter a valid option.");
                    }
                    break;
                case 5:
                    System.out.println("1) Office Furniture");
                    System.out.println("2) Mattresses");
                    System.out.println("3) Bedroom Collections");
                    subChoice = get.getIntChoices();
                    if (subChoice == 1){
                        subCategory = "Office Furniture";
                        case4 = false;
                    }
                    else if (subChoice == 2){
                        subCategory = "Mattresses";
                        case4 = false;
                    }
                    else if (subChoice == 3){
                        subCategory = "Bedroom Collections";
                        case4 = false;
                    }
                    else{
                        System.out.println("Please enter a valid option.");
                    }
                    break;
                case 6:
                    System.out.println("1) Ceiling Fan");
                    subChoice = get.getIntChoices();
                    if (subChoice == 1){
                        subCategory = "Ceiling Fan";
                        case4 = false;
                    }
                    else{
                        System.out.println("Please enter a valid option.");
                    }
                    break;
                case 7:
                    System.out.println("1) Ring");
                    System.out.println("2) Pendant");
                    subChoice = get.getIntChoices();
                    if (subChoice == 1){
                        subCategory = "Ring";
                        case4 = false;
                    }
                    else if (subChoice == 2){
                        subCategory = "Pendant";
                        case4 = false;
                    }
                    else{
                        System.out.println("Please enter a valid option.");
                    }
                    break;
                case 8:
                    System.out.println("1) Bike");
                    System.out.println("2) Skateboard");
                    System.out.println("3) Scooter");
                    subChoice = get.getIntChoices();
                    if (subChoice == 1){
                        subCategory = "Bike";
                        case4 = false;
                    }
                    else if (subChoice == 2){
                        subCategory = "Skateboard";
                        case4 = false;
                    }
                    else if (subChoice ==3 ){
                        subCategory = "Scooter";
                        case4 = false;
                    }
                    else{
                        System.out.println("Please enter a valid option.");
                    }
                    break;
            }
        }while(case4);

        boolean checkID = true;
        int productNumber = 0;
        do{
            System.out.print("What is the product number?: ");
            productNumber = get.getInt();
            int tempCheck = 0;
            PreparedStatement checkExist = connection.prepareStatement("SELECT ProductID FROM  Products WHERE ProductID = ?");
            checkExist.setInt(1, productNumber);
            ResultSet rs = checkExist.executeQuery();
            while (rs.next()){
                tempCheck = rs.getInt(1);
            }
            if (tempCheck == productNumber){
                System.out.println("Product already exists.");
                System.out.println("Please try again.");
                System.out.println();
            }
            else{
                checkID = false;
            }
        }while(checkID);
        System.out.print("What is the product's name?: ");
        String productName = input.next();
        System.out.println("What is the product's model number?");
        System.out.print("Insert NULL if unavailable: ");
        String model = input.next();
        System.out.print("What is its manufacturer?: ");
        String manufacturer = input.next();
        System.out.print("What is the stock on the product?: ");
        int stock = get.getInt();
        System.out.print("What is the price of the product?: ");
        float price = get.getFloat();
        System.out.println("What is the warranty of the product?: ");
        input.nextLine();
        String warranty = input.nextLine();
        int membership = 0;
        do{
            System.out.println("Is the product only available for members?");
            System.out.println("1) Yes");
            System.out.println("2) No");
            membership = get.getIntChoices();
            if (membership == 1 || membership == 2){
                break;
            }
        }
        while(true);
        int shippingID = 0;
        do{
            System.out.println("What shipping company ships the product?");
            System.out.println("1) FEDEX");
            System.out.println("2) UPS");
            System.out.println("3) SAG");
            shippingID = get.getIntChoices();
            if (shippingID == 1 || shippingID == 2 || shippingID == 3){
                break;
            }
        }while(true);
        Insert(connection, productNumber, productName, category, subCategory, model, manufacturer, stock, price, warranty, membership, shippingID);
    }

    public int getHighestValue(Connection connection, String category) throws SQLException {
        int subCategoryID = 0;
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT MAX(SubCategoryID) FROM " + category);
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()){
            subCategoryID = rs.getInt(1);
        }
        return subCategoryID;
    }

    public void Insert(Connection connection, int productNumber, String productName, String category, String subCategory, String model, String manufacturer, int stock, float price, String warranty, int membership, int shippingID) throws SQLException {


        try (Statement statement = connection.createStatement()){
            statement.execute("BEGIN");
            try{
                PreparedStatement insertProduct = connection.prepareStatement("INSERT INTO Products(productid, productname, category, subcategory, modelnumber, manufacturer, stock, price, warranty, membershiponly, shippingid) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                insertProduct.setInt(1, productNumber);
                insertProduct.setString(2, productName);
                insertProduct.setString(3, category);
                insertProduct.setString(4, subCategory);
                insertProduct.setString(5, model);
                insertProduct.setString(6, manufacturer);
                insertProduct.setInt(7, stock);
                insertProduct.setFloat(8, price);
                insertProduct.setString(9, warranty);
                insertProduct.setInt(10, membership);
                insertProduct.setInt(11, shippingID);
                insertProduct.executeUpdate();

                switch (subCategory){
                    case "Refrigerators":
                        System.out.print("Enter refrigerator's dimensions: ");
                        String dimension = input.next();
                        System.out.println("Enter refrigerator's weight: ");
                        input.nextLine();
                        String weight = input.nextLine();

                        PreparedStatement insertFridge = connection.prepareStatement("INSERT INTO Refrigerators(ProductID, ProductName, Dimension, Weight) VALUES(?, ?, ?, ?)");
                        insertFridge.setInt(1, productNumber);
                        insertFridge.setString(2, productName);
                        insertFridge.setString(3, dimension);
                        insertFridge.setString(4, weight);
                        insertFridge.executeUpdate();
                        break;
                    case "Washers & Dryers":
                        System.out.print("Enter type (Washer/Dryer): ");
                        String type = input.next();
                        System.out.println("Enter Dimension: ");
                        input.nextLine();
                        String dimension2 = input.nextLine();
                        System.out.println("Enter Weight: ");
                        String weight2 = input.nextLine();

                        PreparedStatement insertWasher = connection.prepareStatement("INSERT INTO WashersAndDryers(ProductID, ProductName, Type, Dimension, Weight) VALUES (?, ?, ?, ?, ?)");
                        insertWasher.setInt(1, productNumber);
                        insertWasher.setString(2, productName);
                        insertWasher.setString(3, type);
                        insertWasher.setString(4, dimension2);
                        insertWasher.setString(5, weight2);
                        insertWasher.executeUpdate();
                        break;
                    case "Cooking Appliances":
                        System.out.print("Enter Type (Electric Oven/Gas Stove/etc): ");
                        String type2 = input.next();
                        System.out.println("Enter Dimension: ");
                        input.nextLine();
                        String dimension3 = input.nextLine();

                        PreparedStatement insertCooking = connection.prepareStatement("INSERT INTO CookingAppliances(ProductID, ProductName, Type, Dimension) VALUES (?,?,?,?)");
                        insertCooking.setInt(1, productNumber);
                        insertCooking.setString(2, productName);
                        insertCooking.setString(3, type2);
                        insertCooking.setString(4, dimension3);
                        insertCooking.executeUpdate();
                        break;
                    case "Luggage":
                        System.out.print("Enter Dimension: ");
                        String lugDimension = input.next();
                        System.out.println("Enter color: ");
                        input.nextLine();
                        String lugColor = input.nextLine();
                        System.out.println("Enter number of pieces in the set: ");
                        int lugSet = get.getInt();

                        PreparedStatement insertLuggage = connection.prepareStatement("INSERT INTO Luggage(productid, productname, dimension, color, numset) VALUES (?,?,?,?,?)");
                        insertLuggage.setInt(1, productNumber);
                        insertLuggage.setString(2, productName);
                        insertLuggage.setString(3, lugDimension);
                        insertLuggage.setString(4, lugColor);
                        insertLuggage.setInt(5, lugSet);
                        insertLuggage.executeUpdate();
                        break;
                    case "Laptop":
                        System.out.print("Enter Operating System: ");
                        String laptopOS = input.next();
                        System.out.println("Enter Processor: ");
                        input.nextLine();
                        String laptopProc = input.nextLine();
                        System.out.println("Enter RAM: ");
                        String laptopRAM = input.nextLine();
                        System.out.println("Enter Screen Size: ");
                        String laptopScreen = input.nextLine();
                        System.out.println("Enter Storage Type: ");
                        String laptopStorage = input.nextLine();

                        PreparedStatement insertLaptop = connection.prepareStatement("INSERT INTO Laptop(ProductID, ProductName, OperatingSystem, Processor, RAM, ScreenSize, StorageType) VALUES (?,?,?,?,?,?,)");
                        insertLaptop.setInt(1, productNumber);
                        insertLaptop.setString(2, productName);
                        insertLaptop.setString(3, laptopOS);
                        insertLaptop.setString(4, laptopProc);
                        insertLaptop.setString(5, laptopRAM);
                        insertLaptop.setString(6, laptopScreen);
                        insertLaptop.setString(7, laptopStorage);
                        insertLaptop.executeUpdate();
                        break;
                    case "Desktop":
                        System.out.print("Enter Operating System: ");
                        String desktopOS = input.next();
                        System.out.println("Enter Processor: ");
                        input.nextLine();
                        String desktopProc = input.nextLine();
                        System.out.println("Enter RAM: ");
                        String desktopRAM = input.nextLine();
                        System.out.println("Enter Storage Type: ");
                        String desktopStor = input.nextLine();

                        PreparedStatement insertDekstop = connection.prepareStatement("INSERT INTO Desktop(ProductID, ProductName, OperatingSystem, Processor, RAM, StorageType) VALUES (?,?,?,?,?,?)");
                        insertDekstop.setInt(1, productNumber);
                        insertDekstop.setString(2, productName);
                        insertDekstop.setString(3, desktopOS);
                        insertDekstop.setString(4, desktopProc);
                        insertDekstop.setString(5, desktopRAM);
                        insertDekstop.setString(6, desktopStor);
                        insertDekstop.executeUpdate();
                        break;
                    case "Tablet":
                        System.out.print("Enter Operating System: ");
                        String tabletOS = input.next();
                        System.out.println("Enter Screen Size: ");
                        input.nextLine();
                        String tabletScreen = input.nextLine();
                        System.out.println("Enter Color: ");
                        String tabletColor = input.nextLine();

                        PreparedStatement insertTablet = connection.prepareStatement("INSERT INTO Tablet(productid, productname, operatingsystem, screensize, color) VALUES (?,?,?,?,?)");
                        insertTablet.setInt(1, productNumber);
                        insertTablet.setString(2, productName);
                        insertTablet.setString(3, tabletOS);
                        insertTablet.setString(4, tabletScreen);
                        insertTablet.setString(5, tabletColor);
                        insertTablet.executeUpdate();
                        break;
                    case "Tv":
                        System.out.print("Enter Dimension: ");
                        String tvDimen = input.next();
                        System.out.println("Enter display type: ");
                        input.nextLine();
                        String tvDisplay = input.nextLine();
                        System.out.println("0) Smart TV");
                        System.out.println("1) Not a Smart TV");
                        int tvSmart = get.getIntChoices();

                        PreparedStatement insertTV = connection.prepareStatement("INSERT INTO TV(productid, productname, dimension, displaytype, smarttv) VALUES (?,?,?,?,?)");
                        insertTV.setInt(1, productNumber);
                        insertTV.setString(2, productName);
                        insertTV.setString(3, tvDimen);
                        insertTV.setString(4, tvDisplay);
                        insertTV.setInt(5, tvSmart);
                        insertTV.executeUpdate();
                        break;
                    case "Headphones":
                        System.out.print("Enter Color: ");
                        String headColor = input.next();
                        System.out.println("Enter Battery life: ");
                        input.nextLine();
                        String headBattery = input.nextLine();
                        System.out.println("0) Wireless: ");
                        System.out.println("1) Not Wireless: ");
                        int headWireless = get.getIntChoices();

                        PreparedStatement insertHead = connection.prepareStatement("INSERT INTO Headphones(productid, productname, color, batterylife, wireless) VALUES (?,?,?,?,?)");
                        insertHead.setInt(1, productNumber);
                        insertHead.setString(2, productName);
                        insertHead.setString(3, headColor);
                        insertHead.setString(4, headBattery);
                        insertHead.setInt(5, headWireless);
                        insertHead.executeUpdate();
                        break;
                    case "Office Furniture":
                        System.out.print("Enter Color: ");
                        String officeColor = input.next();
                        System.out.println("Enter Dimension: ");
                        input.nextLine();
                        String officeDimen = input.nextLine();

                        PreparedStatement insertOffice = connection.prepareStatement("INSERT INTO OfficeFurniture(ProductID, ProductName, Color, Dimension) VALUES (?,?,?,?)");
                        insertOffice.setInt(1, productNumber);
                        insertOffice.setString(2, productName);
                        insertOffice.setString(3, officeColor);
                        insertOffice.setString(4, officeDimen);
                        insertOffice.executeUpdate();
                        break;
                    case "Mattresses":
                        System.out.print("Enter Color: ");
                        String mattColor = input.next();
                        System.out.println("Enter Dimension: ");
                        input.nextLine();
                        String mattDimen = input.nextLine();
                        System.out.println("Enter Bed Size: ");
                        String mattSize = input.nextLine();

                        PreparedStatement insertMatt = connection.prepareStatement("INSERT INTO Mattresses(productid, productname, color, dimension, bedsize) VALUES (?,?,?,?,?)");
                        insertMatt.setInt(1, productNumber);
                        insertMatt.setString(2, productName);
                        insertMatt.setString(3, mattColor);
                        insertMatt.setString(4, mattDimen);
                        insertMatt.setString(5, mattSize);
                        insertMatt.executeUpdate();
                        break;
                    case "Bedroom Collections":
                        System.out.print("Enter Color: ");
                        String bedColor = input.next();
                        System.out.println("Enter Dimension: ");
                        input.nextLine();
                        String bedDim = input.nextLine();
                        System.out.println("Enter Type: ");
                        String bedType = input.nextLine();

                        PreparedStatement insertBed = connection.prepareStatement("INSERT INTO BedroomCollections(productid, productname, color, dimension, type) VALUES (?,?,?,?,?)");
                        insertBed.setInt(1, productNumber);
                        insertBed.setString(2, productName);
                        insertBed.setString(3, bedColor);
                        insertBed.setString(4, bedDim);
                        insertBed.setString(5, bedType);
                        insertBed.executeUpdate();
                        break;
                    case "Ceiling Fan":
                        System.out.print("Enter Fan Size: ");
                        String fanSize = input.next();
                        System.out.println("Enter Color: ");
                        input.nextLine();
                        String fanColor = input.nextLine();
                        System.out.println("0) LED: ");
                        System.out.println("1) Not LED: ");
                        int fanLED = input.nextInt();

                        PreparedStatement insertFan = connection.prepareStatement("INSERT INTO CeilingFan(productid, productname, fansize, color, led) VALUES (?,?,?,?,?)");
                        insertFan.setInt(1, productNumber);
                        insertFan.setString(2, productName);
                        insertFan.setString(3, fanSize);
                        insertFan.setString(4, fanColor);
                        insertFan.setInt(5, fanLED);
                        insertFan.executeUpdate();
                        break;
                    case "Ring":
                        System.out.print("Enter CTW: ");
                        String ringCTW = input.next();
                        System.out.println("Enter Clarity: ");
                        input.nextLine();
                        String ringClar = input.nextLine();
                        System.out.println("Enter Color: ");
                        String ringColor = input.nextLine();

                        PreparedStatement insertRing = connection.prepareStatement("INSERT INTO Ring(productid, productname, ctw, clarity, color) VALUES (?,?,?,?,?)");
                        insertRing.setInt(1, productNumber);
                        insertRing.setString(2, productName);
                        insertRing.setString(3, ringCTW);
                        insertRing.setString(4, ringClar);
                        insertRing.setString(5, ringColor);
                        insertRing.executeUpdate();
                        break;
                    case "Pendant":
                        System.out.print("Enter CTW: ");
                        String pendCTW = input.next();
                        System.out.println("Enter Clarity: ");
                        input.nextLine();
                        String pendClar = input.nextLine();
                        System.out.println("Enter Color: ");
                        String pendColor = input.nextLine();

                        PreparedStatement insertPend = connection.prepareStatement("INSERT INTO Pendant(productid, productname, ctw, clarity, color) VALUES (?,?,?,?,?)");
                        insertPend.setInt(1, productNumber);
                        insertPend.setString(2, productName);
                        insertPend.setString(3, pendCTW);
                        insertPend.setString(4, pendClar);
                        insertPend.setString(5, pendColor);
                        insertPend.executeUpdate();
                        break;
                    case "Bike":
                        System.out.print("Enter FrameSize: ");
                        String bikeFrame = input.next();
                        System.out.println("Enter Tire Size: ");
                        input.nextLine();
                        String bikeTire = input.nextLine();
                        System.out.println("Enter Color: ");
                        String bikeColor = input.nextLine();
                        System.out.println("Enter Height for User: ");
                        String bikeUser = input.nextLine();

                        PreparedStatement insertBike = connection.prepareStatement("INSERT INTO Bike(productid, productname, framesize, tiresize, color, heightforuser) VALUES (?,?,?,?,?,?)");
                        insertBike.setInt(1, productNumber);
                        insertBike.setString(2, productName);
                        insertBike.setString(3, bikeFrame);
                        insertBike.setString(4, bikeTire);
                        insertBike.setString(5, bikeColor);
                        insertBike.setString(6, bikeUser);
                        insertBike.executeUpdate();
                        break;
                    case "Skateboard":
                        System.out.print("Enter FrameSize: ");
                        String skateFrame = input.next();
                        System.out.println("Enter Tire Size: ");
                        input.nextLine();
                        String skateTire = input.nextLine();
                        System.out.println("Enter Color: ");
                        String skateColor = input.nextLine();
                        System.out.println("Enter Height for User: ");
                        String skateUser = input.nextLine();

                        PreparedStatement insertSkate = connection.prepareStatement("INSERT INTO Skateboard(productid, productname, framesize, tiresize, color, heightforuser) VALUES (?,?,?,?,?,?)");
                        insertSkate.setInt(1, productNumber);
                        insertSkate.setString(2, productName);
                        insertSkate.setString(3, skateFrame);
                        insertSkate.setString(4, skateTire);
                        insertSkate.setString(5, skateColor);
                        insertSkate.setString(6, skateUser);
                        insertSkate.executeUpdate();
                        break;
                    case "Scooter":
                        System.out.print("Enter FrameSize: ");
                        String scootFrame = input.next();
                        System.out.println("Enter Tire Size: ");
                        input.nextLine();
                        String scootTire = input.nextLine();
                        System.out.println("Enter Color: ");
                        String scootColor = input.nextLine();
                        System.out.println("Enter Height for User: ");
                        String scootUser = input.nextLine();

                        PreparedStatement inserScoot = connection.prepareStatement("INSERT INTO Scooter(productid, productname, framesize, tiresize, color, heightforuser) VALUES (?,?,?,?,?,?)");
                        inserScoot.setInt(1, productNumber);
                        inserScoot.setString(2, productName);
                        inserScoot.setString(3, scootFrame);
                        inserScoot.setString(4, scootTire);
                        inserScoot.setString(5, scootColor);
                        inserScoot.setString(6, scootUser);
                        inserScoot.executeUpdate();
                        break;
                }
                statement.execute("COMMIT");
            }catch (SQLException failure){
                statement.execute("ROLLBACK");
                System.out.println("Transaction Failure");
                System.out.println("Rollback Initiated");
            }
        }
    }
}
