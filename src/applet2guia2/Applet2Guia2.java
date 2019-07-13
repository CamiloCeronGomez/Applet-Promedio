/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applet2guia2;


/**
 *
 * @author camilo
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Applet2Guia2 extends Applet implements ActionListener {
TextField tfN1,tfN2, tfN3, tfN4;//entradas de texto
Label lN1,lN2, lN3, lN4;//label de los textos de entrada
Button boton;
double resultado = 0;//variable para mostrar el resultado
//método constructor,donde se crean los objetos a dibujar en el applet
public Applet2Guia2() {
//Damos la instruccion que no se usará ningun layout para poder dibujar con setBounds
this.setLayout((null));
//setBounds(posicionx, posiciony, ancho, alto)
lN1= new Label("Numero 1: ");
lN1.setBounds(20, 20, 100, 20);
lN2= new Label("Numero 2: ");
lN2.setBounds(20, 40, 100, 20);
lN3= new Label("Numero 3: ");
lN3.setBounds(20, 60, 100, 20);
lN4= new Label("Numero 4: ");
lN4.setBounds(20, 80, 100, 20);

tfN1 = new TextField();
tfN1.setBounds(120, 20, 100, 20);
tfN2 = new TextField();
tfN2.setBounds(120, 40, 100, 20);
tfN3 = new TextField();
tfN3.setBounds(120, 60, 100, 20);
tfN4 = new TextField();
tfN4.setBounds(120, 80, 100, 20);
boton = new Button("Calcula");
boton.setBounds(120,100,100,20);
//agregamos los elementos a la pantalla
add(lN1);
add(lN2);
add(lN3);
add(lN4);
add(tfN1);
add(tfN2);
add(tfN3);
add(tfN4);
add(boton);
 boton. addActionListener(this); // se le añade al boton la facilidad de
// ser escuchado
}


//método paint en el cual se pone lo que se quiere dibujar
public void paint(Graphics g) {
this.setSize(500, 500);

g.drawString("El promedio es = "+resultado, 20, 200);

//dibuja el cuadrado
}
// método para realizar las opciones al oprimir un botón
public void actionPerformed(ActionEvent ae) {
    // se toma el numero del texto y se pasa a la variable n1
double num1 = Double.parseDouble(tfN1.getText());
 // se toma el numero del texto y se pasa a la variable n2
double num2 = Double.parseDouble(tfN2.getText());
 // se toma el numero del texto y se pasa a la variable n3
double num3 = Double.parseDouble(tfN3.getText());
 // se toma el numero del texto y se pasa a la variable n4
double num4 = Double.parseDouble(tfN4.getText());

double r = (num1+num2+num3+num4)/(4);

resultado = r;
System.out.println(resultado);
}
}
