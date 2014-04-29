package org.mael.spring.boot.web.repo;

import org.mael.spring.boot.web.model.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "authors")
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
