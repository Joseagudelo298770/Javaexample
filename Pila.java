
package libreria;

public class Pila {

    private Nodo header;
    private Nodo tail;

    public Nodo getHeader() {
        return header;
    }

    public void setHeader(Nodo header) {
        this.header = header;
    }

    public Nodo getTail() {
        return tail;
    }

    public void setTail(Nodo tail) {
        this.tail = tail;
    }

    private int length;

    public Pila() {

        this.header = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        if (this.length == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int getLength() {
        return length;
    }

    public void push(Object dato) {

        Nodo x = new Nodo(dato);
        if (this.isEmpty()) {
            this.header = x;
        } else {
            x.setLiga(this.tail);
        }

        this.tail = x;
        this.length++;

    }

    public Object pop() {
        if (this.isEmpty()) {
            System.out.println("No hay libros en el sistema");
            return null;

        }
        this.length--;
        Nodo q = this.tail;
        this.tail = this.tail.getLiga();
        q.setLiga(null);
        Object dato = q.getDato();
        return dato;
    }

    @Override
    public String toString() {

        String msj = "[";

        Nodo q = this.tail;

        while (q != null) {

            msj = msj + q.getDato().toString() + "";
            q = q.getLiga();
        }

        msj += "]";
        return msj;

    }

    public void search (Object z){
        
        Nodo x = this.getTail() ;
        
        while (x != null){
            if (x.getDato()== z){
                System.out.println("Elemento encontrado");
                break;
               
            }
            x = x.getLiga();
            if (x==null) {
                    System.out.println("El elemento no está en la lista");
                    }
        }
        
        
            
    }
    
    public int ubicar(Object dato){
        int r = 0;
        int i = 0;
        
        Nodo q = this.getHeader();
        
        while(q != null){
            if(q.getDato().equals(dato)){
                r = i;
                break;
            }
            i++;
            q = q.getLiga();
        }
        
        //if(q == null)
            //System.out.println("El nodo no se encuentra en la lista");
        
        return r;
    }
    
    
}
