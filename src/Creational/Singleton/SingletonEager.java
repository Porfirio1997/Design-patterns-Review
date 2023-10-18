package Creational.Singleton;

// Cria a instância durante a inicialização do servidor de aplicação.
public class SingletonEager {

    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instance;
    }
}
