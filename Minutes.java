class Minutes extends ConsoleProgram {

  /**
  * Convert minutes to days, hours, and minutes
  * @author: H. Ye
  */
  
  public void run() {
    
    // Assign variables
    int intDays;
    int intHours;
    int intMin;
    int intMin2;

    // Assign values
    intMin = readInt ("Enter the number of minutes: ");

    // Calculate the days, hours, and minutes
    intDays = intMin/1440;
    intMin2 = intMin % 1440;
    intHours = intMin2/60;
    intMin2 = intMin2 % 60;

    // Print out the days, hours, and minutes
    System.out.println ("The result of the conversion is: " + intDays + intHours + intMin2);
    
  }
}