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
        setTitle("FourInRowMain");
        getContentPane().setLayout(null);
        this.board = new Board();
        this.players = new Player[2];

        mbrOptions = new JMenuBar( );

        mnuAbout = new JMenu( );
        mnuAbout.setMnemonic( 'A' );
        mnuAbout.setText( "About" );

        mitAbout = new JMenuItem();
        mitAbout.setMnemonic( 'S' );
        mitAbout.setText( "Author: Steban Ruiz" );

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
        String name1 = JOptionPane.showInputDialog(null,player1,"FourInRow", JOptionPane.PLAIN_MESSAGE);
        char token1 = name1.charAt(0);
        players[0] = new Player(name1,token1);


        JPanel player2 = new JPanel();
        ImageIcon icon1 = new ImageIcon("./images/black.png");
        JLabel black = new JLabel(icon1);
        player2.add(black, BorderLayout.CENTER);
        JLabel textLabel1 = new JLabel("Write Player#2 Name");
        textLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        player2.add(textLabel1, BorderLayout.SOUTH);
        String name2 = JOptionPane.showInputDialog(null,player2,"FourInRow",JOptionPane.PLAIN_MESSAGE);
        char token2 = name2.charAt(0);
        players[1] = new Player(name2,token2);

        pnlBoard = new PanelBoard(board);
        pnlBoard.setBounds(0,100,600,600);
        pnlPlayers = new PanelPlayer(1, players[0].getName());
        pnlPlayers.setBounds(0,0,600,100);

        getContentPane().add(pnlBoard);
        getContentPane().add(pnlPlayers);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setSize(615,710);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Util.centerWindow( this );
    }
    public  void playGame(){
        pnlBoard.play(players,board,pnlPlayers);
    }
    public static void main(String[] args) {
        //SwingUtilities.invokeLater(FourInRowMain::new);
        FourInRowMain main = new FourInRowMain();
        main.playGame();
       /* Scanner x = new Scanner(System.in);
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
                    Tab.showBoard();
                    if(Tab.winner(Pla[1].getToken())== true){
                        System.out.println("..:: "+Pla[1].getName()+" WON ");
                        Op = 3;
                        break;}
                    System.out.println("..:: Player "+Pla[0].getName()+" choose 0-6");
                    int Y1=x.nextInt();
                    Tab.putAt(Y1,Pla[0].getToken());
                    Op = 2;
                }break;
                case 2:{
                    Tab.showBoard();
                    if(Tab.winner(Pla[0].getToken())== true){
                        System.out.println("..:: "+Pla[0].getName()+" WON ");
                        Op = 3;
                        break;}
                    System.out.println("..:: Player "+Pla[1].getName()+" choose 0-6");
                    int Y1=x.nextInt();
                    Tab.putAt(Y1,Pla[1].getToken());
                    Op = 1;
                }break;
            }
        }while(Op !=3);*/
    }
}

