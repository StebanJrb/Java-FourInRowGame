package Sources;

public class Board {
    private char Tab[][];
    private int Count[];

    public Board() {
        Tab = new char[6][7];
        Count = new int[8];
        initialize();
    }

    private void initialize() {
        for (char[] tab1 : Tab) {
            for (int j = 0; j < tab1.length; j++) {
                tab1[j] = '-';
            }
        }
        for (int i = 0; i < Count.length; i++) {
            Count[i] = 5;
        }
    }

    public void showBoard() {
        System.out.println("-------------");
        System.out.println("0 1 2 3 4 5");
        for (char[] tab1 : Tab) {
            for (int j = 0; j < tab1.length; j++) {
                System.out.print(tab1[j] + " ");
            }
            System.out.println(" ");
        }
        for (int i = 0; i < Count.length; i++) {
            System.out.print(Count[i]);
        }
    }

    public void putAt(int y, char f) {
        Tab[Count[y]][y] = f;
        Count[y]--;
    }

    public boolean winner(char T) {
        return rows(T) || column(T) || diagonal(T);
    }

    private boolean rows(char T) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (Tab[i][j] == T && Tab[i][j + 1] == T && Tab[i][j + 2] == T && Tab[i][j + 3] == T) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean column(char T) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 3; j++) {
                if (Tab[j][i] == T && Tab[j + 1][i] == T && Tab[j + 2][i] == T && Tab[j + 3][i] == T) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean diagonal(char T) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if ((Tab[i][j] == T && Tab[i + 1][j + 1] == T && Tab[i + 2][j + 2] == T && Tab[i + 3][j + 3] == T) ||
                        (Tab[i + 3][j] == T && Tab[i + 2][j + 1] == T && Tab[i + 1][j + 2] == T && Tab[i][j + 3] == T)) {
                    return true;
                }
            }
        }
        return false;
    }
}
