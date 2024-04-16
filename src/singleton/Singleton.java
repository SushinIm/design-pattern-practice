package singleton;

class Singleton {

    // 기본 생성자 접근 제한자 설정
    private Singleton() {}

    private static class SingletonInstanceHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    //getInstance 메서드 호출 시 싱글톤 객체 생성
    public static Singleton getInstance() {
        return SingletonInstanceHolder.INSTANCE;
    }
}
