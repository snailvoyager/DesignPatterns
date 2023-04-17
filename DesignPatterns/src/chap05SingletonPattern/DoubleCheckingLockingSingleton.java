package chap05SingletonPattern;

public class DoubleCheckingLockingSingleton {
    private volatile static DoubleCheckingLockingSingleton instance;    //volatile 키워드 jdk 1.5 이상

    private DoubleCheckingLockingSingleton(){}

    public static DoubleCheckingLockingSingleton getInstance() {
        if (instance == null) {     //인스턴스가 없을 때 동기화 블럭 진입
            synchronized (DoubleCheckingLockingSingleton.class) {
                if (instance == null) {     //동기화 블럭 내에서 다시 한번 체크
                    instance = new DoubleCheckingLockingSingleton();
                }
            }
        }
        return instance;
    }
}
