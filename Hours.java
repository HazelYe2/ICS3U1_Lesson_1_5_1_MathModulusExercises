class Hours extends ConsoleProgram {

  /**
  * Convert hours to days and hours
  * @author: H. Ye
  */
  
  public void run() {
    
    // Assign variables
    int intDays;
    int intHours;
    int intHours2;

    // Input values
    intHours = readInt ("Enter the number of hours: ");

    // Calculate hours to days and hours
    intDays = intHours/24;
    intHours2 = intHours % 24;

    // Print out the conversion
    System.out.println ("The result of the conversion is: ");
    
  }
}