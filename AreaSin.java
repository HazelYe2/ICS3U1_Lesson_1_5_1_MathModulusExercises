class AreaSin extends ConsoleProgram {

  /**
  * Calculate the area of a triangle, given two sides and the contained angle
  * @author: H. Ye
  */
  
  public void run() {
    
    // Assign variables
    double dblSideA;
    double dblSideB;
    double dblAngleC;
    double dblArea;

    // Assign values
    dblSideA = readDouble ("Enter the length of side A: ");
    dblSideB = readDouble ("Enter the length of side B: ");
    dblAngleC = readDouble ("Enter the contained angle: ");

    // Solve for area
    dblArea = ((dblSideA * dblSideB * Math.sin(dblAngleC))/(2));

    // Print out the area
    System.out.println ("The area of the triangle is: " + dblArea);
    
  }
}