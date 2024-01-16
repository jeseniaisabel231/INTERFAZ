import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        JFrame frame = new JFrame("Suma de dos numeros");

        //lo que va a cargar en el contenido sera dentro de form1
        frame.setContentPane(new form1().menuPrincipal);

        //CUANDO DE CLICK EN LA x SE CIERRE EL PROGRAMA
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.pack();
        //para que aparesca el recuadro
        frame.setVisible(true);
    }
}