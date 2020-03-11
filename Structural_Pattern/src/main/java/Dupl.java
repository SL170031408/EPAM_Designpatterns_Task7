
public class Dupl implements fileacc {
	private String doc;
	 private Ori o;
	  
	Dupl(String doc)
	{
		this.doc=doc;
		
	}
	public void share()
	{
		
		
		if(o==null)
		{
			o =new Ori(doc);
		}
		o.share();
	}

}
