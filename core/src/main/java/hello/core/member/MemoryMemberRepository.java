package hello.core.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository {
    /*
        사실 실무의 경우, ConcurrentHashMap(java.util.concurrent.ConcurrentHashMap)을 쓰는 것이 좋다.
        멀티 스레드 환경에서 동시성(Concurrency)이슈 탓에 안전하지 않을 수 있기 때문이다.
    */
    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
