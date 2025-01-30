import java.awt.*;
import javax.swing.*;

public class GameFrame extends JFrame{

    GamePanel panel;
    ModeSelectionPanel modePanel;

    GameFrame(){

        modePanel = new ModeSelectionPanel(this);
        this.add(modePanel);
        this.setTitle("Pong Game");
        this.setResizable(false);
        this.setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);



        /*
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Pong Game");
        this.setResizable(false);
        this.setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

         */
    }

    public void twoPlayerMethod(){
        this.remove(modePanel);
        panel = new GamePanel(false);
        this.add(panel);
        this.revalidate();
        this.repaint();
        panel.requestFocusInWindow();
    }

    public void singlePlayerMethod(){
        this.remove(modePanel);
        panel = new GamePanel(true);
        this.add(panel);
        this.revalidate();
        this.repaint();
        panel.requestFocusInWindow();
    }

}
