package com.eimacs.lab05;

/**
 * Models a point in a plane
 * 
 * @author Connor Humiston
 * @version 1.0 11/8/2017
 */
public class APPoint 
{ 
  private double myX; 
  private double myY; 

  public APPoint( double x, double y ) 
  { 
    myX = x; 
    myY = y; 
  } 

  public double getX() { return myX; } 
  public double getY() { return myY; } 
  public void setX( double x ) { myX = x; } 
  public void setY( double y ) { myY = y; } 
} 

