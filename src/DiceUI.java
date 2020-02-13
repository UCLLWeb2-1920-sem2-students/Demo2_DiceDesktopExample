import java.util.Random;

import javax.swing.JOptionPane;

public class DiceUI {

    public static void main(String[] args) {
        boolean gameOver = false;
        while (!gameOver) {
            String answer = JOptionPane.showInputDialog("1 - Play dice \n0 - Quit");
            int guessedNumber = Integer.parseInt(answer);
            if (guessedNumber == 0) {
                gameOver = true;
            } else {
                int eyes = new Random().nextInt(6) + 1;
                String message = "You threw a " + eyes;
                JOptionPane.showMessageDialog(null, message);
            }
        }
    }
}
