package pe.edu.cibertec.apprestventas.service;

import pe.edu.cibertec.apprestventas.model.bd.Category;

import java.util.List;
import java.util.Optional;

public interface ICategoryService {
    List<Category> findAll();
    Optional<Category> findById(int id);
    Category save(Category category);
    void delete(int id);
}