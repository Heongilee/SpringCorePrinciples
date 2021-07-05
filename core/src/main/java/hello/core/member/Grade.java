package hello.core.member;
/*
* <열거형 타입의 장점>
*
* 1. 문자열과 비교해 IDE의 지원을 받을 수 있다. (자동완성, 오타 검증, 텍스트 리팩토링)
* 2. 허용 가능한 값들을 제한
* 3. 리팩토링 시 변경 범위가 최소화 된다. (내용 추가가 필요해도 Enum 코드 외에 수정할 필요가 없다.)
* */
public enum Grade {
    BASIC,
    VIP
}
