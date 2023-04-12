/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seccion.propuestas;

import java.io.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.event.*;

public class Seccionpropuestas extends JPanel implements ActionListener{
    private JButton enviar;
    private JLabel Título;
    private JTextField espacio1;
    private JLabel area;
    private JLabel opinion;
    private JLabel tema;
    private JTextField espacio2;
    private JLabel Propuestas_realizadas;
    private JTextField espacio3;
    private JTextField espacio4;
    private JButton TEMAS;
    int cont=0;
   
    public Seccionpropuestas() {
        //construct components
        
        enviar = new JButton ("Enviar");
        Título = new JLabel ("Propuesta para la empresa");
        espacio1 = new JTextField (5);
        area = new JLabel ("¿Para qué área va dirigida?");
        opinion = new JLabel ("Escribe acá tu opinión");
        tema = new JLabel ("Tema");
        espacio2 = new JTextField (5);
        Propuestas_realizadas = new JLabel ("Propuestas realizadas");
        espacio3 = new JTextField (5);
        espacio4 = new JTextField (5);
        TEMAS= new JButton ("Mirar temas realizados");
        
        //Inicializando el contador de las propuestas
        espacio4.setText(Integer.toString(cont));

        //adjust size and set layout
        setPreferredSize (new Dimension (493, 363));
        setLayout (null);

        //add components
        add (enviar);
        enviar.addActionListener(this);
        add (Título);
        add (espacio1);
        add (area);
        add (opinion);
        add (tema);
        add (espacio2);
        add (Propuestas_realizadas);
        add (espacio4);
        add (espacio3);
        add (TEMAS);
        TEMAS.addActionListener(this);
        
        
        

        //set component bounds (only needed by Absolute Positioning)
        enviar.setBounds (345, 200, 100, 20);
        Título.setBounds (175, 20, 255, 30);
        espacio1.setBounds (15, 105, 270, 30);
        area.setBounds (15, 75, 245, 20);
        opinion.setBounds (15, 240, 190, 25);
        tema.setBounds (15, 160, 100, 25);
        espacio2.setBounds (15, 185, 270, 30);
        Propuestas_realizadas.setBounds (333, 95, 135, 25);
        espacio4.setBounds (330,100, 135, 40);
        espacio3.setBounds (15, 270, 270, 80);
        TEMAS.setBounds(310, 230,170,20);
    }
   
    
    

    
    
    public void actionPerformed(ActionEvent evt) {
        if(evt.getSource()== enviar){
            cont=cont+1;
            File archivo;
            FileWriter escribir;
            PrintWriter linea;
            String área="",tema="",opinion="";
            String espacio=" ";
            archivo= new File("C:\\Users\\LENOVO\\OneDrive\\Escritorio\\Seccion-propuestas\\PP.txt");
            if(!archivo.exists())
            {
                try {
                    archivo.createNewFile();
                    área= espacio1.getText();
                    tema= espacio2.getText();
                    opinion=espacio3.getText();
                    escribir= new FileWriter(archivo,true);
                    linea= new PrintWriter(escribir);
                    linea.println("Área: "+área);
                    linea.println("Tema: "+tema);
                    linea.println("Opinión: "+opinion);
                    linea.println(espacio);
                    linea.close();
                    escribir.close();
                    
                    espacio4.setText("Prop. realizadas: "+cont);
                    JOptionPane.showMessageDialog(null,"La propuesta se ha guardado correctamente");
                    
                } catch (IOException ex) {
                    Logger.getLogger(Seccionpropuestas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else
            {
                try{
                    área= espacio1.getText();
                    tema= espacio2.getText();
                    opinion=espacio3.getText();
                    escribir= new FileWriter(archivo,true);
                    linea= new PrintWriter(escribir);
                    linea.println(espacio);
                    linea.println("Área: "+área);
                    linea.println("Tema: "+tema);
                    linea.println("Opinión: "+opinion);
                    linea.close();
                    escribir.close();
                    
                    espacio1.setText("");
                    espacio2.setText("");
                    espacio3.setText("");
                    espacio4.setText("Prop. realizadas: "+cont);
                    JOptionPane.showMessageDialog(null,"La propuesta se ha guardado correctamente");
                } catch (IOException ex) {
                    Logger.getLogger(Seccionpropuestas.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            }
        }   
        if(evt.getSource()==TEMAS)
        {
            Registro Rg=new Registro();
            Rg.setVisible(true);
        }
        
         
            
            
        
    }
    

    public static void main (String[] args) {
        JFrame frame = new JFrame ("Seccionpropuestas");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Seccionpropuestas());
        frame.pack();
        frame.setVisible (true);
        
         }

       
    }


    /*try{
                cont=cont+1;
                Class.forName("com.mysql.jdbc.Driver"); 
                Connection co= DriverManager.getConnection("jdbc:mysql//localhost:3306/propuesta", "root", "");
                Statement stm = co.createStatement();
                PreparedStatement pst = co.prepareStatement("insert into empleados values(?,?,?)");
                
                
                pst.setString(1,espacio1.getText());
                pst.setString(2,espacio2.getText());
                pst.setString(3,espacio3.getText());
                pst.executeUpdate();
               
                espacio1.setText("");
                espacio2.setText("");
                espacio3.setText("");
                espacio4.setText("Prop. realizadas: "+cont);
                JOptionPane.showMessageDialog(null,"La propuesta se ha guardado correctamente");
            }catch (Exception e){
                
            }
            
            //JOptionPane.showMessageDialog(null,"La propuesta se ha guardado correctamente");
        }    
        */