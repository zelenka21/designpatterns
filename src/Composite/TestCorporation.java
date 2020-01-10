package Composite;
import java.util.*;
public class TestCorporation {

	Corporation corporation;
	
	public static void main(String args[]) {
		TestCorporation t = new TestCorporation();
	}
	public TestCorporation() { 
		
		corporation = new Corporation();
		Division rnd = new Division("R&D");
		rnd.add(new VP("Steve", "R&D"));

		rnd.add(new VP("Mike", "R&D"));

		rnd.add(new VP("Nancy", "R&D"));
		
		Division sales = new Division("Sales");
		
		sales.add(new VP("Ted", "Sales"));
		sales.add(new VP("Bob", "Sales"));
		sales.add(new VP("Carl", "Sales"));
		sales.add(new VP("Alice", "Sales"));
		
		//more divisions
		
		VP vp = new VP ("Carry", "At large");
		corporation.add(rnd);
		corporation.add(sales);
		corporation.add(vp);
		
		
		corporation.print();
	}
}
