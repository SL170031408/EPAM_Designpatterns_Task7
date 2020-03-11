import java.util.Scanner;

public class FDPat {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("What model you want to verify");
		
		
		
		String sr=sc.next();
		
		Cost e=new Cost();
		Special w=e.getPhone(sr);
		
		w.camera();
		w.stc();
		
		w.cost();
	}

}
