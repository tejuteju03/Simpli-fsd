package out.github.polymarphism;

public class sum {

    public int s(int x, int y) 
    { 
        return (x + y); 
    } 
    public int s(int x, int y, int z) 
    { 
        return (x + y + z); 
    } 
    public double s(double x, double y) 
    { 
        return (x + y); 
    } 
    public static void main(String args[]) 
    { 
        sum s = new sum(); 
        System.out.println(s.s(10, 20)); 
        System.out.println(s.s(10, 20, 30)); 
        System.out.println(s.s(10.5, 20.5)); 
    } 

}
