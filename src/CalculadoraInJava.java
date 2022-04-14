import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraInJava {
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

    double num1;
    double num2;
    double resultado;
    double button;
    String operacao;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(new CalculadoraInJava().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public CalculadoraInJava() {
        numButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                caixaDeTexto.setText("1");
                button = 1;
            }
        });
        numButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                caixaDeTexto.setText("2");
                button = 2;
            }
        });
        numButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                caixaDeTexto.setText("3");
                button = 3;
            }
        });
        numButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                caixaDeTexto.setText("4");
                button = 4;
            }
        });
        numButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                caixaDeTexto.setText("5");
                button = 5;
            }
        });
        numButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                caixaDeTexto.setText("6");
                button = 6;
            }
        });
        numButton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                caixaDeTexto.setText("7");
                button = 7;
            }
        });
        numButton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                caixaDeTexto.setText("8");
                button = 8;
            }
        });
        numButton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                caixaDeTexto.setText("9");
                button = 9;
            }
        });
        numButton0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                caixaDeTexto.setText("0");
                button = 0;
            }
        });
        numButtonMais.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacao = "soma";
                num1 = button;
            }
        });
        numButtonSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacao = "Sub";
                num1 = button;
            }
        });
        numButtonMulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacao = "multi";
                num1 = button;
            }
        });
        numButtonDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacao = "divs";
                num1 = button;
            }
        });
        numButtonEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (operacao){
                    case "soma":
                        resultado = num1 + button;
                        caixaDeTexto.setText(String.valueOf(resultado));
                        break;
                    case "subtracao":
                        resultado = num1 - button;
                        caixaDeTexto.setText(String.valueOf(resultado));
                        break;
                    case "multi":
                        resultado = num1 * button;
                        caixaDeTexto.setText(String.valueOf(resultado));
                        break;
                    case "divs":
                        resultado = num1 / button;
                        caixaDeTexto.setText(String.valueOf(resultado));
                        break;
                }
            }
        });
        btClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = 0;
                button = 0;

                caixaDeTexto.setText(null);

            }
        });
    }
}
