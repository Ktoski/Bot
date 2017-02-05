package Robot;
import java.awt.*;

import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Bot {

   public Robot robot;

    public Bot() {
        try {
             robot = new Robot();
        } catch (AWTException e) {
            System.err.println("Bot did not started");
            e.printStackTrace();
        }
    }
    private static final int SPEED = 300;

    /**
     * Metoda drukuje tekst "Hello World"
     */
    public void printText() {
        int[] text = {KeyEvent.VK_H, KeyEvent.VK_E, KeyEvent.VK_L, KeyEvent.VK_L, KeyEvent.VK_O, KeyEvent.VK_SPACE,
                KeyEvent.VK_W, KeyEvent.VK_O, KeyEvent.VK_R, KeyEvent.VK_L, KeyEvent.VK_D};

        //pętla - wciśnięcie przycisku i przerwa na 200ms
        for(int i=0; i<text.length; i++) {
            robot.keyPress(text[i]);
            robot.delay(200);
        }
    }

    /**
     * Metoda robi screenshot ekranu i zapisuje go na dysku
     */
    public void screenCapture() {

        //pobieramy rozmiar ekranu i tworzymy Rectangle
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle rectangle = new Rectangle(dimension);

        //robimy screenshot z utworzonego obszaru
        BufferedImage screen = robot.createScreenCapture(rectangle);
        try {
            ImageIO.write(screen, "jpg", new File("screenshot.jpg"));
        } catch (IOException e) {
            System.err.println("Błąd zapisu obrazu");
            e.printStackTrace();
        }
    }

    private void execute(int[] letter) {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < letter.length; i++) {
            robot.delay(SPEED);
            robot.keyPress(letter[i]);
            robot.keyRelease(letter[i]);
        }

    }

    public void botActions(){
       // robot.delay(3000);
        printText();
        screenCapture();

    }
        /*
        * int[] executeNotepad = {KeyEvent.VK_WINDOWS,KeyEvent.VK_N,KeyEvent.VK_O,KeyEvent.VK_T,KeyEvent.VK_E,KeyEvent.VK_P,KeyEvent.VK_A,KeyEvent.VK_D,KeyEvent.VK_ENTER};
		*int[] maximizeIt = {KeyEvent.VK_ALT,KeyEvent.VK_SPACE,KeyEvent.VK_X};
		*int[] messageToPrint = {KeyEvent.VK_H,KeyEvent.VK_E,KeyEvent.VK_L,KeyEvent.VK_L,KeyEvent.VK_O};

		*t.execute(executeNotepad);
		*t.execute(maximizeIt);
        *t.execute(messageToPrint);
        */



}
