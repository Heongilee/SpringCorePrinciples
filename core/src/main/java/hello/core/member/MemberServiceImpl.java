package hello.core.member;

public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    /*
        다형성(Polymorphism)에 의해서
        역할 MemberRepository을 구현한 MemoryMemberRepository의 구현체의 오버라이드한 메서드가 실행될 것이다.
     */
    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        memberRepository.findById(memberId);
    }
}
