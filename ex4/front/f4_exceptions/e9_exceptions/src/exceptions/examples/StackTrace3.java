package exceptions.examples;

public class StackTrace3 {

    public static void main(String[] args) {
	try {
	    Library.externalOp();
	} catch (ExternalException ee) {
	    ee.printStackTrace();
	}
    }
}

class Library {
    static void externalOp() throws ExternalException {
	try {
	    throw new InternalException();
	} catch (InternalException ie) {
	    throw (ExternalException) new ExternalException().initCause(ie);
	}
    }

    private static class InternalException extends Exception {
    }
}

class ExternalException extends Exception {
}