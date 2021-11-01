package com.inseong.demo.domain.user;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@AllArgsConstructor
@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String phoneNum;

    @Column
    private LocalDateTime createdAt;

    @Column
    private LocalDateTime updateAt;


}
