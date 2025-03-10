package com.lemon.backend.domain.friend.dto.response;

import com.lemon.backend.domain.users.user.dto.response.UserGetDto;
import com.lemon.backend.domain.users.user.entity.Users;
import lombok.*;

@Getter
@Setter(AccessLevel.PACKAGE)
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class FriendResponseDto {
    private Integer id;
    private String nickname;
    private String nicknameTag;
    private Boolean isFriend;

    public FriendResponseDto(Integer id, String nickname, String nicknameTag) {
        this.id = id;
        this.nickname = nickname;
        this.nicknameTag = nicknameTag;
    }


    public FriendResponseDto(String nickname, String nicknameTag) {
        this.nickname = nickname;
        this.nicknameTag = nicknameTag;
    }
}
