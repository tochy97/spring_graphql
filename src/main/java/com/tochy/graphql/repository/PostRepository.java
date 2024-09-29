package com.tochy.graphql.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.tochy.graphql.model.Post;

@Repository
public interface PostRepository extends CrudRepository<Post, Integer> {
    
    @Override
    public List<Post> findAll();

}
