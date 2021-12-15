package hello.core.singleton;

public class SingletonService {
    // static 키워드를 통해 클래스 레벨로 올려서 해당 인스턴스는 공유됨을 나타냄.
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {}

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
