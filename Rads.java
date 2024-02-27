class Rads extends ConsoleProgram {

  /**
  * Convert degree measure to radian measure
  * @author: H. Ye
  */
  
  public void run() {
    
    // Assign variables
    double dblDeg;
    double dblRad;

    // Assign values
    dblDeg = readDouble ("Enter the degree: ");

    // Convert to radian measure
    dblRad = Math.toRadians (dblDeg);

    // Print out radian measure
    System.out.println ("The radian measure is: " + dblRad);
    
  }
}