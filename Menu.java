/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_final;

import javax.swing.*;
/**
 *
 * @author dijou
 */
public class Menu extends JFrame {
    private JButton jButton1 = new JButton();
    private JLabel jLabel1 = new JLabel();
    private JMenu jMenu1 = new JMenu();
    private JMenu jMenu2 = new JMenu();
    private JMenuBar jMenuBar1 = new JMenuBar();
    private JMenuItem jMenuItem1 = new JMenuItem();
    private JMenuItem jMenuItem2 = new JMenuItem();
    private JMenuItem jMenuItem3 = new JMenuItem();
    
    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 692));
        setPreferredSize(new java.awt.Dimension(1000, 692));
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Quitter");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(759, 555, 130, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projet_final/ThinIce.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 660);

        jMenu1.setText("Jouer");

        jMenuItem1.setText("Nouvelle Partie");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Reprendre une Partie");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Score");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Règles");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        this.dispose();
    }                                                                           

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {                                    
        Regles mesRegles = new Regles();
        mesRegles.setVisible(true);
    }                                   

}
