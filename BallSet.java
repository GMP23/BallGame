// file: BallSet.java
// author: Garret Patten
// date: 01/30/17
// revised: 02/01/17
// revised:02/02/17
//
public class BallSet{
    private int numBalls;
    private Ball[] balls = new Ball[10];
//
public BallSet(int num) {
    this.numBalls = num;
    for(int i =0; i < this.numBalls; i++) {
        balls[i] = new Ball();
    }
}
//
public int numBalls() {
    // Returns the current number of balls.
    return this.numBalls;
}
//
public Ball get(int n) {
    // Returns the nth ball in the set.
    return balls[n];
}
//
public void addBall() {
    // Adds a new ball to the set. If there are already 10
    // balls in the set, then the method does nothing.
    if(this.numBalls < 10){
        balls[this.numBalls++] = new Ball();
    }
}
//
public void delete(int n) {
    // Deletes the nth ball in the set by moving the
    // last ball of the array into slot n of the array.
    Ball lastBall = balls[this.numBalls - 1];
    balls[n] = lastBall;
    this.numBalls--;
}
}