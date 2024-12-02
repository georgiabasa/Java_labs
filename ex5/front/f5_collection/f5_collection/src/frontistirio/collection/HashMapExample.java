package frontistirio.collection;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

	HashMap<String, Integer> hashMap = new HashMap<>();

	System.out.println();
	System.out.println("---------1----------- put(String, Integer):");
	hashMap.put("Python", 5);
	hashMap.put("C", 5);
	hashMap.put("Java", 10);

	System.out.println();
	System.out.println("---------2----------- toString():");
	System.out.println(hashMap);
	System.out.println(hashMap.toString());

	System.out.println();
	System.out.println("---------3----------- put(String, Integer):");
	hashMap.put("C", 10);
	System.out.println(hashMap);

	System.out.println();
	System.out.println("---------4----------- remove(String, Integer):");
	hashMap.put("C--", 1);
	System.out.println(hashMap);
	hashMap.remove("C--");
	System.out.println(hashMap);

	System.out.println();
	System.out.println("---------5----------- size():");
	System.out.println("Το μέγεθος είναι: " + hashMap.size());

	System.out.println();
	System.out.println("---------6----------- containsKey():");
	if (hashMap.containsKey("C")) {
	    Integer grade = hashMap.get("C");
	    System.out.println("Η τιμή για το κλειδί" + " \"C\" είναι: " + grade);
	}

	System.out.println();
	System.out.println("---------7----------- getOrDefault(]):");
	System.out.println("Θέλω τη C#: " + hashMap.getOrDefault("C#", 0));

    }

}
