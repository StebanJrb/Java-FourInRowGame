package Main;

import Controller.Controller;
import Sources.Board;
import Sources.Player;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PanelBoard extends JPanel {
    private static final int boxSize = 35;
    private Board board;
    private static final String image= "./images/board.png";
    private JLabel imageToShow;
    private static int turn = 0;
    private int currentX;
    public PanelBoard(Board board){

        imageToShow = Controller.setImage(image,600,550);
        imageToShow.setHorizontalAlignment(JLabel.CENTER);
        imageToShow.setVerticalAlignment(JLabel.CENTER);
        imageToShow.setEnabled(true);
        JLabel prueba = Controller.setImage("./images/red.png",90,90);
        prueba.setBounds(400,5,80,80);
        add(imageToShow);
        add(prueba);
    }
    public void play(Player [] players, Board board, PanelPlayer pnlPlayer){
            imageToShow.addMouseListener(
                    new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            super.mouseClicked(e);
                            currentX = e.getX();
                            switch (toArray(currentX)){
                                case 0:
                                    System.out.println("1");
                                    board.putAt(0,players[turn].getToken());

                                    break;
                                case 1:
                                    System.out.println("2");
                                    board.putAt(1,players[turn].getToken());
                                    break;
                                case 2:
                                    System.out.println("3");
                                    board.putAt(2,players[turn].getToken());
                                    break;
                                case 3:
                                    System.out.println("4");
                                    board.putAt(3,players[turn].getToken());
                                    break;
                                case 4:
                                    System.out.println("5");
                                    board.putAt(4,players[turn].getToken());
                                    break;
                                case 5:
                                    System.out.println("6");
                                    board.putAt(5,players[turn].getToken());
                                    break;
                                case 6:
                                    System.out.println("7");
                                    board.putAt(6,players[turn].getToken());
                                    break;
                                case 10:
                                    JOptionPane.showInputDialog(null, "Error");
                            }
                            if(board.winner(players[turn].getToken())==true){
                                JOptionPane.showMessageDialog(null, players[turn].getName() + "WON! ");
                            }else{
                                currentX = 0;
                                imageToShow.removeMouseListener(this);
                                board.showBoard();
                                pnlPlayer.upDate(turn, players[turn]);
                                turn = (turn + 1) % players.length;
                                play(players, board, pnlPlayer);
                            }
                        }
                    }
            );
    }
    private int toArray(int x){
        if(x>=6&&x<=82){
            return 0;
        }else if(x>=83&&x<=165){
            return 1;
        }else if(x>=166&&x<=254){
            return 2;
        }else if(x>=255&&x<=339){
            return 3;
        }else if(x>=340&&x<=425){
            return 4;
        }else if(x>=426&&x<=513){
            return 5;
        }else if(x>=514&&x<=588){
            return 6;
        }else
            System.out.println("Error at Array");
            return 10;
    }
}

