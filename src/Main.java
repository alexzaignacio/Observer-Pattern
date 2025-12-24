public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        Subscriber alice = new Subscriber("Alice (Phone App)");
        Subscriber bob = new Subscriber("Bob (Website)");
        Subscriber charlie = new Subscriber("Charlie (TV Station)");

        // Subscribe
        agency.subscribe(alice);
        agency.subscribe(bob);
        agency.subscribe(charlie);

        // Publish news
        agency.publishNews("Earthquake hits Pacific coast!");

        // Charlie unsubscribes
        agency.unsubscribe(charlie);

        // New breaking news
        agency.publishNews("Peace treaty signed in Geneva!");
    }
}