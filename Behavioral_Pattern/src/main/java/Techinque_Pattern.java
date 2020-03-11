import java.util.Scanner;

public class Techinque_Pattern {
public static void main(String args[])
{
	
	
	
	
	
	Scanner dj=new Scanner(System.in);
System.out.println("give  values for d and j");
int a1=dj.nextInt();
int b1=dj.nextInt();





	Accessfactor a = new Accessfactor(new Addition());		
    a.accessing(a1,b1);
    Accessfactor a3 = new Accessfactor(new Mod());		
    a3.accessing(a1,b1);
    Accessfactor a4 = new Accessfactor(new pow());		
    a4.accessing(a1,b1);
    
	
}
}
