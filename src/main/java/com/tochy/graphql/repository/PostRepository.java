package com.tochy.graphql.repository;

import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;

import com.tochy.graphql.model.Post;

@Repository
public class PostRepository {
    
    private List<Post> posts = new ArrayList<>();

    public List<Post> findAll() {
        return posts;
    }

    public void save(Post post) {
        posts.add(post);
    }
}
