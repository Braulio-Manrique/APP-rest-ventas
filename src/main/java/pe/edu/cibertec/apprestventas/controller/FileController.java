package pe.edu.cibertec.apprestventas.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import pe.edu.cibertec.apprestventas.dto.ArchivoDto;
import pe.edu.cibertec.apprestventas.service.IfileService;

import java.io.IOException;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/file")
public class FileController {
    private final IfileService ifileService;

    @PostMapping
    public ResponseEntity<ArchivoDto> subirArchivo(@RequestParam("files") List<MultipartFile> files) throws Exception {
        ifileService.guardarArchivos(files);
        return ResponseEntity.ok().build();
    }
}
