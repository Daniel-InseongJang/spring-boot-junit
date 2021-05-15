package com.inseong.demo.domain.user;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    private Long user_id;

    @Column(name = "user_key")
    private String user_key;


    @Column(name = "regist_date")
    private LocalDateTime regist_date;

    @Column(name = "update_date")
    private LocalDateTime update_date;


}
