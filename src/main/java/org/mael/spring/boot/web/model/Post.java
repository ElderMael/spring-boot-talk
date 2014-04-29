package org.mael.spring.boot.web.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Post {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String content;

    private Date postedAt;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    public Post() {
    }

    public Post(Long id, String title, String content, Date postedAt, Author author) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.postedAt = postedAt;
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Post)) return false;

        Post post = (Post) o;

        if (!author.equals(post.author)) return false;
        if (!postedAt.equals(post.postedAt)) return false;
        if (!title.equals(post.title)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + postedAt.hashCode();
        result = 31 * result + author.hashCode();
        return result;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPostedAt() {
        return postedAt;
    }

    public void setPostedAt(Date postedAt) {
        this.postedAt = postedAt;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
