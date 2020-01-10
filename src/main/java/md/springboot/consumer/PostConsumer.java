package md.springboot.consumer;

import md.springboot.dto.Post;

import java.util.List;

public interface PostConsumer {

    List<Post> retrieve();

    Post retrieveById(Long id);
}