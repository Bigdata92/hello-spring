package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    // null 처리(java 8)
    Optional<Member> findById(Long id); // id로 member 검색
    Optional<Member> findByName(String name); // name로 member 검색
    List<Member> findAll(); // member 목록 전체
}
