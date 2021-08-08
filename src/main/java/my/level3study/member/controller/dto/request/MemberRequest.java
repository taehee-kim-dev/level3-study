package my.level3study.member.controller.dto.request;

import lombok.*;
import my.level3study.member.domain.Member;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberRequest {

    private String name;
    private String email;

    public Member toEntity() {
        return Member.builder()
                .name(name)
                .email(email)
                .build();
    }
}
