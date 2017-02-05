package Runners;


import Robot.Actions;
import Robot.Bot;
import UI.Window;

import javax.swing.*;
import java.awt.*;

public class RunBot {

    public static void main(String[] args){

        Bot bot = new Bot();

        EventQueue.invokeLater(() -> {
            Window window = new Window();;
            window.setVisible(true);
        });

        bot.botActions();
    }

}
