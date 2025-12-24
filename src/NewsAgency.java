import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private List<Observer> subscribers = new ArrayList<>();
    private String latestNews;

    public void subscribe(Observer observer) {
        if (!subscribers.contains(observer)) {
            subscribers.add(observer);
            System.out.println(observer.getName() + " subscribed successfully.");
        }
    }

    public void unsubscribe(Observer observer) {
        if (subscribers.remove(observer)) {
            System.out.println(observer.getName() + " unsubscribed.");
        }
    }

    public void publishNews(String news) {
        this.latestNews = news;
        System.out.println("\n[BREAKING NEWS] " + news + "\n");
        notifySubscribers();
    }

    private void notifySubscribers() {
        for (Observer subscriber : subscribers) {
            subscriber.update(latestNews);
        }
    }
}