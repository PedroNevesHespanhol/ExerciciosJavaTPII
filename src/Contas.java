public class Contas {

    public static double contaA(double[] x) {
    
    	double result = 0;
        
        for(int i=0; i<5; i++) {
        	result += x[i];
        }
        
        return result;
     
    }
    
    public static double contaB(double[] x, double[] y) {
    	
        double result = 0;
        
        for(int i=0; i<5; i++) {
        	result += (x[i] * y[i]);
        }
        
        return result;
        
    }
    
    public static double contaC(double[] x, double[] y) {
    
    	double result = 0;
        
        for(int i=1; i<4; i++) {
        	result += (x[i] * (y[i] * y[i]));
        }
        for(int i=0; i<5; i++) {
        	result += 3;
        }
        
        return result;
    
    }
}
