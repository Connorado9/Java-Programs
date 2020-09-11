package com.eimacs.lab07;

/**
 *
 * @author |your name|
 * @version 1.0 |today's date|
 */
public class APTimer 
{ 
  
      private long myStartTime;
      private long myEndTime;
      public APTimer()
      {
          myStartTime = 0;
          myStartTime = 0;
      }
      
      public void start()
      {
          myStartTime = System.currentTimeMillis();
      }
      
      public void stop()
      {
          myEndTime = System.currentTimeMillis();
      }
      
      public int interval()
      {
          return (int)(myEndTime - myStartTime);
      }
      
      public String toString()
      {
          return interval() + " ms";
      }
  } 