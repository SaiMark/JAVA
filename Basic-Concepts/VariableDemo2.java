public class VariableDemo2 {
	public static void main(String[] args) {
		//1. Basic implementation
		//Define variable  and print out
		int a = 10;
		System.out.println(a);//10
		System.out.println(a);//10
		System.out.println(a);//10


		//2.Variable calculation
		int b = 30;
		int c = 20;
		System.out.println(b+c);

		//3.Replace variable record
		a = 50;
		System.out.println(a);
		System.out.println("----------------------------");

		//Can initialize multi variable in one-line
		int d = 100, e = 200, f = 300;
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}
}