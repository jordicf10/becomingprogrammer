public class Libro {
    private String titulo;
    private int ISBN;
    private String autor;
    private int npaginas;

    public Libro(String titulo, int ISBN, String autor, int npaginas) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.autor = autor;
        this.npaginas = npaginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
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

    public int getNpaginas() {
        return npaginas;
    }

    public void setNpaginas(int npaginas) {
        this.npaginas = npaginas;
    }

    public String toString() {
        return "El libro " + titulo + " con ISBN " + ISBN + " creado por el autor " + autor + " tiene " + npaginas + " páginas";
    }

}



