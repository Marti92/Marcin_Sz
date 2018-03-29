
package  com.java21days;

public class Variables {

    public static void main(String[] args) {
        final char UP = 'U';
        byte initialLevel = 12;
        short location = 13250;
        int score = 3500100;
        boolean newGame = true;

        System.out.println("Poziom:" + initialLevel);
        System.out.println("W górę: " + UP);

        if (newGame = true) {
            score = 3500100;
            initialLevel = 112;
            System.out.println(newGame);
        }
    }
}
