package md.springboot.controller;

import lombok.RequiredArgsConstructor;
import md.springboot.consumer.PostConsumer;
import md.springboot.dto.Post;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("post")
@RequiredArgsConstructor
public class PostController {

    private final PostConsumer consumer;

    @GetMapping
    public List<Post> retrieve() {
        return consumer.retrieve();
    }

    @GetMapping("{id}")
    public Post retrieveById(@PathVariable("id") Long id) {
        return consumer.retrieveById(id);
    }

    @PutMapping("{id}")
    public void update(@PathVariable("id") Long id, Post post) {
        consumer.update(id, post);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Long id) {
        consumer.delete(id);
    }
}
