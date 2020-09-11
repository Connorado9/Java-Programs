package com.eimacs.lab07;

import java.util.ArrayList;

/**
 *
 * @author |your name|
 * @version 1.0 |today's date|
 */
public class SelectionSort extends Sort 
{ 
  public <T extends Comparable<T>> void sortList( ArrayList<T> arr ) 
  { 
    int i, k, posMax;
    T temp;
    for(i = arr.size()-1; i > 0; i--)
    {
        posMax = 0;
        for(k = 1; k <= i; k++)
        {
            T next = arr.get(k);
            if(next.compareTo(arr.get(posMax)) > 0)
            {
                posMax = k;
            }
        }
        temp = arr.get(i);
        arr.set(i, arr.get(posMax));
        arr.set(posMax, temp);
    } 
  } 
} 
