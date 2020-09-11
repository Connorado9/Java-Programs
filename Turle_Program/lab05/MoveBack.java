package com.eimacs.lab05;
import com.eimacs.lab05gui.Turtle;
import java.awt.Graphics;

/**
 *
 * @author Connorado
 * @version 1.1 2/28/16
 */
public class MoveBack extends Action
{
    private int mySteps;
    public MoveBack(int steps)
    {
        mySteps = steps;
    }
    public String toString()
    {
        return "Back " + mySteps;
    }
    public void execute( Turtle t, Graphics g )
    {
      APPoint p = t.getPosition();
      double h = Math.toRadians( t.getHeading() );

      APPoint newPoint = new APPoint( p.getX() + mySteps * Math.sin( h ),
                                      p.getY() - mySteps * Math.cos( h ) );

      t.lineTo( newPoint, g );
    }
} 
