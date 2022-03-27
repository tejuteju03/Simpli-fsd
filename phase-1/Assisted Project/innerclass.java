package out.github.innerclass;

public class innerclass {
 private String msg="Welcome to all"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+",  Inner Classes");}  
	 }  


	public static void main(String[] args) {

		innerclass obj=new innerclass();
		innerclass.Inner in=obj.new Inner();  
		in.hello();  
	}


}
