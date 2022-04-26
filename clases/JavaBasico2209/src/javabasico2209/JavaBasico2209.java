/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2209;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author begax
 */
public class JavaBasico2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad = 20;
        System.out.println("Edad = " + edad);
        Integer edad2 = new Integer(22);
        System.out.println(edad2);
        double x = edad2.doubleValue();
        System.out.println(x);
        System.out.println(edad2.shortValue());
        System.out.println(".-.-.-.-.-.-.-.-.-.");
        // convertir string a entero
        String cadena = "99";
        int altura = Integer.parseInt(cadena);
        altura += 1;
        System.out.println("Altura = " + altura);
        
        float y = Float.parseFloat(cadena);
        y = y + 0.5f;
        System.out.println("Altura = " + y);
        
        System.out.println("-----------------------------------------");

        Arbol tree1 = new Arbol(2.4f, 15);
        Arbol tree2 = new Arbol(2.4f, 15);
        Arbol tree3 = new Arbol(2.4f, 15);
        Arbol tree4 = new Arbol(2.4f, 15);

        System.out.println(tree1);

        System.out.println("Troncos de un arbol = " + Arbol.tronco);
        Arbol.generarOxigeno();
        /*
        JOptionPane.showMessageDialog(null, "Hola Mundo", "Título equis jaja", JOptionPane.ERROR_MESSAGE);
        String dato = JOptionPane.showInputDialog(null, "Dame tu edad", "Introducir datos", JOptionPane.QUESTION_MESSAGE);
        System.out.println( dato );
         */
        //Código sin operador ternario
        int edad3 = 20;
        //Validar si es mayor de edad
        String resultado = "";
        if (edad3 < 18) {
            resultado = "Menor de edad";
        } else {
            resultado = "Mayor de edad, ten un tequila para la garganta";
        }
        System.out.println(resultado);

        // Mismo algoritmo pero con operador ternario
        // <cond>? <True> : <False>;
        int edad4 = 21;
        String res = "";
        res = edad4 < 18 ? "Menor de edad 4" : "Mayor de edad, tequila";
        System.out.println(res);

        //versión mínima
        int edad5 = 21;
        System.out.println(edad5 < 18 ? "Menor de edad5" : "Ya! el tequila");
        System.out.println("____________________________________________");

//otro
        int val1 = 1;
        int val2 = 2;
        //Comparación or a nivel de bits es decir
        /*
         val1 = 0000...0001;
         val2 = 0000...0010;
         or a nivel de bits
         */
        System.out.println(val1 & val2);
        /*
         Qué está pasando, esto:
         val1 = 0000...0001;
         or
         val2 = 0000...0010;
         -------------------
                0000...0011;
         */
        int val3 = 1; //0000...0001
        //int val4 << val3; 
        //System.out.println(val3 <<= );
        int val4 = 0;
        val4 = val3 << 2;//El segundo valor es el num de despplazamientos
        //a la izquierda.
        System.out.println(val4);

        System.out.println("------ARREGLOS------");
        int[] edades; //Primero se declara que será un arreglo
        //en este punto aún no se reserva memoria
        //Ahora se debe de reservar de un tamaño específico
        edades = new int[5];
        System.out.println(edades);
        //Ahora lo usamos como siempre lo hemos hecho
        edades[0] = 10;
        System.out.println("La primer edad es:" + edades[0]);

        //declarar e inicializar en una sola línea 
        int[] estaturas = new int[5];

        //al igual que en C y C++, puedes asignar valores
        int[] pesos = {86, 99, 56, 76, 77}; // en kilos
        System.out.println(pesos[0]); //86
        System.out.println(pesos[1]); //99
        System.out.println(pesos[2]); //56
        System.out.println(pesos[3]); //76
        System.out.println(pesos[4]); //77
        //Imprimire lo mismo pero con menos líneas de código
        System.out.println("--------CON FOR-------");
        for (int i = 0; i < pesos.length; i++) {
            System.out.println(pesos[i]);
        }

        //imprimimos en inverso
        System.out.println("-----INVERSAMENTE-----");
        for (int k = pesos.length - 1; k >= 0; k--) {
            System.out.println(pesos[k]);
        }

        System.out.println("-------------ARREGLO DE ALUMNOS------------");
        Alumno[] lista = new Alumno[5];//5 alumnos
        lista[0] = new Alumno("317074006", 2, 9.0f);
        lista[1] = new Alumno("317074007", 2, 7.0f);
        lista[2] = new Alumno("317074008", 2, 7.0f);
        lista[3] = new Alumno("317074009", 2, 8.0f);
        lista[4] = new Alumno("317074000", 2, 6.0f);
        //Aqui usamos la palabra "fori" + TAB y se autocompletó
        for (int i = 0; i < lista.length; i++) {
            Alumno alumno = lista[i];
            System.out.println(alumno.evaluarDesempenio());
        }
        
        /* For each es un FOR especial, introducido
        en la versión 2 de Java, esa versión fue la 
        que sufrió cambios muy grandes en Java
        El "FOR EACH" fue introducido para simplificar 
        los FOR con arrelgos.
        usamos fore + TAB
        */
        System.out.println("-------Con for each----");
        for (Alumno alumno : lista) {
            System.out.println(alumno.evaluarDesempenio());
            }
        
        ArrayList<Alumno> grupo2209= new ArrayList<Alumno>();
        grupo2209.add( new Alumno ("99999", 2 , 9.0f ));
        grupo2209.add( new Alumno ("88888", 2 , 8.0f ));
        grupo2209.add( new Alumno ("77777", 2 , 7.0f ));
        grupo2209.add( new Alumno ("66666", 2 , 6.0f ));
        grupo2209.add( new Alumno ("55555", 2 , 5.0f ));
        
        for (Alumno alumno : grupo2209){
            System.out.println(alumno);
        }
        
        System.out.println("Add con indice");
        grupo2209.add(2, new Alumno("81111", 3 , 9.9f));
        
        for (Alumno alumno : grupo2209){
            System.out.println(alumno);
        }
        
        Alumno tmp = grupo2209.get(1);
        System.out.println("Alumno en index = 1 : " + tmp);
        
        System.out.println("Eliminar index 3 ");
        Alumno tmp2 = grupo2209.remove(3);
        System.out.println("Elemento sacado = " + tmp2);
        
        for (Alumno alumno : grupo2209){
            System.out.println(alumno);
        }
        
        System.out.println("Reemplazar el i esimo elemento");
        Alumno tmp3 = grupo2209.set(0, new Alumno("44444", 4, 4.0f));
        System.out.println("El sacado es = " + tmp3);
        
        for (Alumno alumno : grupo2209){
            System.out.println(alumno);
        }
         //Excepciones
         
         try {
             System.out.println("Excepciones");
             System.out.println(grupo2209.get(20));
        } catch (Exception e) {
            
        }
                
        }
    }
    
