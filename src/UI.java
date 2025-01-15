import Model.Medikamenten;
import Model.Patienten;

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
                    2. Patiente 
                    3. Medikamente
                    0. Exit""");

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1: {
                    controller.alleMedikamenten();
                    controller.allePatienten();
                    break;
                }

                case 2: {
                    System.out.println("""
                            1. Neues Patient hinzufugen
                            2. Alle Patient sehen
                            3. Ein bestimmtes Patient finden
                            4. Ein Patient aktualisieren
                            5. Ein Patient loschen
                            0. Exit""");
                    int crudOption = sc.nextInt();
                    sc.nextLine();
                    switch (crudOption) {
                        case 1: {
                            controller.addPatient();
                            break;
                        }
                        case 2: {
                            controller.allePatienten();
                            break;
                        }
                        case 3: {
                            controller.getPatient();
                            break;
                        }
                        case 4: {
                            controller.updatePatient();
                            break;
                        }
                        case 5: {
                            controller.deletePatient();
                            break;
                        }
                        case 0:
                            break;
                    }
                }

                case 3: {
                    System.out.println("""
                            1. Neuer Medikament hinzufugen
                            2. Alle Medikamente sehen
                            3. Einen bestimmten Medikament finden
                            4. Einen Medikament aktualisieren
                            5. Einen Medikament loschen
                            6. Kunden nach Ort filtrieren
                            7. Kunden finden, die ein Produkt in einer gegebenen Jahreszeit gekauft haben
                            8. Sortiere Produkte eines Kunden nach Preis
                            0. Exit""");
                    int crudOption = sc.nextInt();
                    sc.nextLine();
                    switch (crudOption) {
                        case 1: {
                            controller.addMedikamente();
                            break;
                        }
                        case 2: {
                            controller.alleMedikamenten();
                            break;
                        }
                        case 3: {
                            controller.getMedikamente();
                            break;
                        }
                        case 4: {
                            controller.updateMedikament();
                            break;
                        }
                        case 5: {
                            controller.deleteMedikamente();
                            break;
                        }
                        case 0:
                            break;
                    }
                }
                case 0:
                    break;
            }
        }
    }
}

public void main(String[] args) {

    Repository<Patienten> patientenRepository = new Repository<>();
    Repository<Medikamenten> medikamentenRepository = new Repository<>();

    UI console = new UI();

    Controller controller = new Controller(medikamentenRepository, patientenRepository);
    console = new UI(controller);

    console.run();
}

