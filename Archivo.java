
package libreria;


public class Archivo {

    
    public static void main(String[] args) {
        
        
    Libreria labastilla= new Libreria();
      Libros a1 = new Libros("El resplandor");
      a1.setEditorial("La Castellana");
      
    a1.agregarAutores(new Autores("Francisco","Calle 123", "4532232", "Francisco@hotmail.com"));
     labastilla.agregarLibros(a1);
     
      
        System.out.println(labastilla.getLibros());
      
      
    }
    
}
