package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {
    MemberService memberService = new MemberServiceImpl();

    @Test
    void join() {
        //given (어떠한게 주어졌을 때...)
        Member memberA = new Member(1L, "memberA", Grade.VIP);

        //when (이렇게 했을때...)
        memberService.join(memberA);
        Member findMember = memberService.findMember(2L);

        //then (이렇게 된다...!) <- 검증
        Assertions.assertThat(memberA).isEqualTo(findMember);

    }
}
