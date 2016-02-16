import java.util.HashSet;
import java.util.Set;

public class MainClassASimple {

	public static void main(String[] args) {
		Set<String> strings = new HashSet<String>();
		
		strings.add("hi");
		strings.add("how");
		strings.add("now");
		strings.add("now");
		
		
		for(String currentString: strings){
			System.out.println("outputting the set: "+ currentString);
			
		}

	}

}
