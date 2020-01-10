package md.springboot.consumer.resttemplate.impl;

import lombok.RequiredArgsConstructor;
import md.springboot.consumer.resttemplate.PostConsumer;
import md.springboot.dto.Post;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class PostConsumerImpl implements PostConsumer {

    @Value("${consume.rest.api.url}")
    private String url;

    private final RestTemplate restTemplate;

    @Override
    public List<Post> retrieve() {
        return Arrays.asList(restTemplate.getForObject(url, Post[].class));
    }
}
