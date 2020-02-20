/**
 * Date
 */
public class Date {
    
    // Instance Variables
     int day;
     int month;
     int year;
     String event;

    // Default Constructor (No Parameters)
    public Date(){
        //Your code here - set them in default values
        day = 1;
        month = 1;
        year = 1;
        event = "Nothing on today";
    }

    // Parameterized constructor (3 Parameters)
    public Date(int day, int month, int year){
        // Your code here.
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    // Parameterized constructor (2 Parameters)
     /*public Date(int bMonth, int bYear) {
    // Your code here.
        month = bMonth;
        year = bYear;
    }*/
    // Parameterized constructor (1 Parameter)
    public Date(int today) {
    // Your code here.
        day = today;
        this.year = 2000;
    }

    //calling a constructor inside a constructor
public Date(int day, int month) {
    this(day);
    this.month = month;
}
    // Parameterized constructor (3 Parameters)
    public Date(int day, int month, int year, String event){
        // Your code here.
        this(day, month, year);
        this.event = event;
    }

    // A simple print method
    public void printDate(){
        Date dateObj1 = new Date(20,02,2020,"Today is a cool day");
        // Print the date like this: day/month/year
        // Your code here
        System.out.println(dateObj1.event+" because it is "+this.day+"/"+this.month+"/"+this.year);
    }

}
