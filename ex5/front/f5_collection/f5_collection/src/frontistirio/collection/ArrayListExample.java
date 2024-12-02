package frontistirio.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
	List list = new ArrayList();
	list.add(1);
	list.add("ένα");
	
	Integer integer = (Integer) list.get(0);
	String string   = (String) list.get(1);

	//σφάλμα χρόνου μεταγλώττισης
	String string2  = list.get(1);
    }

}
