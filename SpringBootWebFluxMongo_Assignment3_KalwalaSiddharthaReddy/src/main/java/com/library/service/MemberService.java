package com.library.service;

import com.library.model.Member;
import com.library.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public Mono<Member> createMember(Member member) {
        return memberRepository.save(member);
    }

    public Flux<Member> getAllMembers() {
        return memberRepository.findAll();
    }
}

