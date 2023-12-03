package Main;

import Controller.Controller;

import javax.swing.*;
import java.awt.Font;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class PanelPlayer extends JPanel {
    private JLabel imageToShow,playerString;
    private JButton one,two,three,four,five,six,seven;


    public PanelPlayer(int turn, String player){
        if(turn == 1){
            imageToShow = Controller.setImage("./images/red.png", 90, 90);
        }
        if(turn == 2) {
            imageToShow = Controller.setImage("./images/black.png", 90, 90);
        }
            setLayout(null);
            imageToShow.setBounds(0,5,100,100);

            playerString = new JLabel("Player "+player+" choose 1 - 7");
            Font font = new Font("SansSerif", Font.BOLD, 20);
            playerString.setFont(font);
            playerString.setBounds(100,5,300,20);

            one = new JButton("1");
            //one.setBounds();



            add(imageToShow);
            add(playerString);
    }
}
