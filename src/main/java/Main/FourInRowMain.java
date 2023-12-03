package Main;

import Sources.Board;
import Sources.Player;

import javax.swing.*;
import java.util.Scanner;

public class FourInRowMain extends JFrame {
    private Board board;
    private Player [] players;
    public FourInRowMain(){
        setTitle("FourInRowMain");
        getContentPane().setLayout(null);
        this.board = new Board();
        this.players = new Player[2];

        /*String name1 = JOptionPane.showInputDialog("..:: Write Player#1 Name");
        char token1 = name1.charAt(0);
        players[0] = new Player(name1,token1);
        String name2 = JOptionPane.showInputDialog("..:: Write Player#2 Name");
        char token2 = name2.charAt(0);
        players[1] = new Player(name2,token2);*/

        PanelBoard pnlBoard = new PanelBoard(board);
        pnlBoard.setBounds(0,100,600,600);
        PanelPlayer pnlPlayers = new PanelPlayer(1, "Steban");
        pnlPlayers.setBounds(0,0,600,100);




        //All code to Jframe
        getContentPane().add(pnlBoard);
        getContentPane().add(pnlPlayers);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setSize(615,690);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            FourInRowMain game = new FourInRowMain();
        });
        Scanner x = new Scanner(System.in);
        Board Tab = new Board();
        Player [] Pla = new Player[2];
        System.out.println("--------------------------------------------------");
        System.out.println("!                                                !");
        System.out.println("!                                                !");
        System.out.println("!               GAME 4 IN LINE                   !");
        System.out.println("!                                                !");
        System.out.println("!                                                !");
        System.out.println("--------------------------------------------------");
        System.out.println("..:: Write Player#1 Name");
        String N = x.next();
        System.out.println("..:: Write Player#1 Token");
        char T = x.next().charAt(0);
        Pla[0] = new Player(N,T);
        System.out.println("..:: Write Player#2 Name");
        String N1 = x.next();
        System.out.println("..:: Write Player#2 Token");
        char T1 = x.next().charAt(0);
        Pla[1] = new Player(N1,T1);
        int Op = 1;
        do{
            switch(Op){
                case 1:{
                    Tab.ShowBoard();
                    if(Tab.Winner(Pla[1].getToken())== true){
                        System.out.println("..:: "+Pla[1].getName()+" WON ");
                        Op = 3;
                        break;}
                    System.out.println("..:: Player "+Pla[0].getName()+" choose 0-6");
                    int Y1=x.nextInt();
                    Tab.PutAt(Y1,Pla[0].getToken());
                    Op = 2;
                }break;
                case 2:{
                    Tab.ShowBoard();
                    if(Tab.Winner(Pla[0].getToken())== true){
                        System.out.println("..:: "+Pla[0].getName()+" WON ");
                        Op = 3;
                        break;}
                    System.out.println("..:: Player "+Pla[1].getName()+" choose 0-6");
                    int Y1=x.nextInt();
                    Tab.PutAt(Y1,Pla[1].getToken());
                    Op = 1;
                }break;
            }
        }while(Op !=3);
    }
}

