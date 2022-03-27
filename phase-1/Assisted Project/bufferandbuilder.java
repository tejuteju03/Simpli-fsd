package out.github.stringbufferbuilder;

public class bufferandbuilder {
	public static void main(String[] args) {

		String str= new String("Hello World");
		//convert string to stringBuffer
		StringBuffer s1=new StringBuffer(str);

		System.out.println("size "+s1.length());

		s1.append("Welcome");
		System.out.println(s1);

		s1.insert(11, " ");
		System.out.println(s1);

		s1.replace(12, 19, "Byehhsbhdj");
		System.out.println(s1);

		s1.reverse();
		System.out.println(s1);
		String str1= new String("Hello World");
		
		//convert string to stringBuilder
		StringBuilder s2=new StringBuilder(str);

		System.out.println("size "+s2.length());

		s2.append("Welcome");
		System.out.println(s2);

		s2.insert(11, " ");
		System.out.println(s2);

		s2.replace(12, 19, "Bye");
		System.out.println(s2);

		s2.reverse();
		System.out.println(s2);
	}

}
