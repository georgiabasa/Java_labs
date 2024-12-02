import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter X Coordinate: ");    
        float x = in.nextFloat();
        System.out.print("Enter Y Coordinate: ");
        float y = in.nextFloat();
        System.out.print("Enter Width: ");
        float w = in.nextFloat();
        System.out.print("Enter Height: ");
        float h = in.nextFloat();
        
        Rectangle objREct=new Rectangle(x,y,w,h);
        
        System.out.print("Enter search coordinate (x): ");   
        float sx = in.nextFloat();
        System.out.print("Enter search coordinate (y): ");
        float sy = in.nextFloat();
        
        if(objREct.contains(sx, sy)) System.out.println("True");
        else System.out.println("False");
        
        in.close();
	}

}
