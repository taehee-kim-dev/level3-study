package my.level3study.member.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;


@DisplayName("MemberRepository 테스트")
@DataJpaTest
class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;

    @DisplayName("save 테스트")
    @Test
    void save() {
        //given
        String name = "inbi";
        String email = "inbi@email.com";
        Member member = Member.builder()
                .name(name)
                .email(email)
                .build();

        //when
        Member savedMember = memberRepository.save(member);

        //then
        assertThat(savedMember.getName()).isEqualTo(name);
        assertThat(savedMember.getEmail()).isEqualTo(email);
    }
}