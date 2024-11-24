package pe.edu.cibertec.apprestventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.apprestventas.model.bd.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    /*@Modifying
    @Query(value = "UPDATE categories Set categoryname = :categoryname where categoryid =:cateoryid", nativeQuery = true)
    void actualizarNombreCategoria(@Param("categoryid") Integer id, @Param("categoryname") String nombreCategoria);*/
}
