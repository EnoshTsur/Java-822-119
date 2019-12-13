package inetr;

public interface OtherInterface extends SomeInterface{
	
	void humor();
	
	@Override
	default String sayHiTo(String name) {
		return GREET + " " + name;
	}
}
