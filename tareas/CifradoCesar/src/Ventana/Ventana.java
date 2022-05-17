/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventana;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
/**
 *
 * @author begax
 */
public class Ventana extends JFrame{
    
     private JLabel  texto1;
     private JTextField cuadro1;
     private JLabel sali;
     private JLabel texto2;
     private JTextArea cuadro2;
     private JButton boton1;
     private JLabel mensaje;
    
     public Ventana(){
     
         //codigo ventana
         super("Cifrado César");
         getContentPane().setLayout(new BoxLayout(getContentPane(),BoxLayout.X_AXIS));
         texto1 = new JLabel("Tipo de desplazamiento: ");
         cuadro1 = new JTextField(2);
         sali = new JLabel("                                                    ");
         texto2 = new JLabel("Mensaje a cifrar: ");
         cuadro2 = new JTextArea(8, 20);
         boton1 = new JButton ("cifrar");
         boton1.setBackground(Color.blue);
         boton1.setOpaque(true);
         boton1.setToolTipText("Clic para convertir su mensaje con el Cifrado César");
         mensaje = new JLabel("Mensaje: ");
         
         getContentPane().add(texto1);
         getContentPane().add(cuadro1);
         getContentPane().add(sali);
         getContentPane().add(texto2);
         getContentPane().add(cuadro2);
         getContentPane().add(boton1);
         getContentPane().add(mensaje);
         pack();
         setVisible(true);
         setSize(450,370);
         setLayout(new FlowLayout(FlowLayout.CENTER));
         
         //aqui acaba el diseño de la ventena NO TOCAR
         
         this.addWindowListener( new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
            System.exit(0);
            }
        });
         
         this.boton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
            
                float desplazamiento = 0.0f;
                String clave = cuadro2.getText();
                char letras[] = clave.toCharArray();
                try {
                    desplazamiento = Float.parseFloat( cuadro1.getText());
                    
                    for (int i = 0; i < letras.length; i++) {
                        letras[i]=(char)(letras[i]+(char)desplazamiento);
                    }
                    
                    String crip = String.valueOf(letras);
                    mensaje.setText("Mensaje: " + crip);
                    
                    
                } catch (NumberFormatException ex) {
                    System.out.println(ex.toString());
                    JOptionPane.showMessageDialog(null, "Introduce un valor correcto", 
                            "Error de captura", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
         
         
         
     }
    
}
