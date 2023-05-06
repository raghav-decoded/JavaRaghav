/* Experiment 2
   AIM: Write a program to implement Hashmaps in JAVA
   
   Raghav Singh
   00615611921
   S13 (AI & DS)
*/

// Importing HashMap class
import java.util.HashMap;

// Main class
public class hashmap {

	// Main driver method
	public static void main(String[] args)
	{
		// Create an empty hash map by declaring object
		// of string and integer type
		HashMap<String, Integer> map = new HashMap<>();

		// Adding elements to the Map
		// using standard put() method
		map.put("Raghav", 69);
		map.put("Rhea", 96);
		map.put("Mihika", 20);

		// Print size and content of the Map
		System.out.println("Size of map is:- "+ map.size());

		// Printing elements in object of Map
		System.out.println(map);

		// Checking if a key is present and if
		// present, print value by passing
		// random element
		if (map.containsKey("Raghav")) {

			// Mapping
			Integer a = map.get("Raghav");

			// Printing value for the corresponding key
			System.out.println("value for key"+ " \"Raghav\" is:- " + a);
		}
	}
}
