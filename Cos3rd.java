class Cos3rd extends ConsoleProgram {

  /**
  * Enter two sides of a triangle and the contained angle, and use cosine law to calculate the third side
  * @author: H. Ye
  */
  
  public void run() {
    
    // Assign variables
    double dblSideA;
    double dblSideB;
    double dblAngle;
    double dblSideC;

    // Assign values
    dblSideA = readDouble ("Enter the length of side A: ");
    dblSideB = readDouble ("Enter the length of side B: ");
    dblAngle = readDouble ("Enter the contained angle: ");

    // Calculate using cosine law
    dblSideC = Math.sqrt (Math.pow (dblSideA, 2) + (Math.pow (dblSideB, 2)) - 2 * dblSideA * dblSideB * Math.cos (Math.toRadians(dblAngle)));

    // Print out the third side
    System.out.println ("The length of side C is: " + dblSideC);
    
  }
}