import javax.swing.*;
import java.awt.event.ActionEvent;

public class CadastrarAction extends AbstractAction{
    @Override
    public void actionPerformed(ActionEvent e) {
        TelaCadastro formCadastro = new TelaCadastro();
        formCadastro.setLocationRelativeTo(null);
        formCadastro.setContentPane(formCadastro.formCADASTRAR);
        formCadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        formCadastro.setSize(500, 350);
        formCadastro.setVisible(true);

    }
}
