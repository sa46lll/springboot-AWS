package com.sall.book.springbook.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter                     // 모든 필드의 get 메소드 생성
@RequiredArgsConstructor    // final 필드의 생성자 생성
public class HelloResponseDto {

    private final String name;
    private final int amount;
}
