package org.example.demo.post;

import lombok.RequiredArgsConstructor;
import org.example.demo.post.model.PostDto;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public void create(PostDto.CreateReq dto) {
        postRepository.save(dto.toEntity());
    }
}
