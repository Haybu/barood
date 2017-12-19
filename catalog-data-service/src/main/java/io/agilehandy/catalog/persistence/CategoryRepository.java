package io.agilehandy.catalog.persistence;

import io.agilehandy.catalog.entities.Category;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource(collectionResourceRel = "category", path = "category")
public interface CategoryRepository extends PagingAndSortingRepository<Category, Integer> {

    List<Category> findByName(@Param("name") String name);
}
