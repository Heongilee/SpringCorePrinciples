package hello.core.order;

import hello.core.AppConfig;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        // MemberService memberService = new MemberServiceImpl(null);
        MemberService memberService = appConfig.memberService();
        // OrderService orderService = new OrderServiceImpl(null, null);
        OrderService orderService = appConfig.orderService();

        Long memberId = 1L;
        Member memberA = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(memberA);

        Order orderA = orderService.createOrder(memberId, "itemA", 20000);
        System.out.println("orderA = " + orderA);
        System.out.println("orderA.calculatePrice() = " + orderA.calculatePrice());

    }
}
