package part3.chapter9.observer;

public class Main {
    public static void main(String[] args) {
        Feed f = new Feed();
        f.registerObserver(new NYTimes());
        f.registerObserver(new Guardian());
        f.registerObserver(new LeMonde());
        f.notifyObservers("The queen said her favourite book is Java 8 in Action!");

        //람다 표현식 사용
        Feed feed = new Feed();
        feed.registerObserver((String tweet)->{
            if(tweet != null && tweet.contains("money")){
                System.out.println("Breaking news in NY! " + tweet);
            }
        });
        feed.registerObserver((String tweet)->{
            if(tweet != null && tweet.contains("queen")){
                System.out.println("Yet another news in London... " + tweet);
            }
        });
        feed.registerObserver((String tweet)->{
            if(tweet != null && tweet.contains("wine")){
                System.out.println("Today cheese, wine and news! " + tweet);
            }
        });
        feed.notifyObservers("The queen said her favourite book is Java 8 in Action!");
    }
}
