package UI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Robot.Bot;

public class Window extends JFrame{


    Bot bot = new Bot();
    private JProgressBar progressBar1;
    private JTextArea textArea1;
    private JPanel rootPanel;
    private JButton buttonStart;

    private JFrame mainFrame;

    public Window() {
       // setLocationRelativeTo(null);
        setContentPane(rootPanel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buttonStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bot.botActions();
            }
        });
      //initUI();
    }

    private void initUI() {

        mainFrame = new JFrame();
        mainFrame.setTitle("Bot");
        mainFrame. setSize(300, 200);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //mainFrame.startButton = new JButton();
        JButton startButton = new JButton("Start");
        startButton.setSize(150,100);
        mainFrame.add(startButton);
        mainFrame.setVisible(true);
    }


}
