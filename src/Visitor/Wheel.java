package Visitor;

public class Wheel implements CarElement{
	 private final String name;

	  public Wheel(final String name) {
	      this.name = name;
	  }

	  public String getName() {
	      return name;
	  }

	@Override
	public void accept(CarElementVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
}
