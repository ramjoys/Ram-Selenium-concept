interface Age {
	
	
	int x=21;
	void getAge();
	

}

public class AnonymousDemo
{
	public static void main(String[] args) { 
	
	Age ag=new Age()
			{
		       @Override     
		      public void getAge()
		      {
		     System.out.println("The Age is:"+x);
			}
			
			};
	
	ag.getAge();
}
}