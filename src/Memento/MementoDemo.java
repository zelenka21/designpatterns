package Memento;

public class MementoDemo {

	public static void main(String[] args) {
		
		
		Caretaker caretaker = new Caretaker();
		Originator originator = new Originator();
		originator.setState("State One");

		originator.setState("State Two");
		
		caretaker.addMemento(originator.save());
		

		originator.setState("State Three");
		

		caretaker.addMemento(originator.save());
		

		originator.setState("State Four");


        originator.restore( caretaker.getMemento() );
	}

}
