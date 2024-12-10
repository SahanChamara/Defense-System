package main;

import GUI.Home;
import jaco.mp3.player.MP3Player;
import java.io.File;

/**
 *
 * @author Sahan Chamara
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        //new MainControllerView().setVisible(true);
        //new HelicopterView().setVisible(true);
        new Home().setVisible(true);

        MP3Player player = new MP3Player(new File("C:\\Users\\Sahan Chamara\\Music\\Defense System\\Main\\src\\GUI\\Background Videos\\My Home - Call of Duty_ Black Ops 6 Official Multiplayer Theme.mp3"));
        player.play();
        Thread.sleep(100000);

    }

}
