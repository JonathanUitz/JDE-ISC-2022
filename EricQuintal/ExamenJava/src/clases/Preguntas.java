
package EricQuintal.ExamenJava.src.clases;


public class Preguntas {
    
    String[] preguntas = {
        "¿Pregunta 1?", "¿Pregunta 2?", "¿Pregunta 3?",
        "¿Pregunta 4?", "¿Pregunta 5?"
    };
    
   public String getPregunta(int posicion){
        return preguntas[posicion];
    }
    
}
