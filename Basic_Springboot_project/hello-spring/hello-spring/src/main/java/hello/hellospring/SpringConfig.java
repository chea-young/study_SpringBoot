package hello.hellospring;

import hello.hellospring.repository.*;
//import hello.hellospring.repository.JdbcTemplateMemberRepository;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Configuration
public class SpringConfig {
    /*
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }*/
    //private final DataSource dataSource;
    //private final EntityManager em;
    private final MemberRepository memberRepository;

    /*@Autowired
    public SpringConfig(DataSource dataSource, EntityManager em) {
        this.dataSource = dataSource;
        this.em = em;
    }*/
    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }

//    @Bean
 //   public MemberRepository memberRepository() {
        // return new MemoryMemberRepository();
        // return new JdbcMemberRepository(dataSource);
        // return new JpaMemberRepository(em);
 //       return new MemberService();
 //   }
}
