
package libreria;


public class Nodo {
    
    private Object dato; 
    private Nodo liga; 

    public Nodo(Object dato) {
        this.dato = dato;
        this.liga =null; 
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getLiga() {
        return liga;
    }

    public void setLiga(Nodo liga) {
        this.liga = liga;
    }
    
   
    
    
}
