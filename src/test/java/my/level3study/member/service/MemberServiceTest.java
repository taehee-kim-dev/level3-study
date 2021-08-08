package my.level3study.member.service;

import my.level3study.member.controller.dto.request.MemberRequest;
import my.level3study.member.controller.dto.response.MemberResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@ActiveProfiles("test")
@DisplayName("MemberService 테스트")
@SpringBootTest
class MemberServiceTest {

    @Autowired
    private MemberService memberService;

    @DisplayName("signup 테스트")
    @Test
    void signup() {
        //given
        String name = "inbi";
        String email = "inbi@email.com";
        MemberRequest memberRequest = new MemberRequest(name, email);

        //when
        MemberResponse memberResponse = memberService.signup(memberRequest);

        //then
        assertThat(memberResponse.getName()).isEqualTo(name);
        assertThat(memberResponse.getEmail()).isEqualTo(email);
    }
}