package Creational.Singleton;

// melhor versão do singleton: Static factory, Lazy initialization and  Thread safe
// https://stackoverflow.com/questions/15019306/regarding-static-holder-singleton-pattern/24018148#24018148
public class SingletonLazyHolder {
    private static class InstanceHolder{
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }
    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstance(){
        return InstanceHolder.instance;
    }
}
