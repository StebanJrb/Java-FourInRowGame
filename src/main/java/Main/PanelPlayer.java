package Main;

import Controller.Controller;
import Sources.Player;

import javax.swing.*;
import java.awt.Font;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class PanelPlayer extends JPanel {
    private JLabel imageToShow,playerString;


    public PanelPlayer(int turn, String player){
        if(turn == 0){
            imageToShow = Controller.setImage("./images/red.png", 90, 90);
        }
        if(turn == 1) {
            imageToShow = Controller.setImage("./images/black.png", 90, 90);
        }
            setLayout(null);
            imageToShow.setBounds(0,5,100,100);

            playerString = new JLabel("Player "+player+" choose 1 - 7");
            Font font = new Font("SansSerif", Font.BOLD, 20);
            playerString.setFont(font);
            playerString.setBounds(100,5,300,20);

            add(imageToShow);
            add(playerString);
    }
    public void upDate(int turn, Player player){
        if (turn == 0) {
            imageToShow.setIcon(Controller.setImage("./images/red.png", 90, 90).getIcon());
            playerString.setText("Player "+player.getName()+" choose 1 - 7");
        } else if (turn == 1) {
            imageToShow.setIcon(Controller.setImage("./images/black.png", 90, 90).getIcon());
            playerString.setText("Player "+player.getName()+" choose 1 - 7");
        }
    }
}
