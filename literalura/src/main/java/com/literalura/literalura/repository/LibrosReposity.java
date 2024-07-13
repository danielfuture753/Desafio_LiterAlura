package com.literalura.literalura.repository;

import com.literalura.literalura.model.Autor;
import com.literalura.literalura.model.Idioma;
import com.literalura.literalura.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LibrosReposity extends JpaRepository<Libro, Long> {

    List<Libro> findByIdiomas(Idioma idioma);

    List<Libro> findTop5ByOrderByNumeroDeDescargasDesc();
    @Query("SELECT l FROM Libro a JOIN a.autor l")
    List<Autor> mostrarAutores();

    @Query("SELECT l FROM Libro a JOIN a.autor l WHERE l.fechaDeNacimiento <= :anio AND l.fechadeMuerte >= :anio")
    List<Autor> mostrarAutoresVivos(String anio);

}
