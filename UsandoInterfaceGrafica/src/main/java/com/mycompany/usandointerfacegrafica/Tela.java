package com.mycompany.usandointerfacegrafica;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Tela extends JFrame { // herança da classe Jframe (acessores e modificadores)
   
    public Tela() {
          setVisible(true); // habilitando a tela
          setSize(500, 500); // tamanho da tela
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // encerra a execução do programa ao encerrar
          setResizable(false); // não pode redimensionar o tamanho
          setLocationRelativeTo(null); // meio da tela
          setLayout(null);
        
//        JFrame jframe = new JFrame("Tela de teste"); // construtor
//        
//        jframe.setVisible(true); // habilitando a tela
//        jframe.setSize(500, 500); // tamanho da tela
//        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // encerra a execução do programa ao encerrar
//        jframe.setResizable(false); // não pode redimensionar o tamanho
//        jframe.setLocationRelativeTo(null); // meio da tela

          JButton jButton = new JButton("Clique aqui"); // construtor
          jButton.setBounds(100, 200, 250, 70); // tamanho do botão
          jButton.setFont(new Font("Arial", Font.BOLD, 40)); // fonte
          jButton.setForeground(new Color(237, 241, 238)); // fundo do texto
          jButton.setBackground(new Color(0, 0, 0)); // fundo do botão
          
          
          JButton jButton2 = new JButton("Outro botão"); // construtor
          jButton2.setBounds(0, 0, 100, 50); // tamanho do botão
          jButton2.setFont(new Font("Georgia", Font.ITALIC, 10)); // fonte
          jButton2.setForeground(new Color(100, 32, 80)); // fundo do texto
          jButton2.setBackground(new Color(60, 9, 1)); // fundo do botão
          
         
          
          add(jButton); // adicionando botão
          add(jButton2);
    }
}
