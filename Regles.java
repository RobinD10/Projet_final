/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_final;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author dijou
 */
public class Regles extends JFrame{
    
    private JButton jButton1 = new JButton();
    private JLabel jLabel = new JLabel();
    private JTextArea jTextArea = new JTextArea();
    private JScrollPane jScrollPane1 = new JScrollPane();
    
    public Regles(){
        
        CardLayout cardL = new CardLayout();
        JPanel content = new JPanel();
         
        setSize(681, 467);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setBackground(Color.RED);
        setUndecorated(true);
                   
        JPanel pan1 = new JPanel();
        pan1.setBackground(Color.GRAY); 
        content.add(pan1);
        content.setLayout(cardL);
        
        jButton1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Fermer");
        jButton1.setBorder(null);
        jButton1.setBackground(Color.LIGHT_GRAY);
        //jButton1.setBorderPainted(false);
        //jButton1.setContentAreaFilled(false);
        //jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel.setForeground(Color.red);
        jLabel.setText("Règle du jeu :");

        
        jTextArea.setColumns(20);
        jTextArea.setRows(5);
        jTextArea.setText("Le but du jeu est de déplacer le personnage jusqu'à la porte de sortie \ntout en recouvrant chacun des blocs de glace. \n\nPour déplacer le personnage, il suffit d'utilser les lettres : \n\t- Q pour aller à gauche\n\t- S pour descendre\n\t- D pour aller à droite\n\t- Z pour monter");
        jTextArea.setFont(new java.awt.Font("Microsft Sans Serif", 3, 14));
        jTextArea.setOpaque(false);
        jTextArea.setEditable(false);
       
        jScrollPane1.setViewportView(jTextArea);
        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane1.setOpaque(false);
        jScrollPane1.setBorder(null);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(100, 130, 600, 170);
        
        getContentPane().add(jLabel);
        jLabel.setBounds(270, 20, 160, 60);
        getContentPane().add(jButton1);
        jButton1.setBounds(280, 400, 130, 40);
        getContentPane().add(content, BorderLayout.CENTER);        
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        this.dispose();
    }
}
