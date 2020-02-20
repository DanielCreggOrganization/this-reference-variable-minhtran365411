/**
 * Date
 */
public class Date {
    
    // Instance Variables
     int day;
     int month;
     int year;

    // Default Constructor (No Parameters)
    public Date(){
        //Your code here - set them in default values
        day = 1;
        month = 1;
        year = 1;
    }

    // Parameterized constructor (3 Parameters)
    public Date(int newDay, int newMonth, int newYear){
        // Your code here.
        day = newDay;
        month = newMonth;
        year = newYear;
    }
    
    // Parameterized constructor (2 Parameters)
    public Date(int bMonth, int bYear) {
    // Your code here.
        month = bMonth;
        year = bYear;
    }
    // Parameterized constructor (1 Parameter)
    public Date(int today) {
    // Your code here.
        day = today;
    }
    // A simple print method
    public void printDate(){
        // Print the date like this: day/month/year
        // Your code here
    }

}
