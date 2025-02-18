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
        produktenRepository.addElement(new Produkten("Mjolnir", 500.0, "Asgard"));
        produktenRepository.addElement(new Produkten("Vibranium-Schild", 700.0, "Wakanda"));
        produktenRepository.addElement(new Produkten("Infinity Gauntlet", 10000.0, "Titan"));
        produktenRepository.addElement(new Produkten("Web-Shooter", 250.0, "Terra"));
        produktenRepository.addElement(new Produkten("Arc-Reaktor", 1500.0, "Terra"));
        produktenRepository.addElement(new Produkten("Norn Stones", 1200.0, "Asgard"));
        produktenRepository.addElement(new Produkten("Quantum Suit", 3000.0, "Terra"));
        produktenRepository.addElement(new Produkten("X-Gene Serum", 850.0, "X-Mansion"));
        produktenRepository.addElement(new Produkten("Cosmic Cube", 9000.0, "Multiverse"));
        produktenRepository.addElement(new Produkten("Darkhold", 2000.0, "Multiverse"));

        // Initialisierung der Charaktere

        Charakteren c1 = new Charakteren(1, "Thor", "Asgard");
        c1.kaufeProduke(produktenRepository.getElement(0)); // Mjolnir
        c1.kaufeProduke(produktenRepository.getElement(5)); // Norn Stones
        c1.kaufeProduke(produktenRepository.getElement(9)); // Darkhold

        Charakteren c2 = new Charakteren(2, "Black Panther", "Wakanda");
        c2.kaufeProduke(produktenRepository.getElement(1)); // Vibranium-Schild
        c2.kaufeProduke(produktenRepository.getElement(7)); // X-Gene Serum

        Charakteren c3 = new Charakteren(3, "Iron Man", "Terra");
        c3.kaufeProduke(produktenRepository.getElement(4)); // Arc-Reaktor
        c3.kaufeProduke(produktenRepository.getElement(6)); // Quantum Suit
        c3.kaufeProduke(produktenRepository.getElement(3)); // Web-Shooter

        charakterenRepository.addElement(c1);
        charakterenRepository.addElement(c2);
        charakterenRepository.addElement(c3);

        console.run();
    }
}