package Prueba.Visual.frontend;
import Prueba.Visual.backend.Prueba;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class PruebaVisual extends JFrame implements Observer {
    private JPanel Cliente;
    private JPanel Inicio;
    private JPanel Prueba;
    private JPanel InicioInfo;
    private JButton BotonInicio;
    private JLabel NombrePrueba;
    private JLabel NumeroPreguntas;
    private JLabel TiempoPrueba;
    private JPanel Item;
    private JPanel Botones;
    private JButton AnteriorPregunta;
    private JButton SiguientePregunta;
    private JLabel NumeroPregunta;
    private JPanel Enunciado;
    private JPanel PreguntaVF;
    private JPanel PreguntaMultiple;
    private JButton verdaderoButton;
    private JButton falsoButton;
    private JTextField justificaciónTextField;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JRadioButton radioButton4;
    private JPanel Resultados;

    private Prueba backend;



    public PruebaVisual(Prueba backend){
     this.backend=backend;
     ((Observable)this.backend).addObserver(this);
     this.setContentPane(this.Enunciado);
     this.backend.cargarItems();

     this.BotonInicio.addActionListener(new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent e) {
             ((CardLayout)Inicio.getLayout()).next(Inicio);
         }
     });

     this.SiguientePregunta.addActionListener(new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent e) {
             ((CardLayout)Enunciado.getLayout()).next(Enunciado);
         }
     });
     this.AnteriorPregunta.addActionListener(new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent e) {
             ((CardLayout)Enunciado.getLayout()).next(Enunciado);
         }
     });

     this.setDefaultCloseOperation(EXIT_ON_CLOSE);
     this.pack();

    }

    @Override
    public void update(Observable o, Object arg) {
        int i = 1;
        for(Pregunta p:this.backend.Preguntas()){
            this.Item.enunciado = Preguntas[0];

        }
            i++;





    }


}
