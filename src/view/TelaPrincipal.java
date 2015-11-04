/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

        
package adocaolp;

import java.awt.Cursor;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static sun.security.jgss.GSSUtil.login;
import view.CadastroFuncionario;
import view.CadastroTipo;

/**
 *
 * @author luan
 */
public class TelaPrincipal extends javax.swing.JFrame{
    

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        setSize(1080, 720);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginField1 = new javax.swing.JTextField();
        jButtonEntrar = new javax.swing.JButton();
        CadastroButton = new javax.swing.JButton();
        PasswordField2 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLfundo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BEM VINDO");
        setExtendedState(6);
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jLabel1.setText("Login: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1070, 550, 40, 20);

        jLabel2.setText("Senha:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1190, 550, 40, 20);

        loginField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginField1ActionPerformed(evt);
            }
        });
        getContentPane().add(loginField1);
        loginField1.setBounds(1070, 570, 110, 20);

        jButtonEntrar.setText("Entrar");
        jButtonEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEntrar);
        jButtonEntrar.setBounds(1290, 570, 70, 23);

        CadastroButton.setText("Cadastre-se");
        CadastroButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CadastroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CadastroButton);
        CadastroButton.setBounds(1070, 600, 110, 30);

        PasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordField2ActionPerformed(evt);
            }
        });
        getContentPane().add(PasswordField2);
        PasswordField2.setBounds(1190, 570, 90, 20);

        jButton2.setText("Esqueceu sua senha?");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButton2);
        jButton2.setBounds(1190, 600, 170, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/sair.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1300, 640, 60, 50);

        jLfundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Daniel\\Desktop\\Plano de Fundo.jpg")); // NOI18N
        jLfundo.setAutoscrolls(true);
        getContentPane().add(jLfundo);
        jLfundo.setBounds(0, 0, 1400, 770);
        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1416, 811));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        new TelaFuncionario().setVisible(true);
        this.dispose();
        for (Candidato u : BancoDeDados.bdCandidato)
        {
            if (u.getLogin().equals(loginField1.getText())
                    &&
                u.getSenha().equals(new String(PasswordField2.getPassword())))
            {
                this.dispose();
                new TelaFuncionario().setVisible(true);
                this.dispose();
            }
            else {
                for (Funcionario a : BancoDeDados.bdFuncionario)
                {
                    if (a.getLogin().equals(loginField1.getText())
                        &&
                        a.getSenha().equals(new String (PasswordField2.getPassword()))){
                        new TelaFuncionario().setVisible(true);
                        this.dispose();
            
            }else{
                JOptionPane.showMessageDialog(null, "Login ou senha errada.");
            
                }
            
                }
        
         
            
            }
        }
    }//GEN-LAST:event_jButtonEntrarActionPerformed

    private void PasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordField2ActionPerformed

    private void CadastroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroButtonActionPerformed
        new CadastroFuncionario().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CadastroButtonActionPerformed

    private void loginField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        Candidato u = new Candidato();
        u.setNome("Luan");
        u.setLogin("luan");
        u.setSenha("aquino");
        
        BancoDeDados.bdCandidato.add(u);
        
        Funcionario a = new Funcionario();
        a.setNome("admin");
        a.setLogin("admin");
        a.setSenha("admin");
        BancoDeDados.bdFuncionario.add(a);
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastroButton;
    private javax.swing.JPasswordField PasswordField2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLfundo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField loginField1;
    // End of variables declaration//GEN-END:variables
}
