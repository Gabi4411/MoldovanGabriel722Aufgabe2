import java.util.Scanner;

public class UI {

    private Controller controller;

    public UI(Controller controller) {
        this.controller = controller;
    }

    public UI() {}

    public void run() {
        Scanner sc = new Scanner(System.in);
        int option = -1;
        while (option != 0) {
            System.out.println("""
                    1. Alles anschreiben
                    2. Produkten 
                    3. Charakteren
                    0. Exit""");

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1 -> {
                    controller.showAllObject1();
                    controller.showAllObject2();
                }
                case 2 -> object1Menu(sc);
                case 3 -> object2Menu(sc);
                case 0 -> System.out.println("Exiting...");
            }
        }
    }

    private void object1Menu(Scanner sc) {
        System.out.println("""
                1. Add
                2. Show all
                3. Show
                4. Update
                5. Delete
                0. Exit""");

        int crudOption = sc.nextInt();
        sc.nextLine();
        switch (crudOption) {
            case 1 -> controller.addObject1();
            case 2 -> controller.showAllObject1();
            case 3 -> controller.showObject1();
            case 4 -> controller.updateObject1();
            case 5 -> controller.deleteObject1();
            case 0 -> {
                return;
            }
        }
    }

    private void object2Menu(Scanner sc) {
        System.out.println("""
                1. Add
                2. Show all
                3. Show
                4. Update
                5. Delete
                6. Filter by
                7. Filter by
                8. Sort by
                0. Exit""");

        int crudOption = sc.nextInt();
        sc.nextLine();
        switch (crudOption) {
            case 1 -> controller.addObject2();
            case 2 -> controller.showAllObject2();
            case 3 -> controller.showObject2();
            case 4 -> controller.updateObject2();
            case 5 -> controller.deleteObject2();
            case 6 -> controller.filterBy();
            case 7 -> controller.filterBy1();
            case 8 -> controller.sortBy();
            case 0 -> {
                return;
            }
        }
    }
}
