package demo1;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class DemoPanel extends JPanel {
    // το Graphics object περιέχει πληροφορία για τις βασικές δυνατότητες ζωγραφικής
    // της Java (γραμματοσειρά, χρώμα, περιοχή αποκοπής (κλιπ) κλπ.

    // Εδώ κάνουμε Override την paint(). Αν και επιτρέπεται, δεν συνίσταται στο
    // Swing,
    // εκτός και αν ξέρουμε πολύ καλά τί κάνουμε
    // (το JPanel είναι Swing - δείτε το import)
//    @Override
//    public void paint(Graphics g) {
//	super.paint(g);
//	g.setFont(new Font("Arial", Font.PLAIN, 22));
//	// Ζωγράφισε ένα κείμενο
//	g.drawString("Το δικό μου Panel!", 10, 20);
//    }

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
	int d = Math.min(size.width, size.height);// βρίσκουμε τη μικρότερη διάσταση
	// για να το τοποθετήσουμε στο κέντρο του παραθύρου και στους δύο άξονες
	int x = (size.width - d) / 2;
	int y = (size.height - d) / 2;
	// Ζωγραφίζουμε έναν κύκλο (το αντικείμενο g:Graphics ξέρει πως να το κάνει αυτό
	// με τη μέθοδο fillOval())
	g.setColor(Color.black);
	g.fillOval(x, y, d, d);
	g.setColor(Color.red);
	// Το Graphics2D μορεί να κάνει περισσότερα πράγματα,
	// μεταξύ άλλων να έχει πιο φαρδιά πένα:
	Graphics2D g2 = (Graphics2D) g;
	g2.setStroke(new BasicStroke(10));
	g2.drawOval(x, y, d, d);
    }
}
