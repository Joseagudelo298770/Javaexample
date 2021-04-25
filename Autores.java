/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;


public class Autores extends Contacto {
    
    private String nombre;

    public Autores(String nombre, String email, String direccion, String telefono) {
        super(email, direccion, telefono);
        
       this.nombre= nombre;
    }

    @Override
    public String toString() {
        return this.nombre.toString()+","+ this.getEmail().toString()+", "+this.getDireccion().toString()+", "+this.getTelefono().toString();
    }
    
     
   
    
    
}
