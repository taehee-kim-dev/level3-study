package my.level3study.controller;


import lombok.RequiredArgsConstructor;
import my.level3study.controller.dto.request.MemberRequest;
import my.level3study.controller.dto.response.MemberResponse;
import my.level3study.service.MemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/")
    public String home() {
        return "Hello!! 홈 화면입니다.";
    }

    @PostMapping("/members")
    public MemberResponse create(@RequestBody MemberRequest memberRequest) {
        return memberService.signup(memberRequest);
    }
}
