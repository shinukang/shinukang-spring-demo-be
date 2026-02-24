package org.example.demo.post.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class PostDto {

    @Getter
    @AllArgsConstructor
    public static class CreateReq {
        private String title;
        private String contents;

        public Post toEntity() {
            return Post.builder()
                    .title(this.title)
                    .contents(this.contents)
                    .build();
        }
    }
}
