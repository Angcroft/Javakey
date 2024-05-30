import java.util.Scanner;

public class JavaKey {
    public static void main(String[] args) {

        while(true) {
            Interfacer.welcomer();

            Scanner indexer = new Scanner(System.in);
            String index = indexer.nextLine();
            int indexnumber = Integer.parseInt(index);
            
            if(indexnumber < 1 || indexnumber > 3) {
                System.out.println("Invalid option. Please enter a correct number: ");
                continue;
            }

            if(indexnumber == 1) {
                int passwordLength = 16;
                String password = PasswordGenerator.generatePassword(passwordLength);
                System.out.println("Generated Password: " + password);
                break;
            }

            if(indexnumber == 2) {
                Interfacer.customizer();

                String indextwo = indexer.nextLine();
                int indexnumbertwo = Integer.parseInt(indextwo);

                if(indexnumbertwo < 1 || indexnumbertwo > 3) {
                    System.out.println("Invalid option. Please enter a correct number: ");
                    continue;
                }

                if(indexnumbertwo == 1) {
                    Interfacer.substracter();

                    String indexsub = indexer.nextLine();
                    int indexnumbersub = Integer.parseInt(indexsub);
                    
                    if(indexnumbersub < 1 || indexnumbersub > 4) {
                        System.out.println("Invalid option. Please enter a correct number: ");
                        continue;
                    }
                }

                if(indexnumbertwo == 2) {
                    Interfacer.adder();

                    String indexadd = indexer.nextLine();
                    int indexnumberadd = Integer.parseInt(indexadd);

                    if(indexnumberadd < 1 || indexnumberadd > 4) {
                        System.out.println("Invalid option. Please enter a correct number: ");
                    }
                }
            }

            if(indexnumber == 3) {
                System.exit(0);
            }
        }
    }
}