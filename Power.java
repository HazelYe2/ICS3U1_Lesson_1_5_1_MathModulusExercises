class Power extends ConsoleProgram {

  /**
  * Print out a to the power of b
  * @author: H. Ye
  */
  
  public void run() {
    
    // Assign variables
    double dblA;
    double dblB;
    
    // Assign values
    dblA = readDouble ("Enter the value of A: ");
    dblB = readDouble ("Enter the value of B: ");

    // Print out
    System.out.println(Math.pow (dblA, dblB));

  }
}