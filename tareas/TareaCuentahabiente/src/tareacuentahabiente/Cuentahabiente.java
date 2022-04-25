/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareacuentahabiente;

/**
 *
 * @author begax
 */
public class Cuentahabiente {
    private String idCliente;
    private String nombre;
    private int edad;
    private int balance; //dinero ahorrado

    public Cuentahabiente() {
    }

    public Cuentahabiente(String idCliente, String nombre, int edad, int balance) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.edad = edad;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cuentahabiente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", edad=" + edad + ", balance=" + balance + '}';
    }

    public void retirarDinero( float monto ){
            monto = balance - 1500;
    }
    
    public String evaluarNivelCliente(){
        return this.balance >= 50000.00f?"Cliente Premium" : "Cliente Regular";
    }
    
    
}
