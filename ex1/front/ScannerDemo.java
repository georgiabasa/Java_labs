import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {
	String testInput = "1 2";
	Scanner myInput ;
	myInput = new Scanner(System.in);
	//ή αυτό, αφαιρέστε τα σχόλια και δοκιμάστε 
	//myInput = new Scanner(testInput);
	
	int a;
	int b;
	int sum;
	
	System.out.println("Δώσε έναν ακέραιο: ");
	a = myInput.nextInt();
	
	System.out.println("Δώσε άλλον έναν ακέραιο: ");
	b = myInput.nextInt();
	
	sum = a + b;
	System.out.printf("Το άθροισμα είναι= %d\n", sum);
    }
}
