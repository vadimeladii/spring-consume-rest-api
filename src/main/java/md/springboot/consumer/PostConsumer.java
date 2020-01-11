package md.springboot.consumer;

import md.springboot.dto.Post;

import java.util.List;

public interface PostConsumer {

    List<Post> retrieve();

    Post retrieveById(Long id);

    void update(Long id, Post post);

    void delete(Long id);

    void create(Post post);
}
