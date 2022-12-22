package hello.hellospring.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // JPA가 관리하는 Entity
public class Member {

    @Id // pk
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ID는 DB가 정함
    private Long id;    // 시스템이 정함
    private String name;    // 회원이 적음

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
