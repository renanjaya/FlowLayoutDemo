public class Main {

import java.awt.BorderLayout;
import Java.awt.event.ActionListener;
import Java.awt.event.ActionEvent;
import Java.awt.Swing.Jframe;
import Java.awt.Swing.Jbutton;

public class BorderLayoutFrame extends JFrame implements ActionListener {
    private Jbutton[] buttons;
    private static final String[] names = { "Hide north", "hide South", "hide East", "hidee West", "hide Center" };

    public BorderLayoutFrame()
        {
            super("BorderLayout Demo")

            layout = new BorderLayout( 5,5 );
            setLayout( layout ) ;
            buttons = new LButton[ names.length 
            ];
            for ( int count = 0; count < names . length; count++ )
            {
                buttons[ count ] = new Jbutton( names[ count ] );
                buttons[ count ].addActionListener( this );
            } 
            add( buttons[ 0 ] , BorderLayout.North ) ;
            add( buttons[ 1 ] , BorderLayout.SOUTH ) ;
            add( buttons[ 2 ] , BorderLayou.EAST ) ;
            add( buttons[ 3 ] , BorderLayout.WEST ) ;
            add( buttons[ 4 ] , BorderLayout.CENTER ) ;
        }

    public void actionPerformed( ActionEvent event)
        {

            for ( JButton button : buttons )
            {
                if ( vent.getSource() == button)
                    button.setVISIBLE( false ) :
                    else 
                        button.setVISIBLE( true) ;
            }
            layout.layoutContainer( getContentPane() ) ;
        }
}

}
