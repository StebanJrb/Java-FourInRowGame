package Main;

import Controller.Controller;
import Sources.Board;
import Sources.Player;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelBoard extends JPanel {
    private static final int boxSize = 35;
    private static final String image= "./images/board.png";
    private JLabel imageToShow;
    private JLabel tokens[][];
    private static int turn = 0;
    private int currentX;
    public PanelBoard(Board board){
        imageToShow = Controller.setImage(image,600,550);
        imageToShow.setHorizontalAlignment(JLabel.CENTER);
        imageToShow.setVerticalAlignment(JLabel.CENTER);
        imageToShow.setEnabled(true);
        tokens = new JLabel[7][6];
        int x =7, y =2;
        for(int i=0; i < tokens.length; i++){
            for(int j=0; j < tokens [i].length ; j++){
                tokens [i][j] = new JLabel();
                //tokens [i][j] = Controller.setImage("./images/red.png",75,75);
                tokens [i][j].setBounds(x,y, 100,100);
                y+=82;
                System.out.println("X: "+x+ " Y: "+y);
                imageToShow.add(tokens[i][j]);
            }
            y=2;
            x+=85;
        }
        add(imageToShow);
        //tokens.add
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
                                    asing(board, players,0);
                                    break;
                                case 1:
                                    System.out.println("2");
                                    asing(board,players,1);
                                    break;
                                case 2:
                                    System.out.println("3");
                                    asing(board,players,2);
                                    break;
                                case 3:
                                    System.out.println("4");
                                    asing(board,players,3);
                                    break;
                                case 4:
                                    System.out.println("5");
                                    asing(board,players,4);
                                    break;
                                case 5:
                                    System.out.println("6");
                                    asing(board,players,5);
                                    break;
                                case 6:
                                    System.out.println("7");
                                    asing(board,players,6);
                                    break;
                                case 10:
                                    JOptionPane.showInputDialog(null, "Error");
                            }
                            if(board. winner(players[turn].getToken())==true){
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
    private void asing(Board board, Player players[],int a){
        if(turn==0){
            tokens[a][board.getCount(a)].setIcon(Controller.setImage("./images/red.png",75,75).getIcon());
            board.putAt(a, players[turn].getToken());
        }else{
            tokens[a][board.getCount(a)].setIcon(Controller.setImage("./images/black.png",75,75).getIcon());
            board.putAt(a, players[turn].getToken());
        }
    }
}


