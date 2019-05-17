import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.Scanner;

public class ChoiceOne {

    private Scanner input = new Scanner(System.in);
    private TryInput get = new TryInput();


    public void Action(Connection connection) throws SQLException {

        int choice = 0;
        boolean case1 = true;
        do{
            System.out.println("1) View Tables");
            System.out.println("2) View Full Product Information");
            System.out.println("3) View Calculated Options");
            choice = get.getIntChoices();
            switch (choice){
                case 1:
                    int tableChoice = 0;
                    boolean case2 = true;
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
                        tableChoice = get.getIntChoices();
                        Statement tableStatement = connection.createStatement();
                        int columnNumber = 0;
                        switch (tableChoice){
                            case 1:
                                ResultSet product = tableStatement.executeQuery("SELECT * FROM Products");
                                ResultSetMetaData productmd = product.getMetaData();
                                columnNumber = productmd.getColumnCount();
                                while (product.next()){
                                    for (int i = 1; i <= columnNumber; ++i){
                                        System.out.print(product.getString(i) + ", ");
                                    }
                                    System.out.println();
                                }
                                case2 = false;
                                break;
                            case 2:
                                ResultSet bed = tableStatement.executeQuery("SELECT * FROM BedroomCollections");
                                ResultSetMetaData bedmd = bed.getMetaData();
                                columnNumber = bedmd.getColumnCount();
                                while (bed.next()){
                                    for (int i = 1; i <= columnNumber; ++i){
                                        System.out.print(bed.getString(i) + ", ");
                                    }
                                    System.out.println();
                                }
                                case2 = false;
                                break;
                            case 3:
                                ResultSet bike = tableStatement.executeQuery("SELECT * FROM Bike");
                                ResultSetMetaData bikemd = bike.getMetaData();
                                columnNumber = bikemd.getColumnCount();
                                while (bike.next()){
                                    for (int i = 1; i <= columnNumber; ++i){
                                        System.out.print(bike.getString(i) + ", ");
                                    }
                                    System.out.println();
                                }
                                case2 = false;
                                break;
                            case 4:
                                ResultSet fan = tableStatement.executeQuery("SELECT * FROM CeilingFan");
                                ResultSetMetaData fanmd = fan.getMetaData();
                                columnNumber = fanmd.getColumnCount();
                                while (fan.next()){
                                    for (int i = 1; i <= columnNumber; ++i){
                                        System.out.print(fan.getString(i) + ", ");
                                    }
                                    System.out.println();
                                }
                                case2 = false;
                                break;
                            case 5:
                                ResultSet cook = tableStatement.executeQuery("SELECT * FROM CookingAppliances");
                                ResultSetMetaData cookmd = cook.getMetaData();
                                columnNumber = cookmd.getColumnCount();
                                while (cook.next()){
                                    for (int i = 1; i <= columnNumber; ++i){
                                        System.out.print(cook.getString(i) + ", ");
                                    }
                                    System.out.println();
                                }
                                case2 = false;
                                break;
                            case 6:
                                ResultSet desktop = tableStatement.executeQuery("SELECT * FROM Desktop");
                                ResultSetMetaData desktopmd = desktop.getMetaData();
                                columnNumber = desktopmd.getColumnCount();
                                while (desktop.next()){
                                    for (int i = 1; i <= columnNumber; ++i){
                                        System.out.print(desktop.getString(i) + ", ");
                                    }
                                    System.out.println();
                                }
                                case2 = false;
                                break;
                            case 7:
                                ResultSet head = tableStatement.executeQuery("SELECT * FROM Headphones");
                                ResultSetMetaData headmd = head.getMetaData();
                                columnNumber = headmd.getColumnCount();
                                while (head.next()){
                                    for (int i = 1; i <= columnNumber; ++i){
                                        System.out.print(head.getString(i) + ", ");
                                    }
                                    System.out.println();
                                }
                                case2 = false;
                                break;
                            case 8:
                                ResultSet laptop = tableStatement.executeQuery("SELECT * FROM Laptop");
                                ResultSetMetaData laptopmd = laptop.getMetaData();
                                columnNumber = laptopmd.getColumnCount();
                                while (laptop.next()){
                                    for (int i = 1; i <= columnNumber; ++i){
                                        System.out.print(laptop.getString(i) + ", ");
                                    }
                                    System.out.println();
                                }
                                case2 = false;
                                break;
                            case 9:
                                ResultSet lug = tableStatement.executeQuery("SELECT * FROM Luggage");
                                ResultSetMetaData lugmd = lug.getMetaData();
                                columnNumber = lugmd.getColumnCount();
                                while (lug.next()){
                                    for (int i = 1; i <= columnNumber; ++i){
                                        System.out.print(lug.getString(i) + ", ");
                                    }
                                    System.out.println();
                                }
                                case2 = false;
                                break;
                            case 10:
                                ResultSet matt = tableStatement.executeQuery("SELECT * FROM Mattresses");
                                ResultSetMetaData mattmd = matt.getMetaData();
                                columnNumber = mattmd.getColumnCount();
                                while (matt.next()){
                                    for (int i = 1; i <= columnNumber; ++i){
                                        System.out.print(matt.getString(i) + ", ");
                                    }
                                    System.out.println();
                                }
                                case2 = false;
                                break;
                            case 11:
                                ResultSet office = tableStatement.executeQuery("SELECT * FROM OfficeFurniture");
                                ResultSetMetaData officemd = office.getMetaData();
                                columnNumber = officemd.getColumnCount();
                                while (office.next()){
                                    for (int i = 1; i <= columnNumber; ++i){
                                        System.out.print(office.getString(i) + ", ");
                                    }
                                    System.out.println();
                                }
                                case2 = false;
                                break;
                            case 12:
                                ResultSet pend = tableStatement.executeQuery("SELECT * FROM Pendant");
                                ResultSetMetaData pendmd = pend.getMetaData();
                                columnNumber = pendmd.getColumnCount();
                                while (pend.next()){
                                    for (int i = 1; i <= columnNumber; ++i){
                                        System.out.print(pend.getString(i) + ", ");
                                    }
                                    System.out.println();
                                }
                                case2 = false;
                                break;
                            case 13:
                                ResultSet refri = tableStatement.executeQuery("SELECT * FROM Refrigerators");
                                ResultSetMetaData refrimd = refri.getMetaData();
                                columnNumber = refrimd.getColumnCount();
                                while (refri.next()){
                                    for (int i = 1; i <= columnNumber; ++i){
                                        System.out.print(refri.getString(i) + ", ");
                                    }
                                    System.out.println();
                                }
                                case2 = false;
                                break;
                            case 14:
                                ResultSet ring = tableStatement.executeQuery("SELECT * FROM Ring");
                                ResultSetMetaData ringmd = ring.getMetaData();
                                columnNumber = ringmd.getColumnCount();
                                while (ring.next()){
                                    for (int i = 1; i <= columnNumber; ++i){
                                        System.out.print(ring.getString(i) + ", ");
                                    }
                                    System.out.println();
                                }
                                case2 = false;
                                break;
                            case 15:
                                ResultSet scoot = tableStatement.executeQuery("SELECT * FROM Scooter");
                                ResultSetMetaData scootmd = scoot.getMetaData();
                                columnNumber = scootmd.getColumnCount();
                                while (scoot.next()){
                                    for (int i = 1; i <= columnNumber; ++i){
                                        System.out.print(scoot.getString(i) + ", ");
                                    }
                                    System.out.println();
                                }
                                case2 = false;
                                break;
                            case 16:
                                ResultSet skate = tableStatement.executeQuery("SELECT * FROM Skateboard");
                                ResultSetMetaData skatemd = skate.getMetaData();
                                columnNumber = skatemd.getColumnCount();
                                while (skate.next()){
                                    for (int i = 1; i <= columnNumber; ++i){
                                        System.out.print(skate.getString(i) + ", ");
                                    }
                                    System.out.println();
                                }
                                case2 = false;
                                break;
                            case 17:
                                ResultSet tab = tableStatement.executeQuery("SELECT * FROM Tablet");
                                ResultSetMetaData tabmd = tab.getMetaData();
                                columnNumber = tabmd.getColumnCount();
                                while (tab.next()){
                                    for (int i = 1; i <= columnNumber; ++i){
                                        System.out.print(tab.getString(i) + ", ");
                                    }
                                    System.out.println();
                                }
                                case2 = false;
                                break;
                            case 18:
                                ResultSet tv = tableStatement.executeQuery("SELECT * FROM TV");
                                ResultSetMetaData tvmd = tv.getMetaData();
                                columnNumber = tvmd.getColumnCount();
                                while (tv.next()){
                                    for (int i = 1; i <= columnNumber; ++i){
                                        System.out.print(tv.getString(i) + ", ");
                                    }
                                    System.out.println();
                                }
                                case2 = false;
                                break;
                            case 19:
                                ResultSet wash = tableStatement.executeQuery("SELECT * FROM WashersAndDryers");
                                ResultSetMetaData washmd = wash.getMetaData();
                                columnNumber = washmd.getColumnCount();
                                while (wash.next()){
                                    for (int i = 1; i <= columnNumber; ++i){
                                        System.out.print(wash.getString(i) + ", ");
                                    }
                                    System.out.println();
                                }
                                case2 = false;
                                break;
                            default:
                                System.out.println("Please enter a valid option.");
                        }
                    }while(case2);
                    case1 = false;
                    break;
                case 2:

                    
                    boolean case3= true;
                    String subCategory = "";
                    int productChoice = 0;
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
                            case3 = false;
                        }
                    } while (case3);

