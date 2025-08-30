import java.applet.Applet; 
import java.awt.Color; 
import java.awt.Graphics; 
/*  
 <applet code = "FillOval" width = 200 height = 200></applet> 
*/ 
public class FillOvals extends Applet   { 
 public void paint(Graphics g)   { 
  g.setColor(Color.YELLOW);
  g.fillOval(50, 50, 200, 200);
//  50, 50: The x and y coordinates of the top-left corner of the bounding rectangle.
//  200, 200: The width and height of the bounding rectangle.
  
  // Draw the eyes (two small circles)
  g.setColor(Color.BLACK);
  g.fillOval(90, 100, 30, 30);
  g.fillOval(180, 100, 30, 30);
  
  // Draw the mouth (an arc)
  g.drawArc(100, 150, 100, 50, 0, -180);
  //g.drawArc(x, y, width, height, startAngle, arcAngle);
 } 
} 
