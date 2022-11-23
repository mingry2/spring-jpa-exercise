package com.jpa.exercise.domain.dto;

import com.jpa.exercise.domain.Book;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.Id;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BookResponse {
        @Id
        private Long bookId;
        private String bookName;
        private String authorName;

        public static BookResponse of(Book book, String authorName) {
                return BookResponse.builder()
                        .bookId(book.getId())
                        .bookName(book.getName())
                        .authorName(authorName)
                        .build();
        }
}