                    PreparedStatement getSubCat = connection.prepareStatement("SELECT SubCategory FROM Products WHERE ProductID = ?");
                    getSubCat.setInt(1, productChoice);
                    ResultSet subCat = getSubCat.executeQuery();
                    while (subCat.next()) {
                        subCategory = subCat.getString(1);
                    }

                    int columnNumber = 0;
                    switch(subCategory){
                        case "Bedroom Collections":
                            PreparedStatement bedStatement = connection.prepareStatement("CREATE VIEW Results AS SELECT Products.ProductID, Products.ProductName, Category, SubCategory, ModelNumber, Manufacturer, Stock, Price, Warranty, MembershipOnly, Products.ShippingID, CompanyName, ShippingSpeed, ShippingArea, Color, Dimension, Type FROM ((Products INNER JOIN BedroomCollections ON BedroomCollections.ProductID = Products.ProductID) INNER JOIN Shipping ON Shipping.ShippingID = Products.ShippingID) WHERE Products.ProductID = ?");
                            bedStatement.setInt(1, productChoice);
                            bedStatement.execute();
                            Statement bedTable = connection.createStatement();
                            ResultSet bedTab = bedTable.executeQuery("SELECT * FROM Results");
                            ResultSetMetaData bedmd = bedTab.getMetaData();
                            columnNumber = bedmd.getColumnCount();
                            while (bedTab.next()){
                                for (int i = 1; i <= columnNumber; ++i){
                                    if (i != columnNumber){
                                        System.out.print(bedTab.getString(i) + ", ");
                                    }
                                    else{
                                        System.out.print(bedTab.getString(i));
                                    }
                                }
                                System.out.println();
                            }
                            Statement bedView = connection.createStatement();
                            bedView.executeUpdate("DROP VIEW Results");
                            break;
                        case "Bike":
                            PreparedStatement bikestatement = connection.prepareStatement("CREATE VIEW Results AS SELECT Products.ProductID, Products.ProductName, Category, SubCategory, ModelNumber, Manufacturer, Stock, Price, Warranty, MembershipOnly, Products.ShippingID, CompanyName, ShippingSpeed, ShippingArea, TireSize, Color, HeightForUser FROM ((Products INNER JOIN Bike ON Bike.ProductID = Products.ProductID) INNER JOIN Shipping ON Shipping.ShippingID = Products.ShippingID) WHERE Products.ProductID = ?");
                            bikestatement.setInt(1, productChoice);
                            bikestatement.execute();
                            Statement bikeTable = connection.createStatement();
                            ResultSet bikeTab = bikeTable.executeQuery("SELECT * FROM Results");
                            ResultSetMetaData bikemd = bikeTab.getMetaData();
                            columnNumber = bikemd.getColumnCount();
                            while (bikeTab.next()){
                                for (int i = 1; i <= columnNumber; ++i){
                                    if (i != columnNumber){
                                        System.out.print(bikeTab.getString(i) + ", ");
                                    }
                                    else{
                                        System.out.print(bikeTab.getString(i));
                                    }
                                }
                                System.out.println();
                            }
                            Statement dropBike = connection.createStatement();
                            dropBike.executeUpdate("DROP VIEW Results");
                            break;
                        case "Ceiling Fan":
                            PreparedStatement fanStatement = connection.prepareStatement("CREATE VIEW Results AS SELECT Products.ProductID, Products.ProductName, Category, SubCategory, ModelNumber, Manufacturer, Stock, Price, Warranty, MembershipOnly, Products.ShippingID, CompanyName, ShippingSpeed, ShippingArea, FanSize, Color, LED FROM ((Products INNER JOIN CeilingFan ON CeilingFan.ProductID = Products.ProductID) INNER JOIN Shipping ON Shipping.ShippingID = Products.ShippingID) WHERE Products.ProductID = ?");
                            fanStatement.setInt(1, productChoice);
                            fanStatement.execute();
                            Statement fanTable = connection.createStatement();
                            ResultSet fanTab = fanTable.executeQuery("SELECT * FROM Results");
                            ResultSetMetaData fanmd = fanTab.getMetaData();
                            columnNumber = fanmd.getColumnCount();
                            while (fanTab.next()){
                                for (int i = 1; i <= columnNumber; ++i){
                                    if (i != columnNumber){
                                        System.out.print(fanTab.getString(i) + ", ");
                                    }
                                    else{
                                        System.out.print(fanTab.getString(i));
                                    }
                                }
                                System.out.println();
                            }
                            Statement fanView = connection.createStatement();
                            fanView.executeUpdate("DROP VIEW Results");
                            break;
                        case "Cooking Appliances":
                            PreparedStatement cookStatement = connection.prepareStatement("CREATE VIEW Results AS SELECT Products.ProductID, Products.ProductName, Category, SubCategory, ModelNumber, Manufacturer, Stock, Price, Warranty, MembershipOnly, Products.ShippingID, CompanyName, ShippingSpeed, ShippingArea, Type, Dimension FROM ((Products INNER JOIN CookingAppliances ON CookingAppliances.ProductID = Products.ProductID) INNER JOIN Shipping ON Shipping.ShippingID = Products.ShippingID) WHERE Products.ProductID = ?");
                            cookStatement.setInt(1, productChoice);
                            cookStatement.execute();
                            Statement cookTable = connection.createStatement();
                            ResultSet cookTAb = cookTable.executeQuery("SELECT * FROM Results");
                            ResultSetMetaData cookmd = cookTAb.getMetaData();
                            columnNumber = cookmd.getColumnCount();
                            while (cookTAb.next()){
                                for (int i = 1; i <= columnNumber; ++i){
                                    if (i != columnNumber){
                                        System.out.print(cookTAb.getString(i) + ", ");
                                    }
                                    else{
                                        System.out.print(cookTAb.getString(i));
                                    }
                                }
                                System.out.println();
                            }
                            Statement cookView = connection.createStatement();
                            cookView.executeUpdate("DROP VIEW Results");
                            break;
                        case "Desktop":
                            PreparedStatement desktopStatement = connection.prepareStatement("CREATE VIEW Results AS SELECT Products.ProductID, Products.ProductName, Category, SubCategory, ModelNumber, Manufacturer, Stock, Price, Warranty, MembershipOnly, Products.ShippingID, CompanyName, ShippingSpeed, ShippingArea, OperatingSystem, Processor, RAM, StorageTye FROM ((Products INNER JOIN Desktop ON Desktop.ProductID = Products.ProductID) INNER JOIN Shipping ON Shipping.ShippingID = Products.ShippingID) WHERE Products.ProductID = ?");
                            desktopStatement.setInt(1, productChoice);
                            desktopStatement.execute();
                            Statement desktopTable = connection.createStatement();
                            ResultSet desktopTab = desktopTable.executeQuery("SELECT * FROM Results");
                            ResultSetMetaData desktopmd = desktopTab.getMetaData();
                            columnNumber = desktopmd.getColumnCount();
                            while (desktopTab.next()){
                                for (int i = 1; i <= columnNumber; ++i){
                                    if (i != columnNumber){
                                        System.out.print(desktopTab.getString(i) + ", ");
                                    }
                                    else{
                                        System.out.print(desktopTab.getString(i));
                                    }
                                }
                                System.out.println();
                            }
                            Statement desktopView = connection.createStatement();
                            desktopView.executeUpdate("DROP VIEW Results");
                            break;
                        case "Headphones":
                            PreparedStatement headStatement = connection.prepareStatement("CREATE VIEW Results AS SELECT Products.ProductID, Products.ProductName, Category, SubCategory, ModelNumber, Manufacturer, Stock, Price, Warranty, MembershipOnly, Products.ShippingID, CompanyName, ShippingSpeed, ShippingArea, Color, BatteryLife, Wireless FROM ((Products INNER JOIN Headphones ON Headphones.ProductID = Products.ProductID) INNER JOIN Shipping ON Shipping.ShippingID = Products.ShippingID) WHERE Products.ProductID = ?");
                            headStatement.setInt(1, productChoice);
                            headStatement.execute();
                            Statement headTable = connection.createStatement();
                            ResultSet headTab = headTable.executeQuery("SELECT * FROM Results");
                            ResultSetMetaData headmd = headTab.getMetaData();
                            columnNumber = headmd.getColumnCount();
                            while (headTab.next()){
                                for (int i = 1; i <= columnNumber; ++i){
                                    if (i != columnNumber){
                                        System.out.print(headTab.getString(i) + ", ");
                                    }
                                    else{
                                        System.out.print(headTab.getString(i));
                                    }
                                }
                                System.out.println();
                            }
                            Statement headView = connection.createStatement();
                            headView.executeUpdate("DROP VIEW Results");
                            break;
                        case "Laptop":
                            PreparedStatement laptopStatement = connection.prepareStatement("CREATE VIEW Results AS SELECT Products.ProductID, Products.ProductName, Category, SubCategory, ModelNumber, Manufacturer, Stock, Price, Warranty, MembershipOnly, Products.ShippingID, CompanyName, ShippingSpeed, ShippingArea,OperatingSystem, Processor, RAM, ScreenSize, StorageType FROM ((Products INNER JOIN Laptop ON Laptop.ProductID = Products.ProductID) INNER JOIN Shipping ON Shipping.ShippingID = Products.ShippingID) WHERE Products.ProductID = ?");
                            laptopStatement.setInt(1, productChoice);
                            laptopStatement.execute();
                            Statement laptopTable = connection.createStatement();
                            ResultSet laptopTab = laptopTable.executeQuery("SELECT * FROM Results");
                            ResultSetMetaData laptopmd = laptopTab.getMetaData();
                            columnNumber = laptopmd.getColumnCount();
                            while (laptopTab.next()){
                                for (int i = 1; i <= columnNumber; ++i){
                                    if (i != columnNumber){
                                        System.out.print(laptopTab.getString(i) + ", ");
                                    }
                                    else{
                                        System.out.print(laptopTab.getString(i));
                                    }
                                }
                                System.out.println();
                            }
                            Statement laptopView = connection.createStatement();
                            laptopView.executeUpdate("DROP VIEW Results");
                            break;
                        case "Luggage":
                            PreparedStatement luggageStatement = connection.prepareStatement("CREATE VIEW Results AS SELECT Products.ProductID, Products.ProductName, Category, SubCategory, ModelNumber, Manufacturer, Stock, Price, Warranty, MembershipOnly, Products.ShippingID, CompanyName, ShippingSpeed, ShippingArea, Dimension, Color, numSet FROM ((Products INNER JOIN Luggage ON Luggage.ProductID = Products.ProductID) INNER JOIN Shipping ON Shipping.ShippingID = Products.ShippingID) WHERE Products.ProductID = ?");
                            luggageStatement.setInt(1, productChoice);
                            luggageStatement.execute();
                            Statement luggageTable = connection.createStatement();
                            ResultSet luggageTab = luggageTable.executeQuery("SELECT * FROM Results");
                            ResultSetMetaData luggagemd = luggageTab.getMetaData();
                            columnNumber = luggagemd.getColumnCount();
                            while (luggageTab.next()){
                                for (int i = 1; i <= columnNumber; ++i){
                                    if (i != columnNumber){
                                        System.out.print(luggageTab.getString(i) + ", ");
                                    }
                                    else{
                                        System.out.print(luggageTab.getString(i));
                                    }
                                }
                                System.out.println();
                            }
                            Statement luggageView = connection.createStatement();
                            luggageView.executeUpdate("DROP VIEW Results");
                            break;
                        case "Mattresses":
                            PreparedStatement mattStatement = connection.prepareStatement("CREATE VIEW Results AS SELECT Products.ProductID, Products.ProductName, Category, SubCategory, ModelNumber, Manufacturer, Stock, Price, Warranty, MembershipOnly, Products.ShippingID, CompanyName, ShippingSpeed, ShippingArea, Color, Dimension, BedSize FROM ((Products INNER JOIN Mattresses ON Mattresses.ProductID = Products.ProductID) INNER JOIN Shipping ON Shipping.ShippingID = Products.ShippingID) WHERE Products.ProductID = ?");
                            mattStatement.setInt(1, productChoice);
                            mattStatement.execute();
                            Statement mattTable = connection.createStatement();
                            ResultSet mattTab = mattTable.executeQuery("SELECT * FROM Results");
                            ResultSetMetaData mattmd = mattTab.getMetaData();
                            columnNumber = mattmd.getColumnCount();
                            while (mattTab.next()){
                                for (int i = 1; i <= columnNumber; ++i){
                                    if (i != columnNumber){
                                        System.out.print(mattTab.getString(i) + ", ");
                                    }
                                    else{
                                        System.out.print(mattTab.getString(i));
                                    }
                                }
                                System.out.println();
                            }
                            Statement mattView = connection.createStatement();
                            mattView.executeUpdate("DROP VIEW Results");
                            break;
                        case "Office Furniture":
                            PreparedStatement offStatement = connection.prepareStatement("CREATE VIEW Results AS SELECT Products.ProductID, Products.ProductName, Category, SubCategory, ModelNumber, Manufacturer, Stock, Price, Warranty, MembershipOnly, Products.ShippingID, CompanyName, ShippingSpeed, ShippingArea, Color, Dimension FROM ((Products INNER JOIN OfficeFurniture ON OfficeFurniture.ProductID = Products.ProductID) INNER JOIN Shipping ON Shipping.ShippingID = Products.ShippingID) WHERE Products.ProductID = ?");
                            offStatement.setInt(1, productChoice);
                            offStatement.execute();
                            Statement offTable = connection.createStatement();
                            ResultSet offTab = offTable.executeQuery("SELECT * FROM Results");
                            ResultSetMetaData offmd = offTab.getMetaData();
                            columnNumber = offmd.getColumnCount();
                            while (offTab.next()){
                                for (int i = 1; i <= columnNumber; ++i){
                                    if (i != columnNumber){
                                        System.out.print(offTab.getString(i) + ", ");
                                    }
                                    else{
                                        System.out.print(offTab.getString(i));
                                    }
                                }
                                System.out.println();
                            }
                            Statement offView = connection.createStatement();
                            offView.executeUpdate("DROP VIEW Results");
                            break;
                        case "Pendant":
                            PreparedStatement penStatement = connection.prepareStatement("CREATE VIEW Results AS SELECT Products.ProductID, Products.ProductName, Category, SubCategory, ModelNumber, Manufacturer, Stock, Price, Warranty, MembershipOnly, Products.ShippingID, CompanyName, ShippingSpeed, ShippingArea, CTW, Clarity, Color FROM ((Products INNER JOIN Pendant ON Pendant.ProductID = Products.ProductID) INNER JOIN Shipping ON Shipping.ShippingID = Products.ShippingID) WHERE Products.ProductID = ?");
                            penStatement.setInt(1, productChoice);
                            penStatement.execute();
                            Statement penTable = connection.createStatement();
                            ResultSet penTab = penTable.executeQuery("SELECT * FROM Results");
                            ResultSetMetaData penmd = penTab.getMetaData();
                            columnNumber = penmd.getColumnCount();
                            while (penTab.next()){
                                for (int i = 1; i <= columnNumber; ++i){
                                    if (i != columnNumber){
                                        System.out.print(penTab.getString(i) + ", ");
                                    }
                                    else{
                                        System.out.print(penTab.getString(i));
                                    }
                                }
                                System.out.println();
                            }
                            Statement penView = connection.createStatement();
                            penView.executeUpdate("DROP VIEW Results");
                            break;
                        case "Refrigerators":
                            PreparedStatement friStatement = connection.prepareStatement("CREATE VIEW Results AS SELECT Products.ProductID, Products.ProductName, Category, SubCategory, ModelNumber, Manufacturer, Stock, Price, Warranty, MembershipOnly, Products.ShippingID, CompanyName, ShippingSpeed, ShippingArea, Dimension, Weight FROM ((Products INNER JOIN Refrigerators ON Refrigerators.ProductID = Products.ProductID) INNER JOIN Shipping ON Shipping.ShippingID = Products.ShippingID) WHERE Products.ProductID = ?");
                            friStatement.setInt(1, productChoice);
                            friStatement.execute();
                            Statement friTable = connection.createStatement();
                            ResultSet friTab = friTable.executeQuery("SELECT * FROM Results");
                            ResultSetMetaData frimd = friTab.getMetaData();
                            columnNumber = frimd.getColumnCount();
                            while (friTab.next()){
                                for (int i = 1; i <= columnNumber; ++i){
                                    if (i != columnNumber){
                                        System.out.print(friTab.getString(i) + ", ");
                                    }
                                    else{
                                        System.out.print(friTab.getString(i));
                                    }
                                }
                                System.out.println();
                            }
                            Statement friView = connection.createStatement();
                            friView.executeUpdate("DROP VIEW Results");
                            break;
                        case "Ring":
                            PreparedStatement ringStatement = connection.prepareStatement("CREATE VIEW Results AS SELECT Products.ProductID, Products.ProductName, Category, SubCategory, ModelNumber, Manufacturer, Stock, Price, Warranty, MembershipOnly, Products.ShippingID, CompanyName, ShippingSpeed, ShippingArea, CTW, Clarity, Color FROM ((Products INNER JOIN Ring ON Ring.ProductID = Products.ProductID) INNER JOIN Shipping ON Shipping.ShippingID = Products.ShippingID) WHERE Products.ProductID = ?");
                            ringStatement.setInt(1, productChoice);
                            ringStatement.execute();
                            Statement ringTable = connection.createStatement();
                            ResultSet ringTab = ringTable.executeQuery("SELECT * FROM Results");
                            ResultSetMetaData ringmd = ringTab.getMetaData();
                            columnNumber = ringmd.getColumnCount();
                            while (ringTab.next()){
                                for (int i = 1; i <= columnNumber; ++i){
                                    if (i != columnNumber){
                                        System.out.print(ringTab.getString(i) + ", ");
                                    }
                                    else{
                                        System.out.print(ringTab.getString(i));
                                    }
                                }
                                System.out.println();
                            }
                            Statement ringView = connection.createStatement();
                            ringView.executeUpdate("DROP VIEW Results");
                            break;
                        case "Skateboard":
                            PreparedStatement skateStatement = connection.prepareStatement("CREATE VIEW Results AS SELECT Products.ProductID, Products.ProductName, Category, SubCategory, ModelNumber, Manufacturer, Stock, Price, Warranty, MembershipOnly, Products.ShippingID, CompanyName, ShippingSpeed, ShippingArea, FrameSize, TireSize, Color, HeightForUser FROM ((Products INNER JOIN Skateboard ON Skateboard.ProductID = Products.ProductID) INNER JOIN Shipping ON Shipping.ShippingID = Products.ShippingID) WHERE Products.ProductID = ?");
                            skateStatement.setInt(1, productChoice);
                            skateStatement.execute();
                            Statement skateTable = connection.createStatement();
                            ResultSet skateTab = skateTable.executeQuery("SELECT * FROM Results");
                            ResultSetMetaData skatemd = skateTab.getMetaData();
                            columnNumber = skatemd.getColumnCount();
                            while (skateTab.next()){
                                for (int i = 1; i <= columnNumber; ++i){
                                    if (i != columnNumber){
                                        System.out.print(skateTab.getString(i) + ", ");
                                    }
                                    else{
                                        System.out.print(skateTab.getString(i));
                                    }
                                }
                                System.out.println();
                            }
                            Statement skateView = connection.createStatement();
                            skateView.executeUpdate("DROP VIEW Results");
                            break;
                        case "Tablet":
                            PreparedStatement tabStatement = connection.prepareStatement("CREATE VIEW Results AS SELECT Products.ProductID, Products.ProductName, Category, SubCategory, ModelNumber, Manufacturer, Stock, Price, Warranty, MembershipOnly, Products.ShippingID, CompanyName, ShippingSpeed, ShippingArea, OperatingSystem, ScreenSize, Color FROM ((Products INNER JOIN Tablet ON Tablet.ProductID = Products.ProductID) INNER JOIN Shipping ON Shipping.ShippingID = Products.ShippingID) WHERE Products.ProductID = ?");
                            tabStatement.setInt(1, productChoice);
                            tabStatement.execute();
                            Statement tabTable = connection.createStatement();
                            ResultSet tabTab = tabTable.executeQuery("SELECT * FROM Results");
                            ResultSetMetaData tabmd = tabTab.getMetaData();
                            columnNumber = tabmd.getColumnCount();
                            while (tabTab.next()){
                                for (int i = 1; i <= columnNumber; ++i){
                                    if (i != columnNumber){
                                        System.out.print(tabTab.getString(i) + ", ");
                                    }
                                    else{
                                        System.out.print(tabTab.getString(i));
                                    }
                                }
                                System.out.println();
                            }
                            Statement tabView = connection.createStatement();
                            tabView.executeUpdate("DROP VIEW Results");
                            break;
                        case "Tv":
                            PreparedStatement tvStatement = connection.prepareStatement("CREATE VIEW Results AS SELECT Products.ProductID, Products.ProductName, Category, SubCategory, ModelNumber, Manufacturer, Stock, Price, Warranty, MembershipOnly, Products.ShippingID, CompanyName, ShippingSpeed, ShippingArea, Dimension, DisplayType, SmartTV FROM ((Products INNER JOIN TV ON TV.ProductID = Products.ProductID) INNER JOIN Shipping ON Shipping.ShippingID = Products.ShippingID) WHERE Products.ProductID = ?");
                            tvStatement.setInt(1, productChoice);
                            tvStatement.execute();
                            Statement tvTable = connection.createStatement();
                            ResultSet tvTab = tvTable.executeQuery("SELECT * FROM Results");
                            ResultSetMetaData tvmd = tvTab.getMetaData();
                            columnNumber = tvmd.getColumnCount();
                            while (tvTab.next()){
                                for (int i = 1; i <= columnNumber; ++i){
                                    if (i != columnNumber){
                                        System.out.print(tvTab.getString(i) + ", ");
                                    }
                                    else{
                                        System.out.print(tvTab.getString(i));
                                    }
                                }
                                System.out.println();
                            }
                            Statement tvView = connection.createStatement();
                            tvView.executeUpdate("DROP VIEW Results");
                            break;
                        case "Washers & Dryers":
                            PreparedStatement washStatement = connection.prepareStatement("CREATE VIEW Results AS SELECT Products.ProductID, Products.ProductName, Category, SubCategory, ModelNumber, Manufacturer, Stock, Price, Warranty, MembershipOnly, Products.ShippingID, CompanyName, ShippingSpeed, ShippingArea, Type, Dimension, Weight FROM ((Products INNER JOIN WashersAndDryers ON WashersAndDryers.ProductID = Products.ProductID) INNER JOIN Shipping ON Shipping.ShippingID = Products.ShippingID) WHERE Products.ProductID = ?");
                            washStatement.setInt(1, productChoice);
                            washStatement.execute();
                            Statement washTable = connection.createStatement();
                            ResultSet washTab = washTable.executeQuery("SELECT * FROM Results");
                            ResultSetMetaData washmd = washTab.getMetaData();
                            columnNumber = washmd.getColumnCount();
                            while (washTab.next()){
                                for (int i = 1; i <= columnNumber; ++i){
                                    if (i != columnNumber){
                                        System.out.print(washTab.getString(i) + ", ");
                                    }
                                    else{
                                        System.out.print(washTab.getString(i));
                                    }
                                }
                                System.out.println();
                            }
                            Statement washView = connection.createStatement();
                            washView.executeUpdate("DROP VIEW Results");
                            break;
                    }
                    case1 = false;
                    break;
                case 3:
                    //NEED MAX, MIN, AVG, SUB QUERY
                    int choice2 = 0;
                    boolean case4 = true;
                    do{
                        System.out.println("1) Most expensive item in a subcategory.");
                        System.out.println("2) Least expensive item in a subcategory.");
                        System.out.println("3) Average price of an item in a subcategory.");
                        System.out.println("4) Most expensive, Least Expensive, and Average Price of items in each subcategory");
                        choice2 = get.getIntChoices();
                        switch (choice2){
                            case 1:
                            case 2:
                            case 3:
                                int subChoice2 = 0;
                                boolean subChoicebool = true;
                                do{
                                    System.out.println("1) Bedroom Collections");
                                    System.out.println("2) Bikes");
                                    System.out.println("3) Ceiling Fans");
                                    System.out.println("4) Cooking Appliances");
                                    System.out.println("5) Desktops");
                                    System.out.println("6) Headphones");
                                    System.out.println("7) Laptops");
                                    System.out.println("8) Luggages");
                                    System.out.println("9) Mattresses");
                                    System.out.println("10) Office Furniture");
                                    System.out.println("11) Pendants");
                                    System.out.println("12) Refrigerators");
                                    System.out.println("13) Rings");
                                    System.out.println("14) Scooters");
                                    System.out.println("15) Skateboards");
                                    System.out.println("16) Tablets");
                                    System.out.println("17) TVs");
                                    System.out.println("18) Washers and Dryers");
                                    subChoice2 = get.getIntChoices();
                                    Statement statement;
                                    ResultSet rs;
                                    float result = 0;
                                    switch(subChoice2){
                                        case 1:
                                            if (choice2 == 1){
                                                //max, min, avg
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT MAX(Price) FROM (SELECT Price FROM Products INNER JOIN BedroomCollections ON BedroomCollections.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            else if (choice2 == 2){
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT MIN(Price) FROM (SELECT Price FROM Products INNER JOIN BedroomCollections ON BedroomCollections.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            else{
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT AVG(Price) FROM (SELECT Price FROM Products INNER JOIN BedroomCollections ON BedroomCollections.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            subChoicebool = false;
                                            break;
                                        case 2:
                                            if (choice2 == 1){
                                                //max, min, avg
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT MAX(Price) FROM (SELECT Price FROM Products INNER JOIN Bike ON Bike.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            else if (choice2 == 2){
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT MIN(Price) FROM (SELECT Price FROM Products INNER JOIN Bike ON Bike.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            else{
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT AVG(Price) FROM (SELECT Price FROM Products INNER JOIN Bike ON Bike.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            subChoicebool = false;
                                            break;
                                        case 3:
                                            if (choice2 == 1){
                                                //max, min, avg
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT MAX(Price) FROM (SELECT Price FROM Products INNER JOIN CeilingFan ON CeilingFan.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            else if (choice2 == 2){
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT MIN(Price) FROM (SELECT Price FROM Products INNER JOIN CeilingFan ON CeilingFan.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            else{
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT AVG(Price) FROM (SELECT Price FROM Products INNER JOIN CeilingFan ON CeilingFan.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            subChoicebool = false;
                                            break;
                                        case 4:
                                            if (choice2 == 1){
                                                //max, min, avg
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT MAX(Price) FROM (SELECT Price FROM Products INNER JOIN CookingAppliances ON CookingAppliances.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            else if (choice2 == 2){
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT MIN(Price) FROM (SELECT Price FROM Products INNER JOIN CookingAppliances ON CookingAppliances.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            else{
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT AVG(Price) FROM (SELECT Price FROM Products INNER JOIN CookingAppliances ON CookingAppliances.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            subChoicebool = false;
                                            break;
                                        case 5:
                                            if (choice2 == 1){
                                                //max, min, avg
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT MAX(Price) FROM (SELECT Price FROM Products INNER JOIN Desktop ON Desktop.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            else if (choice2 == 2){
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT MIN(Price) FROM (SELECT Price FROM Products INNER JOIN Desktop ON Desktop.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            else{
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT AVG(Price) FROM (SELECT Price FROM Products INNER JOIN Desktop ON Desktop.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            subChoicebool = false;
                                            break;
                                        case 6:
                                            if (choice2 == 1){
                                                //max, min, avg
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT MAX(Price) FROM (SELECT Price FROM Products INNER JOIN Headphones ON Headphones.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            else if (choice2 == 2){
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT MIN(Price) FROM (SELECT Price FROM Products INNER JOIN Headphones ON Headphones.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            else{
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT AVG(Price) FROM (SELECT Price FROM Products INNER JOIN Headphones ON Headphones.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            subChoicebool = false;
                                            break;
                                        case 7:
                                            if (choice2 == 1){
                                                //max, min, avg
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT MAX(Price) FROM (SELECT Price FROM Products INNER JOIN Laptop ON Laptop.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            else if (choice2 == 2){
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT MIN(Price) FROM (SELECT Price FROM Products INNER JOIN Laptop ON Laptop.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            else{
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT AVG(Price) FROM (SELECT Price FROM Products INNER JOIN Laptop ON Laptop.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            subChoicebool = false;
                                            break;
                                        case 8:
                                            if (choice2 == 1){
                                                //max, min, avg
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT MAX(Price) FROM (SELECT Price FROM Products INNER JOIN Luggage ON Luggage.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            else if (choice2 == 2){
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT MIN(Price) FROM (SELECT Price FROM Products INNER JOIN Luggage ON Luggage.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            else{
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT AVG(Price) FROM (SELECT Price FROM Products INNER JOIN Luggage ON Luggage.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            subChoicebool = false;
                                            break;
                                        case 9:
                                            if (choice2 == 1){
                                                //max, min, avg
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT MAX(Price) FROM (SELECT Price FROM Products INNER JOIN Mattresses ON Mattresses.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            else if (choice2 == 2){
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT MIN(Price) FROM (SELECT Price FROM Products INNER JOIN Mattresses ON Mattresses.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            else{
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT AVG(Price) FROM (SELECT Price FROM Products INNER JOIN Mattresses ON Mattresses.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            subChoicebool = false;
                                            break;
                                        case 10:
                                            if (choice2 == 1){
                                                //max, min, avg
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT MAX(Price) FROM (SELECT Price FROM Products INNER JOIN OfficeFurniture ON OfficeFurniture.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            else if (choice2 == 2){
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT MIN(Price) FROM (SELECT Price FROM Products INNER JOIN OfficeFurniture ON OfficeFurniture.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            else{
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT AVG(Price) FROM (SELECT Price FROM Products INNER JOIN OfficeFurniture ON OfficeFurniture.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            subChoicebool = false;
                                            break;
                                        case 11:
                                            if (choice2 == 1){
                                                //max, min, avg
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT MAX(Price) FROM (SELECT Price FROM Products INNER JOIN Pendant ON Pendant.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            else if (choice2 == 2){
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT MIN(Price) FROM (SELECT Price FROM Products INNER JOIN Pendant ON Pendant.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            else{
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT AVG(Price) FROM (SELECT Price FROM Products INNER JOIN Pendant ON Pendant.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            subChoicebool = false;
                                            break;
                                        case 12:
                                            if (choice2 == 1){
                                                //max, min, avg
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT MAX(Price) FROM (SELECT Price FROM Products INNER JOIN Refrigerators ON Refrigerators.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            else if (choice2 == 2){
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT MIN(Price) FROM (SELECT Price FROM Products INNER JOIN Refrigerators ON Refrigerators.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            else{
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT AVG(Price) FROM (SELECT Price FROM Products INNER JOIN Refrigerators ON Refrigerators.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            subChoicebool = false;
                                            break;
                                        case 13:
                                            if (choice2 == 1){
                                                //max, min, avg
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT MAX(Price) FROM (SELECT Price FROM Products INNER JOIN Ring ON Ring.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            else if (choice2 == 2){
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT MIN(Price) FROM (SELECT Price FROM Products INNER JOIN Ring ON Ring.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            else{
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT AVG(Price) FROM (SELECT Price FROM Products INNER JOIN Ring ON Ring.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            subChoicebool = false;
                                            break;
                                        case 14:
                                            if (choice2 == 1){
                                                //max, min, avg
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT MAX(Price) FROM (SELECT Price FROM Products INNER JOIN Scooter ON Scooter.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            else if (choice2 == 2){
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT MIN(Price) FROM (SELECT Price FROM Products INNER JOIN Scooter ON Scooter.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            else{
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT AVG(Price) FROM (SELECT Price FROM Products INNER JOIN Scooter ON Scooter.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            subChoicebool = false;
                                            break;
                                        case 15:
                                            if (choice2 == 1){
                                                //max, min, avg
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT MAX(Price) FROM (SELECT Price FROM Products INNER JOIN Skateboard ON Skateboard.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            else if (choice2 == 2){
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT MIN(Price) FROM (SELECT Price FROM Products INNER JOIN Skateboard ON Skateboard.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            else{
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT AVG(Price) FROM (SELECT Price FROM Products INNER JOIN Skateboard ON Skateboard.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            subChoicebool = false;
                                            break;
                                        case 16:
                                            if (choice2 == 1){
                                                //max, min, avg
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT MAX(Price) FROM (SELECT Price FROM Products INNER JOIN Tablet ON Tablet.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            else if (choice2 == 2){
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT MIN(Price) FROM (SELECT Price FROM Products INNER JOIN Tablet ON Tablet.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            else{
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT AVG(Price) FROM (SELECT Price FROM Products INNER JOIN Tablet ON Tablet.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            subChoicebool = false;
                                            break;
                                        case 17:
                                            if (choice2 == 1){
                                                //max, min, avg
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT MAX(Price) FROM (SELECT Price FROM Products INNER JOIN TV ON TV.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            else if (choice2 == 2){
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT MIN(Price) FROM (SELECT Price FROM Products INNER JOIN TV ON TV.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            else{
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT AVG(Price) FROM (SELECT Price FROM Products INNER JOIN TV ON TV.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            subChoicebool = false;
                                            break;
                                        case 18:
                                            if (choice2 == 1){
                                                //max, min, avg
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT MAX(Price) FROM (SELECT Price FROM Products INNER JOIN WashersAndDryers ON WashersAndDryers.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            else if (choice2 == 2){
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT MIN(Price) FROM (SELECT Price FROM Products INNER JOIN WashersAndDryers ON WashersAndDryers.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            else{
                                                statement = connection.createStatement();
                                                rs = statement.executeQuery("SELECT AVG(Price) FROM (SELECT Price FROM Products INNER JOIN WashersAndDryers ON WashersAndDryers.ProductID = Products.ProductID) AS Result");
                                                while (rs.next()) {
                                                    result = rs.getFloat(1);
                                                }
                                                System.out.println(result);
                                            }
                                            subChoicebool = false;
                                            break;
                                        default:
                                            System.out.println("Please enter a valid choice.");
                                    }
                                }while(subChoicebool);
                                case4 = false;
                                break;
                            case 4:
                                Statement statement = connection.createStatement();
                                ResultSet rs = statement.executeQuery("SELECT SubCategory, MAX(Price), MIN(Price), AVG(Price) FROM Products GROUP BY SubCategory");
                                while (rs.next()) {
                                    String result = rs.getString(1);
                                    System.out.println(result);
                                }


                                case4 = false;
                                break;
                            default:
                                System.out.println("Please enter a valid choice.");

                        }
                    }while(case4);


                    case1 = false;
                    break;
                default:
                    System.out.println("Please enter a valid option.");
            }

        }while(case1);



    }

}
