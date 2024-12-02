package demo4;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DemoFrame4 extends JFrame implements KeyListener {
    static int width;
    static int height;

    static JPanel demoFramePanel = new DemoPanel4();

    public DemoFrame4(int width, int height) {
	DemoFrame4.width = width;
	DemoFrame4.height = height;
	this.setSize(width, height);
	this.setTitle("[ECE_Υ325] paint demo 4");
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setLocationRelativeTo(null);

	this.add(demoFramePanel);

	setResizable(false);
	this.setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent arg0) {
	System.out.println(arg0.toString());
    }

    @Override
    public void keyReleased(KeyEvent arg0) {
	// TODO Auto-generated method stub

    }

    @Override
    public void keyTyped(KeyEvent arg0) {
	// TODO Auto-generated method stub

    }

}