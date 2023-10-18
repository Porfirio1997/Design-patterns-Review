package Creational.Singleton;

// Cria a instância apenas no momento da primeira utilização.
public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstance(){
        if(instance == null) instance = new SingletonLazy();
        return instance;
    }

}
