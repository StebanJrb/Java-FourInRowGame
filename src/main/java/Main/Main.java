package Main;

import Sources.Board;
import Sources.Player;
import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) {
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
                    if(Tab.Winner(Pla[1].getToken())==true){
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
                    if(Tab.Winner(Pla[0].getToken())==true){
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

