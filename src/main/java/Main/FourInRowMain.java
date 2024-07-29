package Main;

import Controller.Controller;
import Sources.Board;
import Sources.Player;
import Sources.Util;

import javax.swing.*;
import java.awt.*;

public class FourInRowMain extends JFrame {
    private Board board;
    private Player [] players;
    private PanelBoard pnlBoard;
    private PanelPlayer pnlPlayers;
    private JMenuBar mbrOptions;
    private JMenu mnuAbout;
    private JMenuItem mitAbout;
    public FourInRowMain(){
        try {
            setTitle("FourInRowMain");
            getContentPane().setLayout(null);
            this.board = new Board();
            this.players = new Player[2];

            mbrOptions = new JMenuBar();

            mnuAbout = new JMenu();
            mnuAbout.setMnemonic('A');
            mnuAbout.setText("About");

            mitAbout = new JMenuItem();
            mitAbout.setMnemonic('S');
            mitAbout.setText("Author: Steban Ruiz");

            mnuAbout.add(mitAbout);
            mbrOptions.add(mnuAbout);

            setJMenuBar(mbrOptions);

            JPanel player1 = new JPanel();
            ImageIcon icon = new ImageIcon("./images/red.png");
            JLabel red = new JLabel(icon);
            player1.add(red, BorderLayout.CENTER);
            JLabel textLabel = new JLabel("Write Player#1 Name");
            textLabel.setHorizontalAlignment(SwingConstants.CENTER);
            player1.add(textLabel, BorderLayout.SOUTH);
            String name1 = JOptionPane.showInputDialog(null, player1, "FourInRow", JOptionPane.PLAIN_MESSAGE);
            char token1 = name1.charAt(0);
            players[0] = new Player(name1, token1);


            JPanel player2 = new JPanel();
            ImageIcon icon1 = new ImageIcon("./images/black.png");
            JLabel black = new JLabel(icon1);
            player2.add(black, BorderLayout.CENTER);
            JLabel textLabel1 = new JLabel("Write Player#2 Name");
            textLabel1.setHorizontalAlignment(SwingConstants.CENTER);
            player2.add(textLabel1, BorderLayout.SOUTH);
            String name2 = JOptionPane.showInputDialog(null, player2, "FourInRow", JOptionPane.PLAIN_MESSAGE);
            char token2 = name2.charAt(0);
            players[1] = new Player(name2, token2);

            pnlBoard = new PanelBoard(board);
            pnlBoard.setBounds(0, 100, 600, 600);
            pnlPlayers = new PanelPlayer(1, players[0].getName());
            pnlPlayers.setBounds(0, 0, 600, 100);

            getContentPane().add(pnlBoard);
            getContentPane().add(pnlPlayers);
            pack();
            setLocationRelativeTo(null);
            setVisible(true);
            setResizable(false);
            setSize(615, 710);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Util.centerWindow(this);
        }catch (ArrayIndexOutOfBoundsException a){
            JOptionPane.showInputDialog(null,"..:: There is no space, choose other");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public  void playGame(){
        pnlBoard.play(players,board,pnlPlayers);
    }
    public static void main(String[] args) {
        //SwingUtilities.invokeLater(FourInRowMain::new);
        FourInRowMain main = new FourInRowMain();
        main.playGame();
    }
}

