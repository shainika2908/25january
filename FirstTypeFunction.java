
public class FirstTypeFunction {
	static void pattern(char ch,int num) {
		for(int i=1;i<=num;i++) {
			System.out.println(ch);
		}
		System.out.println("***************");
		System.out.println("---------------");
	}

	public static void main(String[] args) {
		pattern('%',10);
		System.out.println("hello");
		pattern('-',4);
		System.out.println("welcome");
		pattern('^',6);
		System.out.println("hyd");
		System.out.println("Welcome");

	}

}
