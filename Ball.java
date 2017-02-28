// file: Ball.java
// author: Garret Patten
// date: 01/30/17
// revised: 02/01/17
// revised:02/02/17
//
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;
import java.awt.Color;
import java.util.Random;
//
public class Ball {
    private double x;
    private double y;
    private double speed;
    private double radius;
    private Color color;
//
public Ball(){
    this.x = StdRandom.uniform();
    Random r = new Random();
    int ballType = (r.nextInt(5) + 1);
    if (ballType == 1){
        this.radius = 0.02;
        this.y = 1.0 - radius;
        this.speed = -.006;
        this.color = StdDraw.RED;
    }
    else if (ballType == 2) {
        this.radius = 0.04;
        this.y = 1.0 - radius;
        this.speed = -.007;
        this.color = StdDraw.ORANGE;
    }
    else if (ballType == 3) {
        this.radius = 0.06;
        this.y = 1.0 - radius;
        this.speed = -.008;
        this.color = StdDraw.YELLOW;
    }
    else if (ballType == 4) {
        this.radius = 0.08;
        this.y = 1.0 - radius;
        this.speed = -.009;
        this.color = StdDraw.GREEN;
    }
    else if(ballType == 5){
        this.radius = 0.1;
        this.y = 1.0 - radius;
        this.speed = -.01;
        this.color = StdDraw.BLUE;
    }
}
//  
public void move(){
    //Change the y-coordinate of the ball, according to its speed.
    if(this.y > 1 - this.radius){
        this.changeDirection();
    }
    this.y += this.speed;
}
//
public void draw() {
  // Draws the ball on the StdDraw window, based on its coordinates.
    StdDraw.setPenColor(this.color);
    StdDraw.filledCircle(this.x, this.y, this.radius);
}
//
public void changeDirection(){
    // Toggles the speed between positive and negative
    this.speed = -this.speed;
}
//
public boolean atBottom(double paddleHeight) {
    // Returns true if the bottom of the ball is
    // less than or equal to the top of the paddle.
    return y <= paddleHeight + this.radius;
}
//
public boolean isWithin(double leftEdge, double rightEdge){
    // Returns true if the bottom of the ball is within
    // the two given x-coordinates.
    return (this.x > leftEdge) && (this.x < rightEdge);
}
}
