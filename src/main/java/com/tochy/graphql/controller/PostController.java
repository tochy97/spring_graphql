package com.tochy.graphql.controller;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.tochy.graphql.model.Post;
import com.tochy.graphql.service.PostService;

@Controller
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @QueryMapping
    public Iterable<Post> getAllPosts() {
        return postService.findAll();
    }

    @MutationMapping    
    public Post createPost(@Argument Integer id, @Argument String title, @Argument String category, @Argument String info) {
        Post post = new Post(id, title, category, info);
        postService.save(post);

        return post;
    }

    @QueryMapping
    public String greeting(@Argument String name) {
        return "Hello" + name;
    }
}
