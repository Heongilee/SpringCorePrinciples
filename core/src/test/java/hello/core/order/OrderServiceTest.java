package hello.core.order;

import hello.core.member.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest{
    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder() {
        // long memberId = 1L; // Primitive type으로 안하는 이유는 null을 넣을 수 없기 때문이다.
        Long memberId = 1L;
        Member memberA = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(memberA);

        Order orderA = orderService.createOrder(memberId, "itemA", 10000);
        Assertions.assertThat(orderA.getDiscountPrice()).isEqualTo(1000);
    }

}
