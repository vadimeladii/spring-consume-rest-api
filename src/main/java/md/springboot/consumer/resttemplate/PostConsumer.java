package md.springboot.consumer.resttemplate;

import md.springboot.dto.Post;

import java.util.List;

public interface PostConsumer {

    List<Post> retrieve();
}
