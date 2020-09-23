package org.sid.lightecom.dao;

import org.sid.lightecom.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;

@RepositoryRestResource
public interface CategoryRepository extends JpaRepository<Category,Long> {

}
