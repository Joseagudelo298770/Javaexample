/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

public class Libreria {

    private Pila test;
    private Pila ponencias;
    private Pila libros;
    private Pila articulocientifico;

    public Libreria(Pila ponencias, Pila libros, Pila articulocientifico) {
        this.ponencias = ponencias;
        this.libros = libros;
        this.articulocientifico = articulocientifico;
    }

    public Libreria() {
        this.articulocientifico = new Pila();
        this.libros = new Pila();
        this.ponencias = new Pila();
        this.test = new Pila();
    }

    /*
    public void borrardebasededatos(int opcion){
        
        switch(opcion){
            case 1:
                
                
                break;
            case 2:
                break;
            case 3:
                break;
                
        }
        
        
        
    }
     */
    public Pila getPonencias() {
        return ponencias;
    }

    public Pila getTest() {
        return test;
    }

    public void setTest(Pila test) {
        this.test = test;
    }

    public Pila getLibros() {
        return libros;
    }

    public Pila getArticulocientifico() {
        return articulocientifico;
    }

    public void agregarLibros(Libros libro) {
        libros.push(libro);
    }

    public void agregarPonencia(Ponencias ponencia) {
        ponencias.push(ponencia);

    }

    public void agregarArticulo(Articulocientifico articulo) {
        articulocientifico.push(articulo);
    }
    

    public void agregarTest(Test casa){
        test.push(casa);
        
        
    }
    
    

    @Override
    public String toString() {
        return "Los libros guardados en la libería son " + this.test.toString();

    }
}
