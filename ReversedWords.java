/*
Name: Justin Bortmas
COSC 3317
HW #16 Problem 16.9
 */

package reversedwords;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class ReversedWords extends JFrame {
    private JLabel p;
    private JTextField input, output;

    public ReversedWords() {
        p = new JLabel( "Please enter a sentence that you would like reversed: " );
        input = new JTextField( 40 );
        input.addActionListener(

        new ActionListener() {

            public void actionPerformed ( ActionEvent event ) {
                String stringToTokenize = input.getText();
                StringTokenizer tokens = new StringTokenizer( stringToTokenize );
                int count = tokens.countTokens();
                String reverse[] = new String[ count ];
                int index = count - 1;

                while ( tokens.hasMoreTokens() )
                reverse[ index-- ] = tokens.nextToken();

                output.setText( "" );

                    for ( int k = 0; k < count; k++ )
                        output.setText( output.getText() +
                        reverse[ k ] + " " );
            }
        }
        ); 

            Container container = getContentPane();
            container.setLayout( new FlowLayout() );
            
            output = new JTextField( 40 );
            output.setEditable( false );
            container.add( p );
            container.add( input );
            container.add( output );

            setSize( 500, 150 );
            setVisible( true );
    }
    
    public static void main( String[] args ) {
        ReversedWords test = new ReversedWords();
        test.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }
}
