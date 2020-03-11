import java.util.Scanner;

public class Pp{

	public static void main(String args[])
	{Scanner dj=new Scanner(System.in);
	System.out.println("Which Pdf should be shared?");
	String sen=dj.next();
		fileacc s1=new Dupl(sen);
		s1.share();
		
	}
}
