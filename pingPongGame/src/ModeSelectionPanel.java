import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ModeSelectionPanel extends JPanel implements ActionListener {
    public boolean singlePlayer;
    JButton twoPlayerButton;
    JButton singlePlayerButton;
    GameFrame frame;
    JLabel icon;
    ImageIcon pong = new ImageIcon("/Users/royhce/IdeaProjects/pingPongGame/src/pingPong.png");


    static final int GAME_WIDTH = 1000;
    static final int GAME_HEIGHT = (int)(GAME_WIDTH * (0.5555));
    static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH, GAME_HEIGHT);


    ModeSelectionPanel(GameFrame frame) {
        this.frame = frame;
        twoPlayerButton = new JButton("2 PLAYER");
        singlePlayerButton = new JButton("1 PLAYER");
        icon = new JLabel();
        icon.setIcon(pong);

        this.setPreferredSize(SCREEN_SIZE);
        this.add(twoPlayerButton);
        this.add(singlePlayerButton);
        this.add(icon);

        twoPlayerButton.addActionListener(this);
        singlePlayerButton.addActionListener(this);




    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == twoPlayerButton){
            frame.twoPlayerMethod();
        }
        if(e.getSource() == singlePlayerButton){
            frame.singlePlayerMethod();
        }
    }
}
