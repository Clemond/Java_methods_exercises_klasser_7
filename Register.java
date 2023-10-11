import java.util.ArrayList;
import java.util.Scanner;

public class Register {
    
    private Scanner myScanner = new Scanner(System.in);
    ArrayList<Dog> listOfDogs = new ArrayList<>();

    public void addDog(){

        System.out.println("Register a new dog");
         System.out.println("What is the name of the dog?");
        String name = myScanner.nextLine();
         System.out.println("What is the race of the dog?");
        String race = myScanner.nextLine();
         System.out.println("What is the age of the dog?");
        double age = myScanner.nextDouble();
         System.out.println("What is the weight of the dog?");
        double weight = myScanner.nextDouble();

        listOfDogs.add(new Dog(name,race,age,weight));

        System.out.println("Funkar det?");
        for(int i = 0; i < listOfDogs.size(); i++){
            System.out.println(listOfDogs.get(i));
        }

    }

    public void deleteDog(){

        System.out.println("enter the name of the dog you want to delete from the register: ");
        String enterName = myScanner.nextLine();

        for(int i = 0; i < listOfDogs.size(); i++){

            if(enterName.equalsIgnoreCase(listOfDogs.get(i).getName())){
                listOfDogs.remove(i);
                System.out.println("Dog deleted");
            }
            else{
                System.out.println("Dog doesnt exist");
            }
        }

    }

}
