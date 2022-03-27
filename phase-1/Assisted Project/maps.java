package out.github.maps;
import java.util.*;
public class maps {
	public static void main(String[] args) {
		// map
		
		//Hashmap
		HashMap<Integer,String> h1=new HashMap<Integer,String>();      
	      h1.put(1,"ran");    
	      h1.put(2,"reddy");    
	      h1.put(3,"ranga");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:h1.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	     //HashTable
	       
	      Hashtable<Integer,String> h2=new Hashtable<Integer,String>();  
	      
	      h2.put(4,"ravi");  
	      h2.put(5,"lokesh");  
	      h2.put(6,"hari");  
	      h2.put(7,"chinnu");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:h2.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> m=new TreeMap<Integer,String>();    
	      m.put(8,"ram");    
	      m.put(9,"bhim");    
	      m.put(10,"kohil");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:m.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  


}
