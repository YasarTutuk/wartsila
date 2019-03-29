package com.wartsila.interview.Controller;

import com.wartsila.interview.Domain.BlogPost;
import com.wartsila.interview.Service.HttpClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class PostsController {

    private final HttpClient client;

    public PostsController(HttpClient client) {
        this. client = client;
    }

    @GetMapping("/posts")
    public ResponseEntity<List<BlogPost>> listPosts() {
        return ResponseEntity.ok(client.getPosts());
    }
}
