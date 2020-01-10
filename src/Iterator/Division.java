package Iterator;

public class Division {

	private String name;
	private int number = 0;
	
	private VP[] VPs = new VP[100];
	
	public Division(String n) { name = n; }
	public String getName() { return name; } 
	
	public void add(String n) { 
		VP vp = new VP(n, name); VPs[number++] = vp; 
		} 
	
	public DivisionIterator iterator() {
		return new DivisionIterator(VPs);
		
	}
}
