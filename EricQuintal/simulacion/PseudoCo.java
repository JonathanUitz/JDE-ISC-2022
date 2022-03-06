package EricQuintal.simulacion;

import java.util.Scanner; 

public class PseudoCo { 


    public static void main(String[] args) { 
        
        Scanner s = new Scanner(System.in); 
        int a,c, Xn,m, num; 
        float num2; 
        System.out.println("Ingrese Xn");
        Xn = s.nextInt(); 
        System.out.println("Ingrese a"); 
        a = s.nextInt(); 
        System.out.println("Ingrese c"); 
        c = s.nextInt(); 
        System.out.println("ingrese m"); 
        m = s.nextInt(); 
        System.out.println("n Xn Xn+1 Numero generado"); 
        for(int i=0; i<=4096; i++){ 
            num = (a*Xn+c)%m; 
            num2 = (float) num/(float) (m); 
            System.out.printf(" %d      %d      %d      %.5f\n", i,Xn,num,num2); 
            Xn = num; 
        } 
    } 

} 

 