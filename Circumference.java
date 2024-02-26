class Circumference extends ConsoleProgram {

  /**
  * Computing the circumference of a circle given a radius 
  * @author: H. Ye
  */
  
  public void run() {
    
    // Assign variables
    double dblRadius;
    double dblCircumference;

    // Assign values
    dblRadius = readDouble ("Enter the radius: ");

    // Solve for circumference
    dblCircumference = (Math.PI * 2 * dblRadius);
    System.out.println("The circumference is: " + dblCircumference);
}  