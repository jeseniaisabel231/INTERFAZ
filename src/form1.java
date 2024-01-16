import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    private JButton OKButton;
    private JLabel numero1Lbl;
    private JTextField numero1textField1;
    private JTextField numero2textField2;
    private JLabel numer2Lbl;
    public JPanel menuPrincipal;
    private JLabel numero3JLbl;

    //opcion create listener

    public form1() {
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hola a todos");
                String n1;
                n1=numero1textField1.getText();
                String n2;
                n2=numero2textField2.getText();
                //operacion de suma
                int numero1, numero2, resultado;
                numero1=Integer.parseInt(n1);
                numero2=Integer.parseInt(n2);
                resultado=numero1+numero2;
                System.out.println(n1);
                System.out.println(n2);
                System.out.println(resultado);

                //settear los resultados de int a string
                String r3;
                r3=Integer.toString(resultado);
                numero3JLbl.setText("Resultado: "+r3);
            }
        });
    }
}
