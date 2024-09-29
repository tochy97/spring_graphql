package com.tochy.graphql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tochy.graphql.model.Post;
import com.tochy.graphql.repository.PostRepository;

@Service
public class PostService implements PostInterface {
    
    @Autowired
    PostRepository postRepository;

    @Override
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    @Override
    public Post save(Post post) {
        return postRepository.save(post);
    }
}
