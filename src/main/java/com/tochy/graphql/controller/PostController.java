package com.tochy.graphql.controller;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.tochy.graphql.model.Post;
import com.tochy.graphql.repository.PostRepository;

@Controller
public class PostController {

    private final PostRepository postRepository;

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @QueryMapping
    public Iterable<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @QueryMapping    
    public Post createPost(@Argument Integer id, @Argument String title, @Argument String category, @Argument String data) {
        Post post = new Post(id, title, category, data);

        postRepository.save(post);

        return post;
    }

    @QueryMapping
    public String greeting(@Argument String name) {
        System.out.println("\n\nrequest-> " + name);
        return "Hello" + name;
    }
}
