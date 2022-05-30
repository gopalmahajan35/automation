package sinleton;

public class singletonclass {


	public static singletonclass single_instance=null;
	public String s;
	
	private Singletonclass() {
		s="i am a singleton class";
	}
	public static Singletnclass get_instance() {
		if (single_instance==null)
		{
			single_instance=new singletonclass();
			
		}
		return single_instance;
	}

}
