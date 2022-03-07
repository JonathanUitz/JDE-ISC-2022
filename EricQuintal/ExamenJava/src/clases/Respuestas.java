
package EricQuintal.ExamenJava.src.clases;

import java.util.StringTokenizer;

public class Respuestas {

    String[] respuestas = {
      "1","2","3","4","5"
    };
    
    String[] radioR = {
        "1,2,3,4",
        "2,3,4,5",
        "3,4,5,6",
        "4,5,6,7",
        "5,6,7,8",
    };
    
    public String getRespuesta(int posicion){
        return respuestas[posicion];
    }
    
    public String[] separar(String cadena, String separador){
        StringTokenizer token = new StringTokenizer(cadena,separador);
        
        String[] a = new String[4];
        int i = 0;
        
        while(token.hasMoreTokens()){
            a[i] = token.nextToken(); // obtenido el token
            i++;
        }
        
        return a;
    }
    
    public String[] setRespuestas(int posicion){
        String s1 = radioR[posicion];
        String[] s2 = separar(s1,",");
        return s2;
    }
    
}
