package φροντιστήριο.cardlayout;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CardLayoutExample3 extends JFrame {

    CardLayout cardLayout;

    JButton jButton1, jButton2, jButton3, jButton4;
    Container contentPane;

    CardLayoutExample3() {
	contentPane = getContentPane();

	cardLayout = new CardLayout();

	contentPane.setLayout(cardLayout);

	jButton1 = new JButton("Φθινόπωρο");
	jButton2 = new JButton("Χειμώνας");
	jButton3 = new JButton("Άνοιξη");
	jButton4 = new JButton("Καλοκαίρι");

	// και στα 4 κουμπιά τοποθετούμε τον ίδιο ActionLister
	// o ActionListener τώρα είναι υλοποιημένος στην εξωτερική
	// κλάση MyActionListener. Περνάμε αναφορά το τρέχον στιγμιότυπο
	// για να μπορεί να έχει πρόσβαση ο ActionListener στα πεδία
	// cardLayout, contentPane
	MyActionListener myActionListener = new MyActionListener(this);
	jButton1.addActionListener(myActionListener);
	jButton2.addActionListener(myActionListener);
	jButton3.addActionListener(myActionListener);
	jButton4.addActionListener(myActionListener);

	contentPane.add(jButton1);
	contentPane.add(jButton2);
	contentPane.add(jButton3);
	contentPane.add(jButton4);
    }

    // main method
    public static void main(String argvs[]) {
	CardLayoutExample3 cardLayoutExample1 = new CardLayoutExample3();

	cardLayoutExample1.setSize(300, 300);
	cardLayoutExample1.setVisible(true);
	cardLayoutExample1.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

class MyActionListener implements ActionListener {
    private CardLayoutExample3 cardLayoutExample3;	
    
    public MyActionListener(CardLayoutExample3 cardLayoutExample3) {
	this.cardLayoutExample3=cardLayoutExample3;
    }
    
	public void actionPerformed(ActionEvent e) {
	    // όταν κληθεί η μέθοδος (ορίσαμε στον δημιουργό πότε θα κληθεί),
	    // το Layout cardLayout θα ζητήσει από τον container contentPane να δείξε την
	    // επόμενη κάρτα
	    cardLayoutExample3.cardLayout.next(cardLayoutExample3.contentPane);
	    System.out.println(e.paramString());
	}
}