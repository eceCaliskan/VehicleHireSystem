import java.util.ArrayList;
import java.util.*;
/**
 * This class subclass of Commercial class which is also subclass of the vehicle class
 * holds extra information about truck objects
 *
 * @ECE CALISKAN GROUP 3
 * @13/03/2019
 */
public class Truck extends Commercial
{
    //The attributes of the truck
    private ArrayList<String> attributes;
    
   /**
    * Constructor for objects of class Truck
    */
   public Truck()
   {
        super();//call for the superclass commercial constructor
        attributes = new ArrayList<String>();
   }

   /**
    * This accessor method returns information about attributes
    */
   public ArrayList<String> getAttributes()
   {
         return attributes ;
   }
    
   /**
    * This method overrides readData method of Commercial class
    */
   public void readData(Scanner scanner2)
   {
        attributes.clear();//to clear arraylist before storing new trucks attributes
        super.readData(scanner2); //call for the superclass commercial readData method
        scanner2.useDelimiter(", ");
        while(scanner2.hasNext())
        {
            attributes.add(scanner2.next());//adding attributes to arraylist
        }
        printDetails();
        scanner2.close();
   }
    
   /**
    * toString() method for the objects of truck class returns details of attributes
    */
   public String toString()
   {
        return " Payload: " + getPayLoad() + attributes.toString().replace("[", "").replace("]", "") + "\n" ;//to get rid of [ and ]
   }
   
   /**
    * This method overrides printDetails method of Commercial class
    */
   public void printDetails()
   {
       super.printDetails();//call for the superclass commercial printDetails method
       String neww = attributes.toString().replace("[", "").replace("]", "");
       System.out.println(" " + neww);
       System.out.println("\n");
    }
    
}
