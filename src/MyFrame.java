import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame() {
        this.setTitle("My JFrame"); //Title of the Jframe (the thing that  it says at the top
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //If the window is closed, the whole program will exit.
        this.setResizable(false); //Now you cant drag it. It will always be the size we set.
        this.setSize(420, 420); //sets size of this (x,y)
        this.setVisible(true); //makes the frame visible

        ImageIcon image = new ImageIcon("download.jpg"); // crates a imageicon
        this.setIconImage(image.getImage()); //Changes the icon in the top left corner to this picture.
        this.getContentPane().setBackground(new Color(140,0,70)); //Sets background color

    }
}
