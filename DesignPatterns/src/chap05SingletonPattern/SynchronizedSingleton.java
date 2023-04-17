package chap05SingletonPattern;

public class SynchronizedSingleton {
    private static SynchronizedSingleton instance;

    private SynchronizedSingleton(){}

    public static synchronized SynchronizedSingleton getInstance() {    //동기화 추가, 속도 문제 발생
        if (instance == null) {
            instance = new SynchronizedSingleton();
        }
        return instance;
    }
}
