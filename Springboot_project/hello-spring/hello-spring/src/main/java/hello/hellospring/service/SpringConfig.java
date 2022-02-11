package hello.hellospring.service;

import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() { //@Service 대신 등록
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() { //Repository 대신 등록록
       return new MemoryMemberRepository();
    }
}
