package org.mael.spring.boot.web.repo;

import org.mael.spring.boot.web.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "posts")
public interface PostRepository extends CrudRepository<Post, Long> {

}
