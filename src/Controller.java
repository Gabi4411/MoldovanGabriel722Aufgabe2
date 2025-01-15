import Model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Controller {
    private Repository<Medikamenten> medikamentenRepository;
    private Repository<Patienten> patientenRepository;

    public Controller(Repository<Medikamenten> medikamentenRepository, Repository<Patienten> patientenRepository) {
        this.medikamentenRepository = medikamentenRepository;
        this.patientenRepository = patientenRepository;
    }

    public void allePatienten() {
        for (Patienten patienten : patientenRepository.getAllElements()) {
            System.out.println(patienten);
        }
    }

    public void alleMedikamenten() {
        for (Medikamenten medikamenten : medikamentenRepository.getAllElements()) {
            System.out.println(medikamenten);
        }
    }

    public void addPatient(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Id: ");
        int id = sc.nextInt();
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Alter: ");
        String alter = sc.nextLine();
        System.out.println("Diagnose: ");
        String diagnose = sc.nextLine();
        System.out.println("Medikamenten: (Stop when writin Stop!)");
        List<String> medikamenten= new ArrayList<>();
        while (true) {
            String input = sc.nextLine();

            if (input.equals("Stop")) {
                break;
            }

            medikamenten.add(input);
        }
        sc.nextLine();
        patientenRepository.addElement(new Patienten(name, id, alter, diagnose, medikamenten));
    }

    public void addMedikamente() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Preis: ");
        int preis = sc.nextInt();
        System.out.println("Krankenheit: ");
        String krankenheit = sc.nextLine();
        sc.nextLine();

        medikamentenRepository.addElement(new Medikamenten(name, preis, krankenheit));
    }

    public void getPatient() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        String name = sc.nextLine();
        sc.nextLine();
        int id = -1;
        for (Patienten p : patientenRepository.getAllElements()) {
            if(p.getName().equals(name)){
                id = patientenRepository.getAllElements().indexOf(p);
                break;
            }
        }
        System.out.println("Patient: " + patientenRepository.getElement(id));
    }

    public void getMedikamente() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        String name = sc.nextLine();
        sc.nextLine();
        int id = -1;
        for (Medikamenten m : medikamentenRepository.getAllElements()) {
            if(m.getName().equals(name)){
                id = medikamentenRepository.getAllElements().indexOf(m);
                break;
            }
        }
        System.out.println("Medikament: " + medikamentenRepository.getElement(id));
    }

    public void updatePatient() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name for patient you want to update: ");
        String name = sc.nextLine();
        System.out.println("Alter: ");
        String alter = sc.nextLine();
        System.out.println("Diagnose: ");
        String diagnose = sc.nextLine();
        System.out.println("Medikamenten: (Stop when writin Stop!)");
        List<String> medikamenten= new ArrayList<>();
        while (true) {
            String input = sc.nextLine();

            if (input.equals("Stop")) {
                break;
            }

            medikamenten.add(input);
        }
        sc.nextLine();
        for (Patienten p : patientenRepository.getAllElements()) {
            if(p.getName().equals(name)){
                int index = patientenRepository.getAllElements().indexOf(p);
                p.setAlter(alter);
                p.setDiagnose(diagnose);
                p.setMedikamenten(medikamenten);
                patientenRepository.updateElement(index, patientenRepository.getElement(index));
                break;
            }
        }
    }

    public void updateMedikament() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name for Medikament you want to update: ");
        String name = sc.nextLine();
        System.out.println("Preis: ");
        int preis = sc.nextInt();
        System.out.println("Krankenheit: ");
        String krankenheit = sc.nextLine();
        sc.nextLine();

        for (Medikamenten m : medikamentenRepository.getAllElements()) {
            if(m.getName().equals(name)) {
                int index = medikamentenRepository.getAllElements().indexOf(m);
                m.setKrankheit(krankenheit);
                m.setPreis(preis);
                medikamentenRepository.updateElement(index, medikamentenRepository.getElement(index));
                break;
            }
        }
    }

    public void deletePatient() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        String name = sc.nextLine();
        sc.nextLine();
        for (Patienten p : patientenRepository.getAllElements()) {
            if(p.getName().equals(name)){
                patientenRepository.remove(p);
                break;
            }
        }
    }

    public void deleteMedikamente() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        String name = sc.nextLine();
        sc.nextLine();
        for (Medikamenten m : medikamentenRepository.getAllElements()) {
            if(m.getName().equals(name)){
                medikamentenRepository.remove(m);
                break;
            }
        }
    }

//    public void sortMedikamentenPatient() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Name: ");
//        String name = sc.nextLine();
//        sc.nextLine();
//        Patienten patient;
//        for (Patienten p : patientenRepository.getAllElements()) {
//            if(p.getName().equals(name)){
//                int index = patientenRepository.getAllElements().indexOf(p);
//                patient = patientenRepository.getElement(index);
//            }
//        }
//        sc.nextLine();
//        System.out.println("How do you want the list to be sorted? 1 - Ascending, 2 - Descending");
//        int how = sc.nextInt();
//        List<String> medikaments = patient.getMedikamenten();
//
//        medikaments.sort();
//
//        if(how == 1) {
//            return medikaments;
//        }
//        else {
//            return medikaments.reversed();
//        }
//    }
}
