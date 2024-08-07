package part3.chapter9.observer;

public interface Subject {
    void registerObserver(Observer o);
    void notifyObservers(String tweet);
}
