import java.lang.Math;

public class GradleActivity{
	public static void main(String[] args){
		if (args.length == 0 || args.length > 1){
			System.out.println("Enter 1 valid integer");
			System.exit(1);
		}
		int n = 0;
		try{
			n = Integer.parseInt(args[0]);
		} catch (Exception e){
			System.out.println("Enter an integer");
			System.exit(1);
		} 
		if(n < 0){
			System.out.println("Enter a positive integer");
			System.exit(1);
		}
		System.out.println("Tri(n) = " + Tri(n) + "\nLazy(n) = " + Lazy(n));
	}
	
	public static int Tri(int num){
		return ((num * (num + 1)) / 2);
	}
	
	public static int Lazy(int kC){
		return ((int)(Math.pow(kC, 2) + kC + 2) / 2);
	}
}