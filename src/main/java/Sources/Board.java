package Sources;

public class Board {
    private char Tab[][];
    private int Count [];

    public Board(){
        Tab = new char [6][7];
        Count = new int [8];
        Initialize();
    }
    private void Initialize(){
        for (char[] Tab1 : Tab) {
            for (int j = 0; j < Tab1.length; j++) {
                Tab1[j] = '-';
            }
        }
        for (int i = 0; i < Count.length; i++) {
            Count[i]= 5;
        }
    }
    public void ShowBoard(){
        System.out.println("-------------");
        System.out.println("0 1 2 3 4 5 6");
        for (char[] Tab1 : Tab) {
            for (int j = 0; j < Tab1.length; j++) {
                System.out.print(Tab1[j] + " ");
            }
            System.out.println(" ");
        }
        for (int i = 0; i < Count.length; i++) {
            System.out.print(Count[i]);

        }
    }
    public void PutAt(int y,char f){
        Tab[Count[y]][y]= f;
        Count[y]--;
    }
    public boolean Winner(char T){
        return Rows(T)||Column(T)||Diagonal(T)==true;
    }
    private  boolean Rows(char T){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (Tab[i][j] == T && Tab[i][j+1] == T && Tab[i][j+2] == T && Tab[i][j+3] == T){
                    return true;
                }
            }
        }return false;
    }
    private boolean Column(char T){
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 3; j++) {
                if (Tab[j][i] == T && Tab[j+1][i] == T && Tab[j+2][i] == T && Tab[j+3][i] == T){
                    return true;
                }
            }
        }return false;
    }
    private boolean Diagonal(char T){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (Tab[i][j] == T && Tab[i+1][j+1] == T && Tab[i+2][j+2] == T && Tab[i+3][j+3] == T|| Tab[i+3][j] == T && Tab[i+2][j+1] == T && Tab[i+1][j+2] == T && Tab[i][j+3] == T){
                    return true;
                }
            }
        }return false;
    }
}
