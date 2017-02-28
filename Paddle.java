// file: Paddle.java
// author: Garret Patten
// date: 01/30/17
// revised: 02/01/17
// revised:02/02/17
//
import edu.princeton.cs.algs4.StdDraw;
//
public class Paddle {
    private double xpos;
    private double width;
    private double height;
//
public Paddle(double height, double width){
    this.width = width;
    this.height = height;
}
//
public void move(){
  // Position the paddle so that it is centered
  // at the current x-coordinate of the mouse.
  this.xpos = StdDraw.mouseX();
  double screenEndRight = 1 - (0.5 * this.width);
  double screenEndLeft = 0 + (0.5 * this.width);
  
  if(this.xpos > screenEndRight){
      this.xpos = screenEndRight;
  }
  else if(this.xpos < screenEndLeft){
      this.xpos = screenEndLeft;
  }
  else{
      this.xpos = StdDraw.mouseX();
  }
}
//
public void draw() {
    // Draw the paddle at its current position.
    // Draw the paddle at its current position.
    StdDraw.setPenColor(StdDraw.BLACK);
    StdDraw.filledRectangle(this.xpos, (0.5 * this.height), (0.5 * this.width), (0.5 * this.height));
}
//
public double leftEdge() {
    // Return the x-coordinate of the left edge of the paddle.
    double leftEdge = this.xpos - (0.5 * width);
    return leftEdge;
}
//
public double rightEdge() {
    // Return the x-coordinate of the right edge of the paddle.
    double rightEdge = this.xpos + (0.5 * width);
    return rightEdge;
}
}