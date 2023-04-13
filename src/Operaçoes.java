import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class Operaçoes extends JFrame 
implements ActionListener
{

JLabel lV1;
JLabel lV2;
JLabel lSoma;
JTextField tfV1, tfV2, tfResult;
JButton  bOutput;

  div rDiv = new div(); 

  public Operaçoes () {
    setLayout(new FlowLayout());
    setSize(400,400);
    setVisible(true);

    lV1 = new JLabel("valor 1");
    add(lV1);

    tfV1 = new JTextField(5);
    tfV1.addActionListener(this);
    add(tfV1);

    lV2 = new JLabel("valor 2");
    add(lV2);

    tfV2 = new JTextField(5);
    tfV2.addActionListener(this);
    add(tfV2);

    lSoma = new JLabel("resultado");
    add(lSoma);

    tfResult = new JTextField(5);
    add(tfResult);

    bOutput = new JButton("Saida");
    bOutput.addActionListener(this);
    add(bOutput);

  }

public static void main(String[] args) 
  {
    Operaçoes app = new Operaçoes();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
  }

@Override
public void actionPerformed(ActionEvent e)
 {  if(e.getSource() == bOutput)
    {
        int a = Integer.parseInt(tfV1.getText());
        int b = Integer.parseInt(tfV2.getText());
        float r = rDiv.divisao(a, b);
        tfResult.setText(String.valueOf(r));
    }

    if(e.getSource() == tfV1){
        tfV2.requestFocus();
    }


 }

}