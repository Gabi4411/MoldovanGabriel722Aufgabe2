import Model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Repository<Produkten> produktenRepository = new Repository<>();
        Repository<Charakteren> charakterenRepository = new Repository<>();

        Controller controller = new Controller(produktenRepository, charakterenRepository);
        UI console = new UI(controller);

        // Initialisierung der Produkte
        List<Produkten> produkte = new ArrayList<>();
        produkte.add(new Produkten("Mjolnir", 500.0, "Asgard"));
        produkte.add(new Produkten("Vibranium-Schild", 700.0, "Wakanda"));
        produkte.add(new Produkten("Infinity Gauntlet", 10000.0, "Titan"));
        produkte.add(new Produkten("Web-Shooter", 250.0, "Terra"));
        produkte.add(new Produkten("Arc-Reaktor", 1500.0, "Terra"));
        produkte.add(new Produkten("Norn Stones", 1200.0, "Asgard"));
        produkte.add(new Produkten("Quantum Suit", 3000.0, "Terra"));
        produkte.add(new Produkten("X-Gene Serum", 850.0, "X-Mansion"));
        produkte.add(new Produkten("Cosmic Cube", 9000.0, "Multiverse"));
        produkte.add(new Produkten("Darkhold", 2000.0, "Multiverse"));

        // Initialisierung der Charaktere
        List<Charakteren> charaktere = new ArrayList<>();

        Charakteren c1 = new Charakteren(1, "Thor", "Asgard");
        c1.kaufeProduke(produkte.get(0)); // Mjolnir
        c1.kaufeProduke(produkte.get(5)); // Norn Stones
        c1.kaufeProduke(produkte.get(9)); // Darkhold

        Charakteren c2 = new Charakteren(2, "Black Panther", "Wakanda");
        c2.kaufeProduke(produkte.get(1)); // Vibranium-Schild
        c2.kaufeProduke(produkte.get(7)); // X-Gene Serum

        Charakteren c3 = new Charakteren(3, "Iron Man", "Terra");
        c3.kaufeProduke(produkte.get(4)); // Arc-Reaktor
        c3.kaufeProduke(produkte.get(6)); // Quantum Suit
        c3.kaufeProduke(produkte.get(3)); // Web-Shooter

        Charakteren c4 = new Charakteren(4, "Spider-Man", "Terra");
        c4.kaufeProduke(produkte.get(3)); // Web-Shooter
        c4.kaufeProduke(produkte.get(8)); // Cosmic Cube

        Charakteren c5 = new Charakteren(5, "Doctor Strange", "Multiverse");
        c5.kaufeProduke(produkte.get(9)); // Darkhold
        c5.kaufeProduke(produkte.get(8)); // Cosmic Cube
        c5.kaufeProduke(produkte.get(2)); // Infinity Gauntlet

        charaktere.add(c1);
        charaktere.add(c2);
        charaktere.add(c3);
        charaktere.add(c4);
        charaktere.add(c5);

        console.run();
    }
}