package pe.edu.cibertec.apprestventas.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Service
public class FileServices implements IfileService{
    private  final Path pathfolder = Paths.get("uploads");
    @Override
    public void guardarArchivo(MultipartFile file) throws Exception {
        Files.copy(file.getInputStream(), this.pathfolder.resolve(file.getOriginalFilename()));
    }

    @Override
    public void guardarArchivos(List<MultipartFile> files) throws Exception {
        for (MultipartFile file : files) {
            guardarArchivo(file);
        }
    }
}
