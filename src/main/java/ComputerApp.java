
public class ComputerApp {

	public static void main(String[] args) {
		
		Computer underTest = new Computer("make","model",0);
		Computer underTest2 = new Computer("make","model",0);
		
		int x = 5;
		int y = 5;
		
		System.out.println(x==y); //check values
		
		String a = new String("a");
		String b = new String ("a");
		System.out.println(a.equals(b)); //check string values
		a = b;
		System.out.println(a==b);  //check for aliasing (same ref loc.)
		
	}

}
