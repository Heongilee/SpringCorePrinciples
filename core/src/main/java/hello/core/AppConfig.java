package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberRepository;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    // memberRepository에 대한건 memoryMemberRepository를 쓸거야.
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    // 현재 나의 애플리케이션에서 memberService는 memberServiceImpl을 쓸거야.
    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    // discountPolicy에 대한건 정액할인정책(FixDiscountPolicy)를 쓸거야.
    @Bean
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
//        return new FixDiscountPolicy();
    }

    // 현재 나의 애플리케이션에서 orderService는 orderServiceImpl을 쓸거야.
    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }
}
