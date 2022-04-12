import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JPanel Main;
    private JTextField caixaDeTexto;
    private JButton btClear;
    private JButton numButton7;
    private JButton numButton1;
    private JButton noValue2;
    private JButton numButton2;
    private JButton numButton0;
    private JButton numButton8;
    private JButton numButton3;
    private JButton noValue3;
    private JButton numButtonMais;
    private JButton numButtonEqual;
    private JButton numButtonSub;
    private JButton numButton6;
    private JButton numButton5;
    private JButton numButton4;
    private JButton numButton9;
    private JButton numButtonMulti;
    private JButton numButtonDiv;
    private JButton numButtonPercent;
    private JButton noValue1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(new Calculadora().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Calculadora() {
        btClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
