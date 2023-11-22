package com.kh.totalJpaSample.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cart_id")
    private Long id;

    private String cartName;

    @OneToOne // 회원 엔티티와 일대일 매핑
    @JoinColumn(name = "member_id")
    private Member member;
}
