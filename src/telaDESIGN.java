import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class telaDESIGN extends JFrame{
    public JPanel telaLOGIN;
    private JComboBox BOXuser;
    private JTextField TEXTsenha;
    private JButton ENTRARButton;


    public telaDESIGN() {
    String senhaALAN = "alan2023";
    String senhaPAULO = "090301";
    String senhaPATRICK = "69";
    String senhaBRAMBILA = "654321";
    String senhaGABRIEL = "84";
    String senhaJUNIOR = "2114";


    ENTRARButton.setMnemonic(KeyEvent.VK_ENTER);
    ENTRARButton.addActionListener(new ActionListener() {
        boolean validarSENHA = false;



        @Override
        public void actionPerformed(ActionEvent e) {
        //PEGAR USUARIO E SENHA

            Integer user = Integer.valueOf(BOXuser.getSelectedIndex());
            String senha = TEXTsenha.getText();

        //VALIDAR SENHAS

            if (user == 0 && senha.equals(senhaALAN)){
                validarSENHA = true;
                JOptionPane.showMessageDialog(null, "Logado com sucesso!");
            } else if (user == 1 && senha.equals(senhaPATRICK)) {
                validarSENHA = true;
                JOptionPane.showMessageDialog(null, "Logado com sucesso!");
            } else if (user == 2 && senha.equals(senhaPAULO)) {
                validarSENHA = true;
                JOptionPane.showMessageDialog(null, "Logado com sucesso!");
            } else if (user == 3 && senha.equals(senhaGABRIEL)) {
                validarSENHA = true;
                JOptionPane.showMessageDialog(null, "Logado com sucesso!");
            } else if (user == 4 && senha.equals(senhaJUNIOR)) {
                validarSENHA = true;
                JOptionPane.showMessageDialog(null, "Logado com sucesso!");
            } else if (user == 5 && senha.equals(senhaBRAMBILA)) {
                validarSENHA = true;
                JOptionPane.showMessageDialog(null, "Logado com sucesso!");
            }else{
                JOptionPane.showMessageDialog(null, "Senha esta incorreta!");
            }

            //INICIAR TELA PRINCIPAL
            if(validarSENHA == true){
                dispose();
                ImageIcon fundo = new ImageIcon("");

                TelaPRINCIPAL formPrincipal = new TelaPRINCIPAL();
                formPrincipal.setContentPane(formPrincipal.formINICIAL);
                //formPrincipal.setLocationRelativeTo(null);
                formPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                formPrincipal.setSize(612, 612);

                formPrincipal.setBackground(Color.blue);

                JMenuBar menu = new JMenuBar();
                formPrincipal.setJMenuBar(menu);

                JMenu cadastros = new JMenu("Cadastros");
                menu.add(cadastros);

                JMenuItem cadastrar = new JMenuItem(new CadastrarAction());
                cadastrar.setText("Cadastrar");
                cadastros.add(cadastrar);

                JMenuItem editar = new JMenuItem(new EditarAction());
                editar.setText("Editar");
                cadastros.add(editar);

                JMenuItem sair = new JMenuItem(new SairAction());
                sair.setText("Sair");
                cadastros.add(sair);

                formPrincipal.setVisible(true);
            }
        }


    });
}
}
