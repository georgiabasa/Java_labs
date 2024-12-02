package φροντιστήριο.cardlayout;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CardLayoutExample1 extends JFrame implements ActionListener {

    CardLayout cardLayout;

    JButton jButton1, jButton2, jButton3, jButton4;
    Container contentPane;

    CardLayoutExample1() {
	contentPane = getContentPane();

	cardLayout = new CardLayout();

	contentPane.setLayout(cardLayout);

	jButton1 = new JButton("Φθινόπωρο");
	jButton2 = new JButton("Χειμώνας");
	jButton3 = new JButton("Άνοιξη");
	jButton4 = new JButton("Καλοκαίρι");

	//και στα 4 κουμπιά τοποθετούμε τον ίδιο ActionLister
	//o ActionListener είναι το στιγμιότυπο της κλάσης μας (CardLayoutExample1), 
	//αφού η κλάση μας υλοποιεί το ActionListener interface
	//και άρα είναι υποχρεωμένη να παρέχει τη μέθοδο actionPerformed()
	//Όταν πατιέται ένα κουπί θα καλείται η μέθοδος actionPerformed() του listener, 
	//που όπως δηλώνουμε παρακάτω είναι ο this:
	jButton1.addActionListener(this);
	jButton2.addActionListener(this);
	jButton3.addActionListener(this);
	jButton4.addActionListener(this);

	contentPane.add(jButton1);
	contentPane.add(jButton2);
	contentPane.add(jButton3);
	contentPane.add(jButton4);
    }

    public void actionPerformed(ActionEvent e) {
	//όταν κληθεί η μέθοδος (ορίσαμε στον δημιουργό πότε θα κληθεί),
	//το Layout cardLayout θα ζητήσει από τον container contentPane να δείξε την επόμενη κάρτα
	cardLayout.next(contentPane);
	System.out.println(e.paramString());
    }

    // main method
    public static void main(String argvs[]) {
	CardLayoutExample1 cardLayoutExample1 = new CardLayoutExample1();

	cardLayoutExample1.setSize(300, 300);
	cardLayoutExample1.setVisible(true);
	cardLayoutExample1.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}