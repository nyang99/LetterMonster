package com.lemon.backend.domain.letter.dto.requestDto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
//@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class LetterCreateDto {

    //    private Integer sender;
//    private Integer receiver;
//    @Pattern(regexp = "^[^<>'\"&;#　]*$", message = "아래 특수 문자는 사용할 수 없습니다. <, >, ', \", &, ;, #, 　")
//    private Long id;
    @NotBlank(message = "편지 내용은 공백, 띄어쓰기로 만들 수 없습니다.")
    private String content;
    private Long characterMotionId;
    private Long sketchbookId;
//    private Long sketchbookcharactermotionId;

    public LetterCreateDto(String content, Long characterMotionId, Long sketchbookId) {
        this.content = content;
        this.characterMotionId = characterMotionId;
        this.sketchbookId = sketchbookId;
    }
}
