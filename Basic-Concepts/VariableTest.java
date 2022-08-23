public class VariableTest {
	//main entrance
	public static void main(String[] args) {
		//No passengers at first
		int count = 0;
		//First stop: one passenger went up
		count = count + 1;
		//Second stop: two passengers went up and one passenger came down
		count = count + 2 - 1;
		//The third stop: two passengers went up and one passenger came down
		count = count + 2 - 1 ;
		//Fourth stop: one passenger came down
		count = count - 1;
		//Fifth stop: go up one passenger
		count = count + 1;
		//How many passengers were on the bus when it arrived at the terminal?
		System.out.println(count);
	}
}