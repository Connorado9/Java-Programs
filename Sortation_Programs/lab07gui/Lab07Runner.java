package com.eimacs.lab07gui;

import com.eimacs.lab07.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author IMACS Curriculum Development Group
 * @version 2.0 January 2015
 */
public class Lab07Runner
{
	/* 
	 * Random number generator 
	 * 
	 * @param n  a positive integer 
	 * @return an integer chosen at random from 0 through n-1 
	 */ 
	public static int random( int n ) 
	{ 
	  return (int)(n * Math.random()); 
	} 

	// Define the static method randomArrayList here
	/*public static ArrayList<Integer> randomArrayList(int n)
	{
	    ArrayList<Integer> random = new ArrayList<Integer>(n);
	    
	    for(int i = 0; i < n; i++)
	    {
	        random.add(random(1000));
	    }

	    return random;
	} 
	*/
	public static ArrayList<Integer> randomArrayList(int n, int dir)
	{
	    ArrayList<Integer> narray = new ArrayList<Integer>();
	    
	    for(int i = 0; i < n; i++)
	    {
	        narray.add(random(1000));
	    }
	    if(dir > 0)
	    {
	        Collections.sort(narray);
	    }
	    if(dir < 0)
	    { 
	        Collections.sort(narray, Collections.reverseOrder());
	    }
	    return narray;
	}
	
	// Define the static method arrayListOfArrayLists here
	public static ArrayList<ArrayList<Integer>> arrayListOfArrayLists(int m, int n, int dir)
	{
	    ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(m);
	    
	    for(int i = 0; i < m; i++)
	    {
	        list.add(randomArrayList(n, dir));
	    }
	    
	    return list;
	}

	
	public static void main( String[] args )
    {
        /*ArrayList<ArrayList<Integer>> a;
        APTimer timer = new APTimer();
        timer.start();
        for ( int i = 0; i < 100; i++ )
            a = arrayListOfArrayLists( 1000, 1000 );
        timer.stop();
        
        System.out.println( "Average time to make 1000 ArrayLists of size 1000: " +
                timer.interval() / 100.0 + " ms." );*/
		/*final int NTESTS = 100;
		final int ARRSIZE = 50;

		ArrayList<ArrayList<Integer>> a = arrayListOfArrayLists( NTESTS, ARRSIZE );
		APTimer timer = new APTimer();
		// Sort s = new SelectionSort();
		// Sort s = new InsertionSort();
		Sort s = new MergeSort();

		timer.start();
		for ( ArrayList<Integer> aList : a )
		  s.sortList( aList );
		timer.stop();

		System.out.println( "Average time to sort an ArrayList of size " + ARRSIZE +
		                    ": " + (timer.interval() / (double)NTESTS) + " ms." );
		                    */
		final int NTESTS = 100;
		final int ARRSIZE = 10;
		final int DIR = 1;
		String[] orderTypes = { "decreasing", "random", "increasing" };

		ArrayList<ArrayList<Integer>> a = arrayListOfArrayLists( NTESTS, ARRSIZE, DIR );
		APTimer timer = new APTimer();
		Sort s = new InsertionSort();

		timer.start();
		for ( ArrayList<Integer> aList : a )
		  s.sortList( aList );
		timer.stop();

		System.out.println( "Average time to sort an ArrayList of size " + ARRSIZE + 
		                    ", initially in " + orderTypes[ DIR + 1 ] + " order: " +
		                    (timer.interval() / (double)NTESTS) + " ms." );
    }
}
