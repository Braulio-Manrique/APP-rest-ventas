package pe.edu.cibertec.apprestventas.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;
@Builder
@Data
public class MensajeErrorDto {
    private Integer  cddigoEstado;
    private Date fechaError;
    private String mensaje;
    private String descripcion;
}
