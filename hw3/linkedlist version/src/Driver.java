/*
* Driver class that works auto when the program is run
* It checks every possible method and directs to the menu
*/

import java.util.LinkedList;
import java.util.Scanner;
public class Driver {
    public static void main(String[] args) throws Exception {
        Street driverStreet = new Street(30);
        driverStreet.setLength(30);
        House house1 = new House(5, 5, 10, "burcu", 5, "pink");
        driverStreet.addHouseSide1(house1);
        System.out.print("Total remaining length: ");
        System.out.println(driverStreet.getRemainingLength());
        displayBuildings(driverStreet);
        System.out.print("Number of playgrounds: ");
        System.out.println(driverStreet.getSizePlaygrounds1()+driverStreet.getSizePlaygrounds2());
        System.out.print("Ratio of length of playgrounds: %");
        System.out.println(ratio(driverStreet));
        System.out.print("Total length occupied by buildings: ");
        System.out.println(driverStreet.getTotal());
        driverStreet.silhouette();

        Office office1 = new Office(8, 5, 15, "sultan", "advertising");
        driverStreet.addOfficeSide2(office1);
        System.out.print("Total remaining length: ");
        System.out.println(driverStreet.getRemainingLength());
        displayBuildings(driverStreet);
        System.out.print("Number of playgrounds: ");
        System.out.println(driverStreet.getSizePlaygrounds1()+driverStreet.getSizePlaygrounds2());
        System.out.print("Ratio of length of playgrounds: %");
        System.out.println(ratio(driverStreet));
        System.out.print("Total length occupied by buildings: ");
        System.out.println(driverStreet.getTotal());
        driverStreet.silhouette();

        Playground playground1 = new Playground(11, 3);
        driverStreet.addPlaygroundSide1(playground1);
        System.out.print("Total remaining length: ");
        System.out.println(driverStreet.getRemainingLength());
        displayBuildings(driverStreet);
        System.out.print("Number of playgrounds: ");
        System.out.println(driverStreet.getSizePlaygrounds1()+driverStreet.getSizePlaygrounds2());
        System.out.print("Ratio of length of playgrounds: %");
        System.out.println(ratio(driverStreet));
        System.out.print("Total length occupied by buildings: ");
        System.out.println(driverStreet.getTotal());
        driverStreet.silhouette();

        Market market1 = new Market(15, 5, 10, "orhan", 8, 22);
        driverStreet.addMarketSide1(market1);
        System.out.print("Total remaining length: ");
        System.out.println(driverStreet.getRemainingLength());
        displayBuildings(driverStreet);
        System.out.print("Number of playgrounds: ");
        System.out.println(driverStreet.getSizePlaygrounds1()+driverStreet.getSizePlaygrounds2());
        System.out.print("Ratio of length of playgrounds: %");
        System.out.println(ratio(driverStreet));
        System.out.print("Total length occupied by buildings: ");
        System.out.println(driverStreet.getTotal());
        driverStreet.silhouette();

        driverStreet.deleteOfficeSide2(office1);
        System.out.print("Total remaining length: ");
        System.out.println(driverStreet.getRemainingLength());
        displayBuildings(driverStreet);
        System.out.print("Number of playgrounds: ");
        System.out.println(driverStreet.getSizePlaygrounds1()+driverStreet.getSizePlaygrounds2());
        System.out.print("Ratio of length of playgrounds: %");
        System.out.println(ratio(driverStreet));
        System.out.print("Total length occupied by buildings: ");
        System.out.println(driverStreet.getTotal());
        driverStreet.silhouette();
        
        menu();
    }
/** 
 * This menu function gets interactive with user
*/
    public static void menu() {
        
        int length=0; 
        int side;
        int selection;
        int select=0;
        int index=0;
        boolean exit=true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the city planning app");
        System.out.print("Please set the length of the street: ");
        length = scanner.nextInt();
        Street street = new Street(length);
        street.setLength(length);
        while (exit) {
            System.out.println("Please choose mode:");
            System.out.println("1- Viewing Mode");
            System.out.println("2- Editing Mode");
            System.out.print("SELECTION: ");
            selection = scanner.nextInt();
            
            if(selection==1){    
                System.out.println("Please choose action:");
                System.out.println("1- Display the total remaining length of lands on the street");
                System.out.println("2- Display the list of buildings on the street");
                System.out.println("3- Display the number and ratio of length of playgrounds in the street");
                System.out.println("4- Calculate the total length of street occupied by the markets, houses or offices");
                System.out.println("5- Display the skyline silhouette of the street");
                System.out.print("SELECTION: ");
                selection = scanner.nextInt();
                switch(selection){
                    case 1:
                        System.out.println(street.getRemainingLength());
                    break;
                        
                    case 2:
                        displayBuildings(street);
                    break;

                    case 3:
                        System.out.print("Number of playgrounds: ");
                        System.out.println(street.getSizePlaygrounds1()+street.getSizePlaygrounds2());
                        System.out.print("Ratio of length of playgrounds: %");
                        System.out.println(ratio(street));
                    break;
                        
                    case 4:
                        System.out.println(street.getTotal());
                    break;

                    case 5:
                        street.silhouette();
                    break;
                    
                    default:
                        System.out.println("Invalid Selection");
                        exit = false;
                    break;

                }
            }

            else if(selection==2){
                System.out.println("Please choose action:");
                System.out.println("1- Add a building on a land in the street");
                System.out.println("2- Delete a building on a land in the street");
                System.out.println("3- Add a playground on a land in the street");
                System.out.println("4- Delete a playground on a land in the street");
                System.out.print("SELECTION: ");
                selection = scanner.nextInt();
                switch(selection){
                    case 1:
                        System.out.println("Please choose on which side you want to add a building: ");
                        System.out.println("1- Add a building on side 1 of the street");
                        System.out.println("2- Add a building on side 2 of the street");
                        System.out.print("SELECTION: ");
                        side = scanner.nextInt();
                        if(side == 1){
                            System.out.println("Please select the type of the building: ");
                            System.out.println("1- House \n2-Office\n3-Market");
                            System.out.print("SELECTION: ");
                            select = scanner.nextInt();
                            if(select == 1){
                                House house;
                                house = addHouse();
                                street.addHouseSide1(house);
                            }
                            if(select == 2){
                                Office office;
                                office = addOffice();
                                street.addOfficeSide1(office);
                            }
                            if(select == 3){
                                Market market;
                                market = addMarket();
                                street.addMarketSide1(market);
                            }
                        }

                        if(side == 2){
                            System.out.println("Please select the type of the building: ");
                            System.out.println("1- House \n2-Office\n3-Market");
                            System.out.print("SELECTION: ");
                            select = scanner.nextInt();
                            if(select == 1){
                                House house;
                                house = addHouse();
                                street.addHouseSide2(house);
                            }
                            if(select == 2){
                                Office office;
                                office = addOffice();
                                street.addOfficeSide2(office);
                            }
                            if(select == 3){
                                Market market;
                                market = addMarket();
                                street.addMarketSide2(market);
                            }
                        }
                    break;
                        
                    case 2:
                        displayBuildings(street);
                        System.out.println("Please choose on which side you want to remove a building: ");
                        System.out.println("1- Remove a building on side 1 of the street");
                        System.out.println("2- Remove a building on side 2 of the street");
                        System.out.print("SELECTION: ");
                        side = scanner.nextInt();
                        if(side == 1){
                            System.out.println("Please select the type of the building you want to remove: ");
                            System.out.println("1- House \n2-Office\n3-Market");
                            System.out.print("SELECTION: ");
                            select = scanner.nextInt();
                            System.out.println("Please type the number of the building you want to remove: ");
                            index = scanner.nextInt();
                            if(select==1){
                                street.deleteHouseSide1(street.getHouses1(index-1));
                            }
                            if(select==2){
                                street.deleteOfficeSide1(street.getOffices1(index-1));
                            }
                            if(select==3){
                                street.deleteMarketSide1(street.getMarkets1(index-1));
                            }
                        }

                        if(side == 2){
                            System.out.println("Please select the type of the building you want to remove: ");
                            System.out.println("1- House \n2-Office\n3-Market");
                            System.out.print("SELECTION: ");
                            select = scanner.nextInt();
                            System.out.println("Please type the number of the building you want to remove: ");
                            index = scanner.nextInt();
                            if(select==1){
                                street.deleteHouseSide2(street.getHouses2(index-1));
                            }
                            if(select==2){
                                street.deleteOfficeSide2(street.getOffices2(index-1));
                            }
                            if(select==3){
                                street.deleteMarketSide2(street.getMarkets2(index-1));
                            }
                        }
                    break;

                    case 3:
                        System.out.println("Please choose on which side you want to add a playground: ");
                        System.out.println("1- Add a playground on side 1 of the street");
                        System.out.println("2- Add a playground on side 2 of the street");
                        System.out.print("SELECTION: ");
                        side = scanner.nextInt();
                        if(side == 1){
                            Playground playground1;
                            playground1 = play();
                            street.addPlaygroundSide1(playground1);
                        }

                        if(side == 2){
                            Playground playground1;
                            playground1 = play();
                            street.addPlaygroundSide2(playground1);
                        }
                    break;

                    case 4:
                        displayPlaygrounds(street);
                        System.out.println("Please choose on which side you want to remove a playground: ");
                        System.out.println("1- Remove a playground on side 1 of the street");
                        System.out.println("2- Remove a playground on side 2 of the street");
                        System.out.print("SELECTION: ");
                        side = scanner.nextInt();
                        if(side == 1){
                            System.out.println("Please type the number of the playground you want to remove: ");
                            index = scanner.nextInt();
                            street.deletePlaygroundSide1(street.getPlaygrounds1(index-1));
                        }

                        if(side == 2){
                            System.out.println("Please type the number of the playground you want to remove: ");
                            index = scanner.nextInt();
                            street.deletePlaygroundSide2(street.getPlaygrounds1(index-1));
                        }
                    break;

                    default:
                        System.out.println("Invalid Selection");
                        exit = false;
                    break;
                }
            }
            
            else{
                System.out.println("Invalid Selection");
                exit = false;
            }
            
        }
    }
/**
 * This function gets all the necessary data from user when a house is being added
 * @return House object
 */
    public static House addHouse(){
        Scanner scanner = new Scanner(System.in);
        House newHouse;
        int position;
        int length;
        int height;
        String owner;
        int roomNum;
        String color;

        System.out.print("Enter position: ");
        position = scanner.nextInt();
        System.out.print("Enter length: ");
        length = scanner.nextInt();
        System.out.print("Enter height: ");
        height = scanner.nextInt();
        System.out.print("Enter owner: ");
        owner = scanner.next();
        System.out.print("Enter number of rooms: ");
        roomNum = scanner.nextInt();
        System.out.print("Enter color: ");
        color = scanner.next();

        newHouse = new House(position, length, height, owner, roomNum, color); 
        return newHouse;
    }

/**
 * This function gets all the necessary data from user when an office is being added
 * @return Office object
 */
    public static Office addOffice(){
        Scanner scanner = new Scanner(System.in);
        Office newOffice;
        int position;
        int length;
        int height;
        String owner;
        String jobType;

        System.out.print("Enter position: ");
        position = scanner.nextInt();
        System.out.print("Enter length: ");
        length = scanner.nextInt();
        System.out.print("Enter height: ");
        height = scanner.nextInt();
        System.out.print("Enter owner: ");
        owner = scanner.next();
        System.out.print("Enter job type: ");
        jobType = scanner.next();
        
        newOffice = new Office(position, length, height, owner, jobType); 
        return newOffice;
    }

/**
 * This function gets all the necessary data from user when a market is being added
 * @return Market object
 */
    public static Market addMarket(){
        Scanner scanner = new Scanner(System.in);
        Market newMarket;
        int position;
        int length;
        int height;
        String owner;
        int openHour;
        int closeHour;

        System.out.print("Enter position: ");
        position = scanner.nextInt();
        System.out.print("Enter length: ");
        length = scanner.nextInt();
        System.out.print("Enter height: ");
        height = scanner.nextInt();
        System.out.print("Enter owner: ");
        owner = scanner.next();
        System.out.print("Enter opened hour: ");
        openHour = scanner.nextInt();
        System.out.print("Enter closed hour: ");
        closeHour = scanner.nextInt();
        
        newMarket = new Market(position, length, height, owner, openHour, closeHour); 
        return newMarket;
    }

/**
 * This function gets all the necessary data from user when a playground is being added
 * @return Playground object
 */
    public static Playground play(){
        Scanner scanner = new Scanner(System.in);
        Playground newPlayground;
        int position;
        int length;

        System.out.print("Enter position: ");
        position = scanner.nextInt();
        System.out.print("Enter length: ");
        length = scanner.nextInt();

        newPlayground = new Playground(position, length);

        return newPlayground;
    }

/**
 * This function displays all the current buildings on street to the console
 * @param street
 */
    public static void displayBuildings(Street street){

        int a = street.getSizeHouses1();
        int b = street.getSizeHouses2();
        System.out.println("Houses on side 1 of the street:");
        for(int i=0; i<a; i++){
            System.out.print(i+1);
            System.out.print("- ");
            System.out.print(street.getHouses1(i).getPosition());
            System.out.print(" ");
            System.out.print(street.getHouses1(i).getLength());
            System.out.print(" ");
            System.out.print(street.getHouses1(i).getHeight());
            System.out.print(" ");
            System.out.println(street.getHouses1(i).getOwner());
        }

        System.out.println("Houses on side 2 of the street:");
        for(int i=0; i<b; i++){
            System.out.print(i+1);
            System.out.print("- ");
            System.out.print(street.getHouses2(i).getPosition());
            System.out.print(" ");
            System.out.print(street.getHouses2(i).getLength());
            System.out.print(" ");
            System.out.print(street.getHouses2(i).getHeight());
            System.out.print(" ");
            System.out.println(street.getHouses2(i).getOwner());
        }

        a = street.getSizeOffices1();
        b = street.getSizeOffices2();
        System.out.println("Offices on side 1 of the street:");
        for(int i=0; i<a; i++){
            System.out.print(i+1);
            System.out.print("- ");
            System.out.print(street.getOffices1(i).getPosition());
            System.out.print(" ");
            System.out.print(street.getOffices1(i).getLength());
            System.out.print(" ");
            System.out.print(street.getOffices1(i).getHeight());
            System.out.print(" ");
            System.out.println(street.getOffices1(i).getOwner());
        }

        System.out.println("Offices on side 2 of the street:");
        for(int i=0; i<b; i++){
            System.out.print(i+1);
            System.out.print("- ");
            System.out.print(street.getOffices2(i).getPosition());
            System.out.print(" ");
            System.out.print(street.getOffices2(i).getLength());
            System.out.print(" ");
            System.out.print(street.getOffices2(i).getHeight());
            System.out.print(" ");
            System.out.println(street.getOffices2(i).getOwner());
        }

        a = street.getSizeMarkets1();
        b = street.getSizeMarkets2();
        System.out.println("Markets on side 1 of the street:");
        for(int i=0; i<a; i++){
            System.out.print(i+1);
            System.out.print("- ");
            System.out.print(street.getMarkets1(i).getPosition());
            System.out.print(" ");
            System.out.print(street.getMarkets1(i).getLength());
            System.out.print(" ");
            System.out.print(street.getMarkets1(i).getHeight());
            System.out.print(" ");
            System.out.println(street.getMarkets1(i).getOwner());
        }

        System.out.println("Markets on side 2 of the street:");
        for(int i=0; i<b; i++){
            System.out.print(i+1);
            System.out.print("- ");
            System.out.print(street.getMarkets2(i).getPosition());
            System.out.print(" ");
            System.out.print(street.getMarkets2(i).getLength());
            System.out.print(" ");
            System.out.print(street.getMarkets2(i).getHeight());
            System.out.print(" ");
            System.out.println(street.getMarkets2(i).getOwner());
        }
    }

/**
 * This function displays all the current playgrounds on street to console
 * @param street
 */
    public static void displayPlaygrounds(Street street){

        int a = street.getSizePlaygrounds1();
        int b = street.getSizePlaygrounds2();
        System.out.println("Playgrounds on side 1 of the street:");
        for(int i=0; i<a; i++){
            System.out.print(i+1);
            System.out.print("- ");
            System.out.print(street.getPlaygrounds1(i).getPosition());
            System.out.print(" ");
            System.out.println(street.getPlaygrounds1(i).getLength());
        }

        System.out.println("Playgrounds on side 2 of the street:");
        for(int i=0; i<b; i++){
            System.out.print(i+1);
            System.out.print("- ");
            System.out.print(street.getPlaygrounds2(i).getPosition());
            System.out.print(" ");
            System.out.println(street.getPlaygrounds2(i).getLength());
        }
    }

/**
 * This function finds the ratio of length of the playgrounds on street and returns the value 
 * @param street
 * @return
 */
    public static double ratio(Street street){
        int a = street.getSizePlaygrounds1();
        int b = street.getSizePlaygrounds2();
        int total=0;
        double result;

        for(int i=0; i<a; i++){
            total = total + street.getPlaygrounds1(i).getLength();
        }

        for(int i=0; i<b; i++){
            total = total + street.getPlaygrounds2(i).getLength();
        }        

        result = (100*total)/(street.getLength()*2);
        return result;
    }
}