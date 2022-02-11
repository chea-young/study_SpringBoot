package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    private final MemberService memberService; // 하나면 등록하고 쓰면 되기 때문에 new 객체로 생성할 필요가 없음.

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}

