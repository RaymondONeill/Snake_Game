import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    public GameFrame() throws HeadlessException {
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}

/*
 * this is the panel around the game that will just pop up in the middle of the screen to play. if you look at the "this.'s"
 * you can practically read what is going on for instance the title of this game is "Snake" and we have the program quit on close,
 * and we cannot resize the window. I have this set to false as a safety barrier for later in the stages here.
 */