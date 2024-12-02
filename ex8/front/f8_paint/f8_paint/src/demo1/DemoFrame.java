package demo1;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DemoFrame extends JFrame {
    static int width;
    static int height;

    static JPanel demoFramePanel = new DemoPanel();

    public DemoFrame(int width, int height) {
	DemoFrame.width = width;
	DemoFrame.height = height;
	this.setSize(width, height);
	this.setTitle("[ECE_Υ325] paint demo");
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setLocationRelativeTo(null);
	this.setFocusable(true);

	this.add(demoFramePanel);

	setResizable(false);
	this.setVisible(true);
    }

}