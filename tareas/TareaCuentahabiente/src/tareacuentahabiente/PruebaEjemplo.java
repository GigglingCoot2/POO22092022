/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareacuentahabiente; 
import tareacuentahabiente.Cuentahabiente;
/**
 *
 * @author begax
 */
public class PruebaEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("~~~~~Tarea Cuentahabiente~~~~~");
        
        Cuentahabiente[] lista = new Cuentahabiente[5];
        
        lista[0] = new Cuentahabiente("A3568954", "Natasha Romanoff", 38, 150000);
        lista[1] = new Cuentahabiente("A89644712", "Wanda Maximoff", 33, 100000);
        lista[2] = new Cuentahabiente("SKJ8964221", "Kate Bishop", 20, 20000);
        lista[3] = new Cuentahabiente("RDR5031999", "Yelena Belova", 33, 500000);
        lista[4] = new Cuentahabiente("USAF568771", "Robyn Belova", 27, 35000);
        
        for (int i = 0; i < lista.length; i++) {
            Cuentahabiente Cuentahabiente = lista[i];
            System.out.println(Cuentahabiente.evaluarNivelCliente());
        }
    }
    
}
