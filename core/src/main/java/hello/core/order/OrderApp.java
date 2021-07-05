package hello.core.order;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member memberA = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(memberA);

        Order orderA = orderService.createOrder(memberId, "itemA", 10000);
        System.out.println("orderA = " + orderA);
        System.out.println("orderA.calculatePrice() = " + orderA.calculatePrice());

    }
}
