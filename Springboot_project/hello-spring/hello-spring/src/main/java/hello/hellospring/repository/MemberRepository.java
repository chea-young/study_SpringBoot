package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id); //id로 회원을 찾는 함수
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
