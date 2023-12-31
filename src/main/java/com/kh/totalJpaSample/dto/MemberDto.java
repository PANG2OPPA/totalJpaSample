package com.kh.totalJpaSample.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
// Data Transfer Object : 계층간 데이터를 전송하기 위한 객체, 주로 프론트앤드와 JSON으로 통신하기 위한 존재
// 요청과 응답에 대한 객체
public class MemberDto {
    private String email;
    private String name;
    private String password;
    private LocalDateTime regDate;
}
