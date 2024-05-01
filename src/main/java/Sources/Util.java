package Sources;

import javax.swing.*;
import java.awt.*;

public class Util {
    public static void centerWindow(JFrame ventana){
        Dimension dPantalla = Toolkit.getDefaultToolkit( ).getScreenSize( );
        Dimension dVentana = ventana.getSize( );
        int xEsquina = ( dPantalla.width / 2 ) - ( dVentana.width / 2 );
        int yEsquina = ( dPantalla.height / 2 ) - ( dVentana.height / 2 );
        ventana.setLocation( xEsquina, yEsquina );
    }
    public static void centerWindow(JDialog ventana){
        Dimension dPantalla = Toolkit.getDefaultToolkit( ).getScreenSize( );
        Dimension dVentana = ventana.getSize( );
        int xEsquina = ( dPantalla.width / 2 ) - ( dVentana.width / 2 );
        int yEsquina = ( dPantalla.height / 2 ) - ( dVentana.height / 2 );
        ventana.setLocation( xEsquina, yEsquina );
    }
}
