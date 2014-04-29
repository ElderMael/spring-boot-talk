package org.mael.spring.boot.web.util;

import org.mael.spring.boot.web.model.Author;
import org.mael.spring.boot.web.model.Post;
import org.mael.spring.boot.web.repo.AuthorRepository;
import org.mael.spring.boot.web.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Date;

@Component
public class DataBootstrapper {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private PostRepository postRepository;

    public DataBootstrapper() {
    }

    @PostConstruct
    public void loadData() {

        Author micky = new Author(null, "Miguel", "Code Necromancer", null);

        authorRepository.save(micky);

        Post post = new Post(null, "Hello, World!", "Lorem Ipsum", new Date(), micky);

        postRepository.save(post);

    }
}
