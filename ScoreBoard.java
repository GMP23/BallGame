// file: ScoreBoard.java
// author: Garret Patten
// date: 01/30/17
// revised: 02/01/17
// revised:02/02/17
//
import edu.princeton.cs.algs4.StdDraw;
//
public class ScoreBoard {
    private int currentLevel;
    private int numBallsHitByPaddle;
    private int numBallsLost;
//
public ScoreBoard(){
}
//  
public void zap() {
    // Increment the number of balls that have been lost.
    this.numBallsLost++;
}
//
public boolean gameOver() {
    // Return true when the number of lost balls
    // is at least 5, and false otherwise.
    return this.numBallsLost >= 5;
}
//
public boolean increment() {
    // Increment the number of hits. If the number of hits
    // is at least 3*level, then increase the level and
    // return true; otherwise return false.
    this.numBallsHitByPaddle++;
    if(this.numBallsHitByPaddle >= (this.currentLevel * 3)){
        this.currentLevel++;
        return true;
    }
    else{
        return false;
    }
} 
//
public void draw(boolean gameover) {
  // Display the current status of the game on the StdDraw window.
  if (gameOver()){
      StdDraw.text(0.5, 0.6, "GAME OVER");
  }
  else{
    StdDraw.text(0.5, 0.6, "Balls Hit: " + this.numBallsHitByPaddle+ ", Level: " + this.currentLevel);
  }
}
}