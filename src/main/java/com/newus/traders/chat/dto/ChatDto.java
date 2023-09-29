/**
 * @author hyunseul
 * @create date 2023-09-26 17:02:45
 * @modify date 2023-09-26 17:02:45
 */
package com.newus.traders.chat.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "chat")
public class ChatDto {
    private String id; // 메시지 고유 식별자 (예: MongoDB ObjectId)
    private String text; // 메시지 내용
    private String sender; // 보낸 사람의 사용자명
    private String roomNum; // 방 번호
    private LocalDateTime createdAt; // 메시지 생성 시간
}