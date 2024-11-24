package pe.edu.cibertec.apprestventas.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
@Service
public interface IfileService {

    void guardarArchivo (MultipartFile file)
            throws Exception;
    void guardarArchivos (List<MultipartFile> files)
        throws Exception;
}
