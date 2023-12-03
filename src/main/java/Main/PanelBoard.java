package Main;

import Controller.Controller;
import Sources.Board;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PanelBoard extends JPanel {
    private static final int boxSize = 35;
    private Board board;
    private JLabel imageToShow;

    public PanelBoard(Board b){
        imageToShow = Controller.setImage("./images/board.png",600,550);
        imageToShow.setHorizontalAlignment(JLabel.CENTER);
        imageToShow.setVerticalAlignment(JLabel.CENTER);
        imageToShow.setEnabled(true);
        add(imageToShow);

    }

}
