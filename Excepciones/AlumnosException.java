package Excepciones;

public class AlumnosException extends RuntimeException {

    public AlumnosException(){

        super("No existe el alumno solicitado");
    }

    public AlumnosException(String msg){
        super(msg);

    }

    @Override
    public String getMessage() {
        return "Esto es un mensaje de Alumnos Exception";
    }
}
