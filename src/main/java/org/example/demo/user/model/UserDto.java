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
}
