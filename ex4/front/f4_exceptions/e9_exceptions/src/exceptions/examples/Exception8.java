package exceptions.examples;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception8 {

    public static void main(String[] args) {
	try {
	    FileReader file = new FileReader (" somefile . txt ") ;
	} catch (FileNotFoundException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }

}
