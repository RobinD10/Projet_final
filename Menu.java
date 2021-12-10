/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_final;

import vue.TableauScores;
import vue.Regles;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import vue.Plateau;
/**
 *
 * @author dijou
 */
public class Menu extends JFrame {
    private JButton boutonQuitter = new JButton();
    private JLabel imageBackground = new JLabel();
    private JMenu menuJouer = new JMenu();
    private JMenu menuRegles = new JMenu();
    private JMenuBar barreMenu = new JMenuBar();
    private JMenuItem sousMenu1 = new JMenuItem();
    private JMenuItem sousMenu2 = new JMenuItem();
    private JMenuItem sousMenuScores = new JMenuItem();
    
    public Menu() {
        initialisation();
    }
                         
    private void initialisation() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(1000, 692));
        setResizable(false);
        getContentPane().setLayout(null);

        boutonQuitter.setFont(new Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        boutonQuitter.setForeground(new Color(255, 255, 255));
        boutonQuitter.setText("Quitter");
        boutonQuitter.setBorder(null);
        boutonQuitter.setBorderPainted(false);
        boutonQuitter.setContentAreaFilled(false);
        boutonQuitter.setOpaque(false);
        boutonQuitter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boutonQuitterActionPerformed(e);
            }
        });
        getContentPane().add(boutonQuitter);
        boutonQuitter.setBounds(759, 555, 130, 50);

        imageBackground.setIcon(new ImageIcon(getClass().getResource("/projet_final/ThinIce.png")));
        getContentPane().add(imageBackground);
        imageBackground.setBounds(0, 0, 1000, 660);

        menuJouer.setText("Jouer");

        sousMenu1.setText("Nouvelle Partie");
        sousMenu1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sousMenu1ActionPerformed(e);
            }
        });
        barreMenu.add(menuJouer);
        menuJouer.add(sousMenu1);

        sousMenu2.setText("Reprendre une Partie");
        menuJouer.add(sousMenu2);

        sousMenuScores.setText("Score");
        sousMenuScores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sousMenuScoresActionPerformed(e);
            }
        });
        menuJouer.add(sousMenuScores);        

        menuRegles.setText("Règles");
        menuRegles.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                menuReglesMouseClicked(evt);
            }
        });
        barreMenu.add(menuRegles);

        setJMenuBar(barreMenu);        
        
        pack();
    }                     

    private void boutonQuitterActionPerformed(ActionEvent e) {                                         
        this.dispose();
    }                                                                           

    private void menuReglesMouseClicked(MouseEvent evt) {                                    
        Regles mesRegles = new Regles();
        mesRegles.setVisible(true);
    }  
    
    private void sousMenu1ActionPerformed(ActionEvent e) {                                    
        /*NouvellePartie monJoueur = new NouvellePartie();
        monJoueur.setVisible(true);*/
        //monJoueur.enregistrement();
        Plateau monPlateau = new Plateau();
        monPlateau.setVisible(true);
    } 
    
    private void sousMenuScoresActionPerformed(ActionEvent e) {                                    
        TableauScores monTableau = new TableauScores();
        monTableau.setVisible(true);
        //monTableau.ecriture();
        //test monTest = new test();
        //monTest.setVisible(true);
        //monJoueur.enregistrement();
        /*Plateau monPlateau = new Plateau();
        monPlateau.setVisible(true);*/
    } 
}
