/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Date dateObj1 = new Date();
        // Create a Date object using the default constructor
        System.out.println( dateObj1.day );
        
        // Create 3 more Date objects using all the paramiterised constructors
        Date dateObj2 = new Date(20,02,2020);
        System.out.println("Today is the "+dateObj2.day+ " of " + dateObj2.month + ", " + dateObj2.year  );

        Date dateObj3 = new Date(01,2000);
        System.out.println("Birthday is on "+dateObj3.month+" of "+dateObj3.year);

        Date dateObj4 = new Date(20);
        System.out.println("Today's date is "+dateObj4.day);
        // Call the printDate() method for each object you create.
    }
}
