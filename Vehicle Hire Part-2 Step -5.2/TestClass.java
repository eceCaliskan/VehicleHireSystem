import java.util.ArrayList;
import java.io.*;
/**
 * This is a Test class for classes Vehicle and Reservation System and tests methods of these classes
 *
 * @ECE CALISKAN GROUP 3
 * @28/02/2019
 */
public class TestClass
{
    /**
     * Constructor for objects of class Test
     */
    public TestClass() throws FileNotFoundException
    {
        //Stage 1 creates the objects
        //creates the reservation system object
        ReservationSystem reservation= new ReservationSystem();
        //creates the arraylist
        ArrayList vehicleList = new ArrayList<Vehicle>();
        //creates the vehicle object
        Vehicle auto = new Vehicle();
        Car c = new Car();
        Van v = new Van ();
        Truck t = new Truck();
        //Stage 2 prints the details
        //prints the ArrayList of vehicles 
        //Arraylist is empty we going to have an error message
        reservation.printAllVehicles();
        //Stage 3 method calls
        //calls the readVehicleData if the file that we need to choose does not exist it
        //will catch fileNotFoundException and show an error message
        reservation.readVehicleData();
        //calls the readCustomerData if the file that we need to choose does not exist it
        //will catch fileNotFoundException and show an error message
        reservation.readCustomerData();
        //prints the ArrayList of vehicles 
        reservation.printAllVehicles();
        //prints the arraylist of customers
        reservation.printAllCustomers();
        //writes customer data to a new file
        reservation.writeCustomerData("file.txt");
    }
}
