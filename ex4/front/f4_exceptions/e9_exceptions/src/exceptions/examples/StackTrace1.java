package exceptions.examples;

import java.io.IOException;

public class StackTrace1 {
	public static void main(String[] args) throws IOException {
		System.out.println("Throw an exception");
		throw new IOException();
	}
}
