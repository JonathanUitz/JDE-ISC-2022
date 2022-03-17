package Yaqueline;
import java.util.Scanner;

public class Generadornumerospseudoaleatorios {
    public static void main(String[] args) {
		valores(5,7,4096,4,100);
	}
	public static void valores(int a,int c, int m, int x0, int n) {
		int Xn= x0;
		for(int i=0;i<n;i++) {
			int x2= (a*Xn +c )%m;
			float unif =(float)x2/m;
			System.out.printf("n:%d           xn:%5d          xn+1:%5d          Numero uniforme:%.5f\n",
            i , Xn, x2, unif);
			Xn=x2;
			if(Xn==x0)
				break;
		}
	}
}
