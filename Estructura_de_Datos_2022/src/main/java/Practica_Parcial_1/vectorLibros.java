package Practica_Parcial_1;
import javax.swing.JOptionPane;
/**
 *
 * @author Diego Vega
 */
public class vectorLibros {
    /*
    5. en un vector almacene los datos de un libro con los siguientes atributos:
    (ID,Titulo,Autor,Editorial,Nro de ejemplar,ISBN,Precio,Año Publicado)
    realizar los siguientes operaciones:
    •Realizar el TDA
    •Crear el vector
    •Adicionar
    •Eliminar un libro
    •modificar los datos de un libro
    •listar todos libros
    •Buscar Libros por Autor
    */
    
    public String id,titulo,autor,editorial,nroDeEjemplar,isbn,precio,añoPublicado;

    public vectorLibros(String id, String titulo, String autor, String editorial, String nroDeEjemplar, String isbn, String precio, String añoPublicado) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.nroDeEjemplar = nroDeEjemplar;
        this.isbn = isbn;
        this.precio = precio;
        this.añoPublicado = añoPublicado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getNroDeEjemplar() {
        return nroDeEjemplar;
    }

    public void setNroDeEjemplar(String nroDeEjemplar) {
        this.nroDeEjemplar = nroDeEjemplar;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getAñoPublicado() {
        return añoPublicado;
    }

    public void setAñoPublicado(String añoPublicado) {
        this.añoPublicado = añoPublicado;
    }
    public String getTodo(){
        String s="";
        s=getId()+"\t"+getTitulo()+"\t"+getAutor()+"\t"+getEditorial()+"\t"+getNroDeEjemplar()+"\t"+getIsbn()+
        "\t"+getPrecio()+"\t"+getAñoPublicado();
        return s;
    }
}
