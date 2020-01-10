package md.springboot.consumer.resttemplate;

import lombok.RequiredArgsConstructor;
import md.springboot.consumer.PostConsumer;
import md.springboot.dto.Post;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class PostConsumerRT implements PostConsumer {

    @Value("${consume.rest.api.url}")
    private String url;

    private final RestTemplate restTemplate;

    @Override
    public List<Post> retrieve() {
        return Arrays.asList(restTemplate.getForObject(url, Post[].class));
    }

    @Override
    public Post retrieveById(Long id) {
        return restTemplate.getForObject(url + "/{id}", Post.class, id);
    }
}
