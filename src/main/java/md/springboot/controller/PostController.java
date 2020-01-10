package md.springboot.controller;

import lombok.RequiredArgsConstructor;
import md.springboot.consumer.PostConsumer;
import md.springboot.dto.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
