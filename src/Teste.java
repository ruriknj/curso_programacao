import java.util.*;

public class Teste {

    public static void main(String[] args) {
     
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Entre com 3 numeros inteiros:");
    	
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int c = sc.nextInt();
    	
    	int higher = max(a,b,c);
    	
    showMax(higher);
    	
    	sc.close();
    }
    
    public static int max(int x,int y,int z) {
    	
    	int aux;
    	
    		if (x > y && y > z) {
    		
    		aux = x; }
    		
    		else if ( y > z) {
    			
    			aux = y;
    			
    		} else
    			
    			aux = z;
    		
    		return aux;
    		
    		
    		}
    		
    		public static void showMax(int value) { 
    			System.out.println("Higher = " + value);
    }
    
}
