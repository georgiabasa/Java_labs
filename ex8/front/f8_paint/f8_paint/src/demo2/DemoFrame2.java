package demo2;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DemoFrame2 extends JFrame {
    static int width;
    static int height;

    static JPanel demoFramePanel = new DemoPanel2();

    public DemoFrame2(int width, int height) {
	DemoFrame2.width = width;
	DemoFrame2.height = height;
	this.setSize(width, height);
	this.setTitle("[ECE_Υ325] paint demo 2");
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setLocationRelativeTo(null);
	this.setFocusable(true);

	this.add(demoFramePanel);

	setResizable(false);
	this.setVisible(true);
    }

}