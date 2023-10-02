package Sources;

public class Player {
    private String Name;
    private char Token;

    public Player(String N, char T){
        Name = N;
        Token = T;
    }

    public String getName() {
        return Name;
    }
    public char getToken() {
        return Token;
    }

}
