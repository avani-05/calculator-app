import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc {
    private JPanel Calc;
    private JTextField txtDisplay;
    private JButton button1;
    private JButton button2;
    private JButton cosButton;
    private JButton tanButton;
    private JButton sinButton;
    private JButton xButton;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a0Button1;
    private JButton antilogButton;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a0Button;
    private JButton logButton;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton Button;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton ACButton;

    double a, b , result ;
    String op;
    String answer;

    public Calc() {
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(" ") ;
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+ a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+ a8Button.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+ a9Button.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+ a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+ a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+ a6Button.getText());
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+ a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+ a2Button.getText());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+ a3Button.getText());
            }
        });
        a0Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+ a0Button1.getText());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    txtDisplay.setText(txtDisplay.getText() + a0Button.getText());
                }
        });
        Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+  Button.getText());
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a= Double.parseDouble(txtDisplay.getText()) ;
                op="+";
                txtDisplay.setText("");
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a= Double.parseDouble(txtDisplay.getText()) ;
                op="-";
                txtDisplay.setText("");
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a= Double.parseDouble(txtDisplay.getText()) ;
                op="*";
                txtDisplay.setText("");
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a= Double.parseDouble(txtDisplay.getText()) ;
                op="/";
                txtDisplay.setText("");
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = Double.parseDouble(txtDisplay.getText());

                if (op == "+") {
                    result = a + b;
                    answer=String.format("%.1f+%.1f=%.2f" , a , b , result );
                    txtDisplay.setText(answer);
                } else if (op == "-") {
                    result = a - b;
                    answer=String.format("%.1f-%.1f=%.2f" , a , b , result );
                    txtDisplay.setText(answer);
                } else if (op == "*") {
                    result = a * b;
                    answer=String.format("%.1f*%.1f=%.2f" , a , b , result );
                    txtDisplay.setText(answer);
                } else if (op == "/") {
                    result = a / b;
                    answer=String.format("%.1f/%.1f=%.2f" , a , b , result );
                    txtDisplay.setText(answer);
                }
            }
        });
        sinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double s = Math.sin(Double.parseDouble(txtDisplay.getText()));
                txtDisplay.setText("sin of given value is :");
                txtDisplay.setText(txtDisplay.getText()+s);
            }
        });
        cosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double c = Math.cos(Double.parseDouble(txtDisplay.getText()));
                txtDisplay.setText("cos of given value is :");
                txtDisplay.setText(txtDisplay.getText()+c);
            }
        });
        tanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double t = Math.tan(Double.parseDouble(txtDisplay.getText())) ;
                txtDisplay.setText("tan of given value is :");
                txtDisplay.setText(txtDisplay.getText()+t);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x =Math.sqrt(Double.parseDouble(txtDisplay.getText())) ;
                txtDisplay.setText("Square root of given value is :");
                txtDisplay.setText(txtDisplay.getText()+x);


            }
        });
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x =Math.cbrt(Double.parseDouble(txtDisplay.getText())) ;
                txtDisplay.setText("Cube root of given value is :");
                txtDisplay.setText(txtDisplay.getText()+x);
            }
        });
        logButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x =Math.log(Double.parseDouble(txtDisplay.getText())) ;
                txtDisplay.setText("Log of given value is :");
                txtDisplay.setText(txtDisplay.getText()+x);
            }
        });
        antilogButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x=Math.exp((Double.parseDouble(txtDisplay.getText()))) ;
                txtDisplay.setText("Antilog of given value is :");
                txtDisplay.setText(txtDisplay.getText()+x);
            }
        });
    }
    public static void main(String[] args) {
        javax.swing.JFrame frame = new javax.swing.JFrame("Calc");
        frame.setContentPane(new Calc().Calc);
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
