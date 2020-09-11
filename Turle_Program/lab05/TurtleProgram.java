package com.eimacs.lab05;

import java.awt.Graphics;
import java.util.ArrayList;

import com.eimacs.lab05gui.Turtle;

/**
 *
 * @author Connorado
 * @version 1.0 3/2/18
 */
public class TurtleProgram 
{  private ArrayList<Action> myActions;
   private boolean isValid;
   
  public TurtleProgram()
  {
      myActions = new ArrayList<Action>();
      isValid = false;
  }
  
  public void addAction(Action a)
  {
      myActions.add(a);
      isValid = false;
  }
  
  public String toString()
  {
      String str = "";
      for(Action action: myActions)
      {
          if(str.length() > 0)
          {
              str += "\n";
          }
          str += action.toString();
      }
      return str;
  } 
  
  public void execute(Turtle t, Graphics g)
  {
	  if(isValid)
	  {
		  for(Action a: myActions)
		  {
			  a.execute(t,g);
		  }
	  }
  }
  
  public void setIsValid(boolean valid) 
  {
	isValid = valid;
  }
} 
  