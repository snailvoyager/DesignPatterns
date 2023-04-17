package chap05SingletonPattern;

public class StaticInitializerSingleton {
    private static StaticInitializerSingleton instance = new StaticInitializerSingleton();  //정적 초기화 부분에서 생성
    private StaticInitializerSingleton(){}

    public static StaticInitializerSingleton getInstance() {
        return instance;
    }
}
