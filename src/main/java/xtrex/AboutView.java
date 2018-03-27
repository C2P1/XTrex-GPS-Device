package xtrex;

import java.awt.BorderLayout;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * Displays the About page for the device
 * 
 * @author Connor Harris
 * @version Sprint 3 
 */

public class AboutView extends Screen{

    private static final long serialVersionUID = -6580960841880839449L;
    
    private JLabel content;

    private AboutView(){

        setLayout(new BorderLayout());
        content = new JLabel();
        try {
            content.setIcon(new ImageIcon(new ImageIcon(ImageIO.read(
                this.getClass().getClassLoader().getResourceAsStream("img/about.png"))).getImage().getScaledInstance(
                    Style.SCREEN_SIZE.width, Style.SCREEN_SIZE.height, Image.SCALE_SMOOTH)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        content.setPreferredSize(Style.SCREEN_SIZE);
        add(content, BorderLayout.CENTER);
        
    }
    
    private static class Loader {
        static final AboutView instance = new AboutView();
    }

    public static AboutView getInstance() {
        return Loader.instance;
	}

    /* No need to implemented functionality of the buttons 
     * for this screen
     */
	public void onMinusButtonPressed() {}

	public void onPlusButtonPressed() {}

	public void onSelectButtonPressed() {}
} 
