package com.library.controller;

import com.library.model.Member;
import com.library.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/members")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @PostMapping
    public Mono<Member> createMember(@RequestBody Member member) {
        return memberService.createMember(member);
    }

    @GetMapping
    public Flux<Member> getAllMembers() {
        return memberService.getAllMembers();
    }
}
