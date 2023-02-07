import java.awt.Color;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //FIRST VIDEO
        /*
        JFrame frame = new JFrame(); //Created new frame
        frame.setTitle("My JFrame"); //Title of the JFrame (the thing that  it says at the top
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //If the window is closed, the whole program will exit.
        frame.setResizable(false); //Now you cant drag it. It will always be the size we set.
        frame.setSize(420, 420); //sets size of frame (x,y)
        frame.setVisible(true); //makes the frame visible

        ImageIcon image = new ImageIcon("download.jpg"); // crates a imageicon
        frame.setIconImage(image.getImage()); //Changes the icon in the top left corner to this picture.
        frame.getContentPane().setBackground(new Color(140,0,70)); //Sets background color

        MyFrame myFrame = new MyFrame();
        */

        //SECOND VIDEO
        /*
        ImageIcon image = new ImageIcon("download.jpg");
        Border border = BorderFactory.createLineBorder(Color.white,5);

        JLabel label = new JLabel(); //Creates label
        label.setText("I Love You <3"); //sets text of label
        label.setIcon(image); //makes an image at the frame
        label.setHorizontalTextPosition(JLabel.CENTER); //sets the text left, center, right or imageicon
        label.setVerticalTextPosition(JLabel.TOP); //Sets vertical alignment of the text
        label.setForeground(new Color(200,100,100)); //Color of text
        label.setFont(new Font("MV Boli",Font.ITALIC,20)); //Font, plain (italic, bold etc) and fontsize
        label.setIconTextGap(5); //gap between text and image
        label.setBackground(new Color(125,20,0));
        label.setOpaque(true); //display background color
        label.setBorder(border); //Border of the window
        label.setVerticalAlignment(JLabel.CENTER); //set alignment of content (up and down)
        label.setHorizontalAlignment(JLabel.CENTER); //sets alignment of content (left and right)
        label.setBounds(50,50,350,350);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack(); //resize the frame to fit just right
        */

        //THIRD VIDEO I DIDNT MANAGE TO FINISH THIS...
        ImageIcon icon = new ImageIcon("download.jpg");

        JLabel label = new JLabel();
        label.setText("Hello");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.RIGHT);

        JPanel pinkpanel = new JPanel();
        pinkpanel.setBackground(Color.pink);
        pinkpanel.setBounds(0,0,250,250);
        pinkpanel.setLayout(new BorderLayout());

        JPanel cyanpanel = new JPanel();
        cyanpanel.setBackground(Color.cyan);
        cyanpanel.setBounds(250,0,250,250);

        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(0,250,500,250);
        bluepanel.setLayout(new BorderLayout());

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
        pinkpanel.add(label);
        frame.add(pinkpanel);
        frame.add(cyanpanel);
        frame.add(bluepanel);
    }
}