/* CSC 220 Program 5
 * Regan Laurell
 * May 3, 2017
 * Description: This class creates the MickeyMouse GameCharacter
 * Acknowledgements: To complete this project I had assistance from programming
 *                   consualtants and class examples.
*/

package csc220.program5.laurelr;
import java.awt.*;

/**
 *
 * @author Regan
 */
public class MickeyMouse extends csc220.program5.GameCharacter{

  
    public MickeyMouse(int over, int down, int width, int height, int moveInterval){
       super(over, down, width, height, moveInterval, new csc220.program5.laurelr.List<Point>());
       animationPath.add(new Point(over, down));
       animationPath.add(new Point(over + 100, down));
       animationPath.add(new Point(over + 100, down + 100));
       animationPath.add(new Point(over, down + 100));
    }
    
   
    
    @Override
    public void draw(Graphics g) {
        //head
        g.setColor(Color.BLACK);
        g.fillOval(getOver(), getDown(),getWidth() , getHeight());
        g.fillOval(getOver() - 13, getDown() - 10,getWidth() / 2 ,getHeight() / 2 );
        g.fillOval(getOver() + 35, getDown() - 10, getWidth() / 2, getHeight() / 2);
        //face
        g.setColor(new Color (255, 204,153));
        g.fillOval(getOver()+4, getDown() + 10,getWidth() - getWidth()/6 ,getHeight()-getHeight()/5 );
       //eyes 
        g.setColor(Color.WHITE);
        g.fillOval(getOver() + 10, getDown() + 16, getWidth()/5, getHeight()/3);
        g.fillOval(getOver() + 30, getDown() + 16, getWidth()/5, getHeight()/3);
        g.setColor(Color.BLACK);
        g.fillOval(getOver() + 12, getDown() + 22, getWidth()/8, getHeight()/8);
        g.fillOval(getOver() + 32, getDown() + 22, getWidth()/8, getHeight()/8);
       //nose 
        g.fillOval(getOver() + 19, getDown() + 30 , getWidth()/4, getHeight()/6);
       //smile 
        g.drawArc(getOver()+12, getDown()+35, getWidth()/2, getHeight()/5, 180, 180);
        //stick figure
        g.drawLine(getOver()+25, getDown() + getHeight(), getOver() +25, getDown() + getHeight() + 50);
        
        g.drawLine(getOver()+25, getDown()+ getHeight() + 50, getOver() + 10, getDown()+ getHeight() + 75 );
        g.drawLine(getOver()+25, getDown()+ getHeight() + 50, getOver() + 40, getDown()+ getHeight() + 75 );
        
        g.drawLine(getOver()+25, getDown()+ getHeight() + 25,getOver() + 10, getDown()+ getHeight() + 10 );
        g.drawLine(getOver()+25, getDown()+ getHeight() + 25, getOver() + 40, getDown()+ getHeight() + 10 );
        
        //shorts
        g.setColor(Color.RED);
        g.fillRoundRect(getOver() + 12, getDown() + getHeight() +32, getWidth()/2,  getHeight()/2, 10, 25);
        g.setColor(Color.WHITE);
        g.fillOval(getOver() + 15, getDown() + getHeight() + 40, getWidth()/6, getHeight()/4);
        g.fillOval(getOver() + 25, getDown() + getHeight() + 40, getWidth()/6, getHeight()/4);
        
        //shoes
        g.setColor(Color.YELLOW);
        g.fillRoundRect(getOver(), getDown()+ getHeight() + 65, getWidth()/3, getHeight()/4, 10, 25);
        g.fillRoundRect(getOver() + 35, getDown()+ getHeight() + 65, getWidth()/3, getHeight()/4, 10, 25);
    }
    
   
    
//    @Override
//    public boolean contains(Point p){   
//        Rectangle boundaries = new Rectangle() ;
//        boundaries.x = getOver();
//        boundaries.y = getDown();
//        boundaries.width = getWidth();
//        boundaries.height = getHeight();
//        
//        return boundaries.contains(p);
//    }
    
 
    
    
}
