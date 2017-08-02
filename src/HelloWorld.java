import java.util.Scanner;

public class HelloWorld {
	
	static Scanner s = null;

	public static void main(String[] args) {
		
		System.out.println("What is your name?");
		
		s=new Scanner(System.in);
		
		String str;
		
		str=s.nextLine();
		
		System.out.println("What is your age?");
		
		str=s.nextLine();
		
		int age;
		
		age = Integer.parseInt(str);
		
		age = age + 50;
		
		System.out.println("You look " + age);
		
	}

}
