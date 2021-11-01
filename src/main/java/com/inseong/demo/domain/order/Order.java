package com.inseong.demo.domain.order;

import com.inseong.demo.domain.user.Person;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "orders")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Order {

    @Id
    @GeneratedValue
    long id;

    @ManyToOne
    Person person;

    @Column
    BigDecimal price;

}
