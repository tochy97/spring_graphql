package com.tochy.graphql.service;

import java.util.List;

import com.tochy.graphql.model.Post;

public interface PostInterface {
    
    List<Post> findAll();

    Post save(Post post);
}
