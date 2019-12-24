package ramselenium;

public class EqualsConcept {

	public static void main(String[] args) {
		String s1=new String("abc");
		String s2=new String("abc");
		
		
		if(s1==s2) {
		     System.out.println("s1==s2 is TRUE");
		} else{
		     System.out.println("s1==s2 is FALSE");
		}

		if (s1.equals(s2))
		{
			System.out.println("s1 equals s2 is TRUE");
		} else{
		     System.out.println("s1 equals s2 is FALSE");
		
		}
		
		
	}

}
