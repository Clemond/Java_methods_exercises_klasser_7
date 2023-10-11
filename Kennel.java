import java.util.Scanner;

public class Kennel {

    private Scanner myScanner = new Scanner(System.in);
    private Register registerOfDogs = new Register(); // Kolla hur den kopplas
    
    public void mainManu(){

        boolean runManu = true;

        do{

        System.out.println("Welcome to the kennal, please make a choice");

        System.out.println("1. Register new dog");
        System.out.println("2. List, tailleght"); // todo
        System.out.println("3. Delete dog");
        System.out.println("4. Exit program");
        int choice= myScanner.nextInt();
        

        switch(choice){
            case 1:
                registerOfDogs.addDog();
                break;
            case 3:
                registerOfDogs.deleteDog();
                break;

            case 4:   
                System.out.println("Programmet avslutas...");
                runManu = false;
                break;
        }

        }while(runManu);
    }

}
