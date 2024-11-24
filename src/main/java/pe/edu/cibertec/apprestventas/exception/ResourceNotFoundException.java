package pe.edu.cibertec.apprestventas.exception;

public class ResourceNotFoundException extends  RuntimeException{
    public ResourceNotFoundException(String mensaje){
        super(mensaje);
    }
}
