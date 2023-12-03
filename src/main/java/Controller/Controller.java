package Controller;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Controller {
    public Controller(){

    }
    public static JLabel setImage(String imageRoute, int width, int heigth){
        JLabel imageToShow = new JLabel();
            try {
                BufferedImage image = ImageIO.read(new File(imageRoute));
                Image imagenEscalada = image.getScaledInstance(width, heigth, Image.SCALE_DEFAULT);
                // Establecer la image en la etiqueta
                imageToShow.setIcon(new ImageIcon(imagenEscalada));
            } catch (IOException e) {
                e.printStackTrace();
            }
            return imageToShow;
    }
}

