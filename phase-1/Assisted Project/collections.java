package out.github.ollections;
import java.util.*;
public class collections {
	public static void main(String[] args) {
		// arraylist
		System.out.println("ArrayList");
		ArrayList<String> name=new ArrayList<String>();   
	      name.add("rangareddy");//
	      name.add("reddys");    	   
	      System.out.println(name);  
		
		// vector
	      System.out.println("\n");
	      System.out.println("Vector method");
	      Vector<Integer> v = new Vector();
	      v.addElement(100); 
	      v.addElement(300); 
	      System.out.println(v);
		
		// linkedlist
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> animals=new LinkedList<String>();  
	      animals.add("dog");  
	      animals.add("cat");  	      
	      Iterator<String> itr=animals.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	       //creating hashset
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> s=new HashSet<Integer>();  
	       s.add(10);  
	       s.add(11);  
	       s.add(13);
	       s.add(14);
	       System.out.println(s);
	       
	       // linkedhashset
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> s2=new LinkedHashSet<Integer>();  
	       s2.add(11);  
	       s2.add(13);  
	       s2.add(12);
	       s2.add(14);	       
	       System.out.println(s2);
	      	} 
	      }  


}
