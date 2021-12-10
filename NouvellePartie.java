/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_final;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.*;
import java.io.*;
import javax.swing.*;

/**
 *
 * @author dijou
 */
public class NouvellePartie extends JFrame{
    JTextPane pseudoJoueur = new JTextPane();
    
    public NouvellePartie(){
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
        labelTitre.setText("Saisissez votre pseudo :");
        
        boutonOK.setFont(new Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        boutonOK.setForeground(new Color(0, 0, 0));
        boutonOK.setText("OK");
        boutonOK.setBorder(null);    
        boutonOK.setBackground(new Color(250, 250, 250));
        boutonOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pseudo = pseudoJoueur.getText();
                try (FileWriter fos = new FileWriter("C:\\ING3_S1\\Java POO\\Projet_Final\\src\\projet_final\\fichierPseudo.txt", true)) {
                    fos.write(pseudo + "\n");
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
    
    /*public void enregistrement(String nomFichier) throws FileNotFoundException, IOException{
        FileOutputStream fichier;
        ObjectOutputStream objet;

        public EcrireFichier(String nomFichier) throws FileNotFoundException, IOException {
            fichier = new FileOutputStream(nomFichier);
            objet = new ObjectOutputStream(fichier);
        }

        public void ecrireFichierInter(String pseudo) throws IOException {
            objet.writeObject(pseudo);
        }

        public void fermer() throws IOException {
            objet.close();
        }*/
}
