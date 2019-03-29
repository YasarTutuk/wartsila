package com.wartsila.interview.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wartsila.interview.Domain.BlogPost;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class HttpClient {
    OkHttpClient client = new OkHttpClient();
    ObjectMapper mapper = new ObjectMapper();

    public List<BlogPost> getPosts() {
        Request request = new Request.Builder()
                .url("https://jsonplaceholder.typicode.com/posts")
                .build();
        Response response;
        try {
            response = client.newCall(request).execute();
            String body = response.body().string();

            List<BlogPost> posts = mapper.readValue(body, new TypeReference<List<BlogPost>>(){});
            return posts;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<BlogPost>();
    }
}
