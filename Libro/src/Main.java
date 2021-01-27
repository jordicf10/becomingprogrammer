public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("La sombra del viento", 323464563, "Carlos Ruiz Zafón", 654);
        Libro libro2 = new Libro("El juego del ángel", 34534646, "Carlos Ruiz Zafón", 456);
        Libro libro3 = new Libro("It", 345546547, "Stephen King", 487);
        Libro libro4 = new Libro("Carrie", 235463453, "Stephen King", 345);

        System.out.println(libro1.toString());

        System.out.println(libro2.toString());

        System.out.println(libro1.getNpaginas());

        libro1.setNpaginas(765);
        System.out.println(libro1.toString());

        if (libro1.getNpaginas() > libro2.getNpaginas()) {
            System.out.println("El libro " + libro1.getTitulo() + " tiene más páginas que el libro " + libro2.getTitulo());
        } else {
            System.out.println("El libro " + libro2.getTitulo() + " tiene más páginas que el libro " + libro1.getTitulo());
        }

        String[] autores = new String[4];
        autores[0] = libro1.getAutor();
        autores[1] = libro2.getAutor();
        autores[2] = libro3.getAutor();
        autores[3] = libro4.getAutor();

        for(int i=0;i<autores.length;i++) {
            if (autores[0].equals(autores[1])) {
                System.out.println("El autor " + autores[0] + " ha escrito los libros " + libro1.getTitulo() + " y " + libro2.getTitulo());
                if (autores[2].equals(autores[3])) {
                    System.out.println("El autor " + autores[2] + " ha escrito los libros " + libro3.getTitulo() + " y " + libro4.getTitulo());
                    if (autores[0].equals(autores[3])) {
                        System.out.println("El autor " + autores[0] + " ha escrito los libros " + libro1.getTitulo() + " y " + libro4.getTitulo());
                        if (autores[1].equals(autores[2])) {
                            System.out.println("El autor " + autores[1] + " ha escrito los libros " + libro2.getTitulo() + " y " + libro3.getTitulo());
                            if(autores[0].equals(autores[2])) {
                                System.out.println("El autor " + autores[0] + " ha escrito los libros " + libro1.getTitulo() + " y " + libro3.getTitulo());
                    }

                        }

                }

                    break;
            }

            }
            }
            }
            }










