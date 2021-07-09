package hello.core.member;

import hello.core.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {
    MemberService memberService;

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    @Test
    void join() {
        //given (어떠한게 주어졌을 때...)
        Member memberA = new Member(1L, "memberA", Grade.VIP);

        //when (이렇게 했을때...)
        memberService.join(memberA);
        Member findMember = memberService.findMember(1L);

        //then (이렇게 된다...!) <- 검증
        Assertions.assertThat(memberA).isEqualTo(findMember);

    }
}
