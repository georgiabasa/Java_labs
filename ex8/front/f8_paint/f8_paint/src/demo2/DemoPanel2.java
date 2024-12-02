package demo2;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DemoPanel2 extends JPanel {

    // Ο ενδεικνυόμενος τρόπος είναι κάνοντας override την paintComponent
    @Override
    public void paintComponent(Graphics g) {
	super.paintComponent(g);
	g.setFont(new Font("Arial", Font.PLAIN, 22));
	// Ζωγράφισε ένα κείμενο
	g.drawString("Το δικό μου Panel!", 10, 20);

	// Η Dimension αφορά το μέγεθος ενός γραφικού στοιχείο, άρα είναι σε 2
	// διαστάσεις
	Dimension size = getSize(); // παίρνουμε το μέγεθος του παραθύρου
	//για να το τοποθετήσουμε στο κέντρο του παραθύρου και στους δύο άξονες
	int x = (size.width - MainClass2.spaceShipWidth) / 2; 
	int y = (size.height - MainClass2.spaceShipHeight) / 2;
	// Ζωγραφίζουμε έναν κύκλο (το αντικείμενο g:Graphics ξέρει πως να το κάνει αυτό
	// με τη μέθοδο fillOval())
	g.setColor(Color.black);
	g.fillOval(x, y, MainClass2.spaceShipWidth, MainClass2.spaceShipHeight);
	g.setColor(Color.red);
	g.drawOval(x, y, MainClass2.spaceShipWidth, MainClass2.spaceShipHeight);
    }
}
