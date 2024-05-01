package Sources;

import Controller.Controller;

import javax.swing.*;

public class Board {
    private char tab[][];
    private int count[];

    public Board() {
        tab = new char[6][7];
        count = new int[8];
        initialize();
    }

    private void initialize() {
        for (char[] tab1 : tab) {
            for (int j = 0; j < tab1.length; j++) {
                tab1[j] = '-';
            }
        }
        for (int i = 0; i < count.length; i++) {
            count[i] = 5;
        }
    }

    public void showBoard() {
        System.out.println("-------------");
        System.out.println("0 1 2 3 4 5");
        for (char[] tab1 : tab) {
            for (int j = 0; j < tab1.length; j++) {
                System.out.print(tab1[j] + " ");
            }
            System.out.println(" ");
        }
        for (int i = 0; i < count.length; i++) {
            System.out.print(count[i]);
        }
    }
    public int getCount(int y){
        return count[y];
    }
    public void putAt(int y, char f) {
        tab[count[y]][y] = f;
        count[y]--;
    }

    public boolean winner(char T) {
        return rows(T) || column(T) || diagonal(T);
    }

    private boolean rows(char T) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (tab[i][j] == T && tab[i][j + 1] == T && tab[i][j + 2] == T && tab[i][j + 3] == T) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean column(char T) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 3; j++) {
                if (tab[j][i] == T && tab[j + 1][i] == T && tab[j + 2][i] == T && tab[j + 3][i] == T) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean diagonal(char T) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if ((tab[i][j] == T && tab[i + 1][j + 1] == T && tab[i + 2][j + 2] == T && tab[i + 3][j + 3] == T) ||
                        (tab[i + 3][j] == T && tab[i + 2][j + 1] == T && tab[i + 1][j + 2] == T && tab[i][j + 3] == T)) {
                    return true;
                }
            }
        }
        return false;
    }
}
