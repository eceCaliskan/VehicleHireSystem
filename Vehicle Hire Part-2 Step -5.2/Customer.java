import java.util.*;
import java.io.PrintWriter;
/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Customer extends ReservationSystem
{
    // the customer id of the customer
    protected String customerID;
    // surname of the customer
    private String surname;
    //firstname of the customer
    private String firstName;
    //the initials
    private String otherInitials;
    //Ms,Dr,Mrs,Ms
    private String title;
    /**
     * Constructor for objects of class Customer
     */
    public Customer(String sname, String name, String initials, String cusTitle)
    {
        super();//call for the superclass reservation System constructor
        customerID = "unknown";
        surname = sname;
        firstName = name;
        otherInitials  = initials;
        title = cusTitle;
    }

    /**
     * Default constructor for objects of class Customer
     */
    public Customer()
    {
        super();//call for the superclass reservation System constructor
        customerID = " ";
        surname = " ";
        firstName = " ";
        otherInitials = " ";
        title = " ";
    }
    
    /**
     *  This method returns the customer id of the customer
     */
    public String getID()
    {
        return customerID;
    }
    
    /**
     * This method returns the surname of the customer
     */
    public String getSurname()
    {
        return surname;
    }
    
    /**
     * This method returns the first name of the customer
     */
    public String getName()
    {
        return firstName;
    }
    
    /**
     * This method returns the initials
     */
    public String getInitials()
    {
        return otherInitials;
    }
    
    /**
     * This method returns the title
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * This method is corresponding Vehicle class's printDetails() method
     */
    public void printDetails()
    {
        System.out.println("Customer ID: " + customerID + " Surname: " + surname);
        System.out.println("First name: " + firstName + " otherInitials: " + otherInitials);
        System.out.println("Title: " + title );
    }
    
    /**
     * This method is corresponding Vehicle class's readData() method
     */
    public void readData(Scanner scanner2)
    {
        scanner2.useDelimiter(",");
        this.customerID=scanner2.next();
        this.surname=scanner2.next();
        this.firstName=scanner2.next();
        this.otherInitials=scanner2.next();
        this.title=scanner2.next();
        printDetails();
    }
    
    /**
     * This method writes data with passed printWriter object
     */
    public void writeData(PrintWriter printw)
    {
        String output = customerID + surname + firstName + otherInitials + title;
        printw.println(output);
    }
}
