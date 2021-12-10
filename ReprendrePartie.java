/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_final;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.awt.geom.RoundRectangle2D;
import javax.swing.*;

/**
 *
 * @author dijou
 */
public class ReprendrePartie extends JFrame{
    
    JTextPane pseudoJoueur = new JTextPane();
 
    public ReprendrePartie(){
        CardLayout cardL = new CardLayout();
        JPanel content = new JPanel();
        JLabel labelTitre = new JLabel();
        JButton boutonOK = new JButton();

         
        setSize(400, 200);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setUndecorated(true);
        setShape(new RoundRectangle2D.Double(0d, 0d, 400d, 200d, 25d, 25d));
                   
        JPanel pan1 = new JPanel();
        pan1.setBackground(new Color(102, 204, 255)); 
        
        labelTitre.setFont(new Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        labelTitre.setForeground(Color.BLACK);
        labelTitre.setText("Quel était votre ancien pseudo ?");
        
        boutonOK.setFont(new Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        boutonOK.setForeground(new Color(0, 0, 0));
        boutonOK.setText("OK");
        boutonOK.setBorder(null);    
        boutonOK.setBackground(new Color(250, 250, 250));
        boutonOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String texte = pseudoJoueur.getText();
                try (FileReader fos = new FileReader("C:\\ING3_S1\\Java POO\\Projet_Final\\src\\projet_final\\fichierPseudo.txt")) {
                    if (texte == fos.(texte)){
                        
                    }
                    fos.read(texte + "\n");
                    pseudoJoueur.setText("");
                } catch (IOException ex) {
                }
                boutonOKActionPerformed(e);
            }
        });

        pseudoJoueur.setFont(new Font("Microsft Sans Serif", 0, 20));
        pseudoJoueur.setBackground(Color.white);
        
        content.add(pan1);
        content.setLayout(cardL);
        
        getContentPane().add(labelTitre);
        labelTitre.setBounds(50, 20, 250, 60);
        
        getContentPane().add(boutonOK);
        boutonOK.setBounds(160, 150, 80, 30);
        
        getContentPane().add(pseudoJoueur);
        pseudoJoueur.setBounds(50, 90, 300, 35);
        
        getContentPane().add(content, BorderLayout.CENTER); 
    }
    
    private void boutonOKActionPerformed(ActionEvent e) {                                         
        this.dispose();
        /*Plateau monPlateau = new Plateau();
        monPlateau.setVisible(true);*/
    }
    
    
}
