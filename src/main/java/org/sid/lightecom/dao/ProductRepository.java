package org.sid.lightecom.dao;

import org.sid.lightecom.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

/**
 * Cette classe implémente l'interface générique fournie par Spring Data, plus besoins de la crée et on vera avec
 * l'injection des dépendances qu'il n'y a même plus besoins de créer des classes qui implémente cette interface @Autowired
 */
@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product,Long> {
    @RestResource(path = "/selectedProducts")
    public List<Product> findBySelectedIsTrue();
}

