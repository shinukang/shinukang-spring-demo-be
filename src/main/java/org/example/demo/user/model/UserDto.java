package org.example.demo.user.model;

import lombok.*;

public class UserDto {

    @Getter
    @AllArgsConstructor
    public static class SignupReq {
        private String name;
        private String email;
        @Setter
        private String password;

        public User toEntity() {
            return User.builder()
                    .name(this.name)
                    .email(this.email)
                    .password(this.password)
                    .build();
        }
    }

    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class LoginReq {
        private String email;
        private String password;
    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class LoginRes {
        private Long id;
        private String name;
        private String role;

        public static LoginRes fromEntity(User entity) {
            return LoginRes.builder()
                    .id(entity.getId())
                    .name(entity.getName())
                    .role(entity.getRole())
                    .build();
        }
    }
}
