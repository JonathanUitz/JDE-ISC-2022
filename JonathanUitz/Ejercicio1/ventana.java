

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventana extends Frame implements ActionListener{

    Button aceptar;
    Button calcular;
    TextField text;
    TextArea txt;
    Panel central;

    int num;

    public ventana(){

        aceptar = new Button ("Aceptar");
        aceptar.addActionListener(this);
        calcular = new Button ("Calcular");
        calcular.addActionListener(this);
        text = new TextField();
        txt = new TextArea("Aqui se mostraran los datos: \n\n");
        central = new Panel();
        central.setLayout(new BorderLayout());
        central.add(aceptar, BorderLayout.WEST);
        central.add(calcular, BorderLayout.EAST);
        central.add(text, BorderLayout.NORTH);
        central.add(txt, BorderLayout.SOUTH);
        this.setLayout(new BorderLayout());
        this.add(central, BorderLayout.NORTH);
        setSize(400,200);
        setVisible(true);
        setTitle("CALCULA UNA SUMA");
        aceptar.setBackground(Color.MAGENTA);
        calcular.setBackground(Color.MAGENTA);

    }

    public static void main(String[] args) {

        ventana v = new ventana();
        

    }

    public void actionPerformed(ActionEvent e){

        if (e.getSource()==aceptar) {
            String c = text.getText();
            text.setText("");
            num = Integer.parseInt(c);
            suma(num);
            txt.append(c+'\n');
            System.out.println(c);
        } else {
            String c = "El resultado de la suma es: " + resultado;
            txt.append(c+'\n');
            System.out.println(c);
            resultado = 0;
        }

    }

    int resultado = 0;

    public int suma(int valor){
        resultado = resultado + valor;
        return resultado;

    }

}