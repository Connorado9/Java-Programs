package com.eimacs.lab03gui;

import com.eimacs.lab03.Deck;
import com.eimacs.lab03.Hand;
import javax.swing.JFrame;

/**
 * A JFrame that displays a Hand of Cards
 * 
 * @author IMACS Curriculum Development Group
 * @version 2.0 January 14, 2015
 */
public class Lab03Runner extends JFrame
{
    /**
     * Class constructor
     * 
     * @param title  the title to be displayed in the JFrame's title bar
     */
    public Lab03Runner( String title )
    {
        super( title );
        initComponents();
    }
    
    /**
     * Initializes the JFrame's components
     */
    private void initComponents()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        getContentPane().setLayout( new java.awt.GridLayout( 0, 1 ) );
        
        Deck d = new Deck();
        d.shuffle();
        
        Hand[] hands = new Hand[ 4 ];
        for ( int i = 0; i < 4; i++ )
          hands[ i ] = new Hand();

        for ( int i = 0; i < 20; i++ )
          hands[ i % 4].addCard( d.dealCard() );

        for ( int i = 0; i < 4; i++ )
          add( new HandPanel( hands[ i ] ) );
        
        pack();
    }
    
    /**
     * The main method launches the Lab03Runner JFrame
     * 
     * @param args  not used
     */
    public static void main( String[] args )
    {
        /* Creates and displays the JFrame */
        java.awt.EventQueue.invokeLater( new Runnable()
        {
            public void run()
            {
                new Lab03Runner( "Poker" ).setVisible( true );
            }
        } );
    }
}
