package XOGame;

import sun.rmi.runtime.Log;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class StartNewGameWindow extends JFrame {
    private final GameWindow gameWindow;

    private static final int WIN_HEIGHT = 230;
    private static final int WIN_WIDTH = 350;
    private static final int MIN_FIELD_SIZE=3;
    private static final int MAX_FIELD_SIZE=10;
    private static final int MIN_WIN_LEN=3;
    private static final int MAX_WIN_LEN=10;
    private static final String STR_WIN_LEN = "Winning Length: ";
    private static final String STR_FIELD_SIZE = "Field Size: ";

    private JRadioButton jrbHumanVsAI=new JRadioButton("Human Vs AI",true);
    private JRadioButton jrbHumanVsHuman=new JRadioButton("Human Vs Human");
    private ButtonGroup gameMode=new ButtonGroup();

    private JSlider slFieldSize;
    private JSlider slWinLength;

    public StartNewGameWindow(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        setTitle("Game Options");
        setVisible(false);
        setSize(WIN_WIDTH,WIN_HEIGHT);

        Rectangle gameWindowBounds = gameWindow.getBounds();
        int posX = (int) gameWindowBounds.getCenterX()-WIN_WIDTH/2;
        int posY = (int) gameWindowBounds.getCenterY()-WIN_HEIGHT/2;
        setLocation(posX,posY);

        setLayout(new GridLayout(10,1));
        addGameControlMode();
        addControlGameFieldWinLength();

        JButton btnStartGame = new JButton("Start a game");
        add(btnStartGame);
        btnStartGame.addActionListener(e -> {
            btnStartGameClick();
        });

    }

    private void btnStartGameClick(){
        int gameMode;
        if (jrbHumanVsAI.isSelected()) {
            gameMode = Map.MODE_H_V_A;
        } else {
            gameMode = Map.MODE_H_V_H;
        }

        int fieldSize = slFieldSize.getValue();
        int winLength = slWinLength.getValue();

        Logic.DOTS_TO_WIN = winLength;
        Logic.SIZE = fieldSize;
        Logic.initMap();
        Logic.gameFinished = false;


        gameWindow.startNewGame(gameMode,fieldSize,fieldSize,winLength);



        setVisible(false);
    }

    private void addGameControlMode (){
        add (new JLabel("Choose Game Mode"));
        gameMode.add(jrbHumanVsAI);
        gameMode.add(jrbHumanVsHuman);
        add (jrbHumanVsAI);
        add (jrbHumanVsHuman);

    }

    private void addControlGameFieldWinLength(){
        add (new JLabel("Choose field Size"));
        JLabel lblFieldSize = new JLabel(STR_FIELD_SIZE+MIN_FIELD_SIZE);
        add (lblFieldSize);
        slFieldSize = new JSlider(MIN_FIELD_SIZE,MAX_FIELD_SIZE,MIN_FIELD_SIZE);
        add(slFieldSize);
        slFieldSize.addChangeListener(e -> {
                int CurrentFieldSize = slFieldSize.getValue();
                slWinLength.setMaximum(CurrentFieldSize);
                lblFieldSize.setText(STR_FIELD_SIZE+CurrentFieldSize);
        });

        add (new JLabel("Choose winning length"));
        JLabel lblWinLen = new JLabel(STR_WIN_LEN+MIN_WIN_LEN);
        add (lblWinLen);

        slWinLength = new JSlider (MIN_WIN_LEN, MAX_WIN_LEN,MIN_WIN_LEN);
        add(slWinLength);
        slWinLength.addChangeListener(e -> {
            int CurrentWinLen = slWinLength.getValue();
            lblWinLen.setText(STR_WIN_LEN+CurrentWinLen);
        });



    }

}
