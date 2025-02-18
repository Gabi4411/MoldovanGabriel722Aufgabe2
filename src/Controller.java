import Model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    private Repository<Produkten> produktenRepository;
    private Repository<Charakteren> charakterenRepository;

    public Controller(Repository<Produkten> produktenRepository, Repository<Charakteren> charakterenRepository) {
        this.produktenRepository = produktenRepository;
        this.charakterenRepository = charakterenRepository;
    }

    //Object 1 CRUD operations
    public void addObject1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        String name  = sc.nextLine();

        System.out.println("Price: ");
        int price = sc.nextInt();
        sc.nextLine();

        System.out.println("Universum: ");
        String universum = sc.nextLine();

        produktenRepository.addElement(new Produkten(name, price, universum));
    }

    public void showAllObject1() {
        for(Produkten produkten : produktenRepository.getAllElements()) {
            System.out.println(produkten);
        }
    }

    public void showObject1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        String name = sc.nextLine();
        sc.nextLine();
        int id = -1;
        for(Produkten p: produktenRepository.getAllElements()) {
            if(p.getName().equals(name)) {
                id = produktenRepository.getAllElements().indexOf(p);
                break;
            }
        }
        System.out.println("Patient: " + produktenRepository.getElement(id));
    }

    public void updateObject1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Price: ");
        int price = sc.nextInt();
        System.out.println("Universum: ");
        String universum = sc.nextLine();
        System.out.println("Medikamenten: (Stop when writin Stop!)");
        sc.nextLine();
        for (Produkten p : produktenRepository.getAllElements()) {
            if(p.getName().equals(name)){
                int index = produktenRepository.getAllElements().indexOf(p);
                p.setPrice(price);
                p.setUnisverum(universum);
                produktenRepository.updateElement(index, produktenRepository.getElement(index));
                break;
            }
        }
        System.out.println("Updated!\n");
    }

    public void deleteObject1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        String name = sc.nextLine();
        for (Produkten p : produktenRepository.getAllElements()) {
            if(p.getName().equals(name)){
                produktenRepository.remove(p);
                break;
            }
        }
        System.out.println("Deleted!\n");
    }

    //Object 2 CRUD operations
    public void addObject2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Id: ");
        int id  = sc.nextInt();
        sc.nextLine();

        System.out.println("Name: ");
        String name = sc.nextLine();

        System.out.println("Region: ");
        String region = sc.nextLine();

        List<String> produkts = new ArrayList<>();
        while (true) {
            String input = sc.nextLine();

            if (input.equals("Stop")) {
                break;
            }

            produkts.add(input);
        }
        sc.nextLine();

        charakterenRepository.addElement(new Charakteren(id, name, region, produkts));
    }

    public void showAllObject2() {
        for (Charakteren charakteren : charakterenRepository.getAllElements()) {
            System.out.println(charakteren);
        }
    }

    public void showObject2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        String name = sc.nextLine();
        sc.nextLine();
        int id = -1;
        for(Charakteren c: charakterenRepository.getAllElements()) {
            if(c.getName().equals(name)) {
                id = charakterenRepository.getAllElements().indexOf(c);
                break;
            }
        }
        System.out.println("Charakteren: " + produktenRepository.getElement(id));
    }

    public void updateObject2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Region: ");
        String region = sc.nextLine();
        System.out.println("Gekaufte Produkte: (Stop when writin Stop!)");
        List<String> produkts= new ArrayList<>();
        while (true) {
            String input = sc.nextLine();

            if (input.equals("Stop")) {
                break;
            }

            produkts.add(input);
        }
        sc.nextLine();
        for (Charakteren c : charakterenRepository.getAllElements()) {
            if(c.getName().equals(name)){
                int index = charakterenRepository.getAllElements().indexOf(c);
                c.setRegion(region);
                c.setGekauftenProdukte(produkts);
                charakterenRepository.updateElement(index, charakterenRepository.getElement(index));
                break;
            }
        }
        System.out.println("Updated!\n");
    }

    public void deleteObject2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        String name = sc.nextLine();
        for(Charakteren c : charakterenRepository.getAllElements()) {
            if(c.getName().equals(name)) {
                charakterenRepository.remove(c);
                break;
            }
        }
        System.out.println("Deleted!\n");
    }

    //Filters and sorting
    public void filterBy() {
        System.out.println("nothing");
    }

    public void filterBy1() {
        System.out.println("nothing");
    }

    public void sortBy() {
        System.out.println("nothing");
    }
}
