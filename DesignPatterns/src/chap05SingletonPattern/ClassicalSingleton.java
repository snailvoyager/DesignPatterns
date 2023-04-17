package chap05SingletonPattern;

public class ClassicalSingleton {
    private static ClassicalSingleton instance;     //유일한 인스턴스를 저장하는 정적 변수

    private ClassicalSingleton(){}      //외부에서 생성 불가능

    public static ClassicalSingleton getInstance() {       //유일한 인스턴스를 반환하는 정적 메소드
        if (instance == null) {
            instance = new ClassicalSingleton();    //게이른 인스턴스 생성
        }
        return instance;
    }
}
