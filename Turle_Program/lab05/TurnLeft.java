package com.eimacs.lab05;
import com.eimacs.lab05gui.Turtle;
import java.awt.Graphics;

/**
 *
 * @author Connorado
 * @version 1.1 2/28/18
 */
public class TurnLeft extends Action
{
    private double myAngle;
    public TurnLeft(double degrees)
    {
        myAngle = degrees;
    }
    public String toString()
    {
        return "Left " + myAngle;
    }
    public void execute( Turtle t, Graphics g )
    {
      t.setHeading( t.getHeading() - myAngle );
    }
} 
