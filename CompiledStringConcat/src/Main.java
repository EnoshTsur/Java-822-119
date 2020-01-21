public class Main {

	public static void main(String[] args) {
		f();				
	}

	private static void f() throws Exception {
		int x = 1;
		int y = 2;
		throw (x>y?new RuntimeException() : new MyException());
	}
	
}
