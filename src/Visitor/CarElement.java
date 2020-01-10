package Visitor;
import java.util.List;

public interface CarElement {
	void accept(CarElementVisitor visitor);
}
