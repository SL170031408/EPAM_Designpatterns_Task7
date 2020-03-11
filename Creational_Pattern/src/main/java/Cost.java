
public class Cost {
public Special getPhone(String s)
{
	if (s.equals("SamsungA60"))
{
	return new SamsungA60();
}
	else if(s.equals("SamsungA70"))
			{
		return new SamsungA70();
				
			}
	else if(s.equals("SamsungA50"))
	{
		return new SamsungA50();
		
	}
	else
	{
		return(null);
	}
	
	
	
	
}
}
