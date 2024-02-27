class FtoC extends ConsoleProgram {

  /**
  * Convert fahrenheit to celcius degree measure
  * @author: H. Ye
  */
  
  public void run() {
    
    // Assign variables
    double dblFahr;
    double dblCel;

    // Assign values
    dblFahr = readDouble ("Enter the temperature in degrees fahrenheit: ");

    // Calculate the celcius
    dblCel = ((5/9) * (dblFahr - 32));

    // Print out the celcius 
    System.out.println ("The degrees in celcius is: " + dblCel);
    
  }
}