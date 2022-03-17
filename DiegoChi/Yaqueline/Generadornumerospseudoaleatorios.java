package Yaqueline;
import java.util.Scanner;

public class Generadornumerospseudoaleatorios {
    public static void main(String[] args) {
		valores(5,7,4096,4,100);
	}
	public static void valores(int a,int c, int m, int x0, int n) {
		int Xn= x0;
		int variable;
		for(int i=0;i<n;i++) {
			int x2= (a*Xn +c )%m;
			float unif =(float)x2/m;

			if(unif >= 0.0 && unif < 0.0067){
				variable = 0;
			}else if(unif >= 0.0067 && unif < 0.0404){
				variable = 1;
			}else if(unif >= 0.0404 && unif < 0.1246){
				variable = 2;
			}else if(unif >= 0.1246 && unif < 0.265){
				variable = 3;
			}else if(unif >= 0.265 && unif < 0.4405){
				variable = 4;
			}else if(unif >= 0.4405 && unif < 0.616){
				variable = 5;
			}else if(unif >= 0.616 && unif < 0.7622){
				variable = 6;
			}else if(unif >= 0.7622 && unif < 0.8666){
				variable = 7;
			}else if(unif >= 0.8666 && unif < 0.9319){
				variable = 8;
			}else if(unif >= 0.9319 && unif < 0.9682){
				variable = 9;
			}else if(unif >= 0.9682 && unif < 0.9863){
				variable = 10;
			}else if(unif >= 0.9863 && unif < 0.9945){
				variable = 11;
			}else if(unif >= 0.9945 && unif < 0.9979){
				variable = 12;
			}else if(unif >= 0.9979 && unif < 0.9992){
				variable = 13;
			}else if(unif >= 0.9992 && unif < 0.9997){
				variable = 14;
			}else if(unif >= 0.9997 && unif < 0.9999){
				variable = 1;
			}

			System.out.printf("n:%d           xn:%5d          xn+1:%5d          Numero uniforme:%.5f          Variable Generada:%2d\n",
            i , Xn, x2, unif, variable);
			Xn=x2;
			if(Xn==x0)
				break;
		}
	}
}
