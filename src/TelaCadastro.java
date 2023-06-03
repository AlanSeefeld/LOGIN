import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class TelaCadastro extends JFrame {
    public JTextField textNOME;
    private JTextField textIDADE;
    public JPanel formCADASTRAR;
    private JTextField textCPF;
    private JTextField textRG;
    private JButton CADASTRARButton;
    private JButton SAIRButton;
public TelaCadastro() {
    SAIRButton.setMnemonic(KeyEvent.VK_BACK_SPACE);
    SAIRButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
        }
    });
    CADASTRARButton.setMnemonic(KeyEvent.VK_ENTER);
    CADASTRARButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nome = textNOME.getText();
            String idade = textIDADE.getText();
            String cpf = textCPF.getText();
            String rg = textRG.getText();
            JOptionPane.showMessageDialog(null, "Usuario cadastrado!\nNome = " + nome + "\nIdade = " + idade + "\nCpf = " + cpf + "\nRg = "+rg);

        }
    });
}
}
