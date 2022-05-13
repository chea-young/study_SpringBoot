package springboot.practice01.lchy.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Member {
    @Id
    @GeneratedValue
    @Column(name = "member_id") //PK id로
    private Long id;
    private String name;

    @Embedded //내장 타입을 사용할 때 사용
    private Address address;

    @OneToMany(mappedBy = "member") //자신이 연관관계의 주인이 아니라는 의미
    private List<Order> orders = new ArrayList<>();
}
