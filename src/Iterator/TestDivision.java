package Iterator;

public class TestDivision {
	
	Division division;
	DivisionIterator iterator;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDivision d = new TestDivision();
	}
	
	public TestDivision() { 
		
		division = new Division("sales");
		division.add("Ted"); 
		division.add("Bobo"); 
		division.add("Carol"); 
		division.add("Alice"); 
		
		
		iterator = division.iterator();
		
		while (iterator.hasNext()) {
			VP vp = (VP) iterator.next();
			vp.print();
		}
	
	}

}
