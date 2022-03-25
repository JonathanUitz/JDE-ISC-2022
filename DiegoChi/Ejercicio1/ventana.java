import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ventana extends Frame implements ActionListener{

    Button aceptar;
    Button calcular;
    int num;
    TextField text;
    Panel central;
    TextArea txt;

    int resultado = 0;

    public ventana(){

        aceptar = new Button ("Aceptar");
        aceptar.addActionListener(this);
        calcular = new Button("Calcular");
        calcular.addActionListener(this);
        text = new TextField();
        txt = new TextArea();
        central = new Panel();
        central.setLayout(new BorderLayout());
        central.add(aceptar, BorderLayout.CENTER);
        central.add(calcular, BorderLayout.EAST);
        central.add(text, BorderLayout.NORTH);
        central.add(txt,BorderLayout.SOUTH);
        this.setLayout(new BorderLayout());
        this.add(central, BorderLayout.CENTER);
        setSize(500,500);
        setVisible(true);
        calcular.setBackground(Color.pink);
        aceptar.setBackground(Color.pink);
        
        
    }

    public int suma(int valor){
        resultado = resultado + valor;
        return resultado;
    }


    public static void main(String[] args) {

        ventana v = new ventana();

    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource()==aceptar){
            String c = text.getText();
            num = Integer.parseInt(c);
            suma(num);
            txt.append(c + '\n' );
            System.out.println(c);
        }else{
            String c = "= "+ resultado;
            txt.append(c+'\n');
            System.out.println(c);
            resultado = 0;
        }
    }

}

    