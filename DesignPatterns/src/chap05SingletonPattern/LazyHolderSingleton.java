package chap05SingletonPattern;

public class LazyHolderSingleton {
    private LazyHolderSingleton(){}

    public LazyHolderSingleton getInstance() {
        return LazyHolder.INSTANCE;     //LazyHolder.INSTANCE를 참조하는 순간 Class가 로딩되며 초기화가 진행
    }

    private static class LazyHolder {
        private static final LazyHolderSingleton INSTANCE = new LazyHolderSingleton();  // Class를 로딩하고 초기화하는 시점은 thread-safe
    }
}
