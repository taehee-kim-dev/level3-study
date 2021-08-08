package my.level3study.member.service;

import lombok.RequiredArgsConstructor;
import my.level3study.member.controller.dto.request.MemberRequest;
import my.level3study.member.controller.dto.response.MemberResponse;
import my.level3study.member.domain.Member;
import my.level3study.member.domain.MemberRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public MemberResponse signup(MemberRequest memberRequest) {
        Member newMember = memberRequest.toEntity();
        Member savedMember = memberRepository.save(newMember);
        return MemberResponse.of(savedMember);
    }
}
