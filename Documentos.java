/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;


public abstract class Documentos {
    
    private String titulo;
    private String fechadepublicacion;
    private String codigo;
   
    private String mesdepublicacion;
    private String dia;

    public Documentos(String titulo/*, String fechadepublicacion, String codigo, String mesdepublicacion, String dia*/) {
        this.titulo = titulo;
        this.fechadepublicacion = fechadepublicacion;
        this.codigo = codigo;
        this.mesdepublicacion = mesdepublicacion;
        this.dia = dia;
    }
    
    

 
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechadepublicacion() {
        return fechadepublicacion;
    }

    public void setFechadepublicacion(String fechadepublicacion) {
        this.fechadepublicacion = fechadepublicacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMesdepublicacion() {
        return mesdepublicacion;
    }

    public void setMesdepublicacion(String mesdepublicacion) {
        this.mesdepublicacion = mesdepublicacion;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
   
  @Override
    public String toString() {
        return this.titulo.toString() ;
    }

        
    }


