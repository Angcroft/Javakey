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
                
                Interfacer.passGenerated();

                String indexnew = indexer.nextLine();
                int indexnewnumb = Integer.parseInt(indexnew);

                if(indexnewnumb < 1 || indexnewnumb > 3) {
                    System.out.println("Invalid option. Please enter a correct number: ");
                    continue;
                }

                if(indexnewnumb == 1) {

                } else if(indexnewnumb == 2) {

                } else if(indexnewnumb == 3) {
                    System.exit(0);
                }
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

                    if(indexnumbersub == 1) {
                        System.out.println("Now enter the uppercases you want to remove: ");

                        String upperCasers = indexer.nextLine();
                        
                        PasswordGenerator.UPPER.replace(upperCasers, "");
                        

                    } else if (indexnumbersub == 2) {
                        System.out.println("Now enter the lowercases you want to remove: ");

                        String lowerCasers = indexer.nextLine();

                        PasswordGenerator.LOWER.replace(lowerCasers, "");

                    } else if (indexnumbersub == 3) {
                        System.out.println("Now enter the digits you want to remove: ");

                        String digiters = indexer.nextLine();

                        PasswordGenerator.DIGITS.replace(digiters, "");

                    } else if (indexnumbersub == 4) {
                        System.out.println("Now enter the special characters you want to remove: ");

                        String spcharacters = indexer.nextLine();

                        PasswordGenerator.SPECIAL.replace(spcharacters, "");

                    }
                }

                if(indexnumbertwo == 2) {
                    Interfacer.adder();

                    String indexadd = indexer.nextLine();
                    int indexnumberadd = Integer.parseInt(indexadd);

                    if(indexnumberadd < 1 || indexnumberadd > 4) {
                        System.out.println("Invalid option. Please enter a correct number: ");
                        continue;
                    }

                    if(indexnumberadd == 1) {
                        StringBuilder new_upper = new StringBuilder(PasswordGenerator.UPPER);
                        System.out.println("Now enter the uppercases you want to add: ");

                        String upperCasers = indexer.nextLine();

                        new_upper.insert(0, upperCasers);

                        System.out.println("The following Uppercases has been added: " + upperCasers);

                    } else if(indexnumberadd == 2) {
                        StringBuilder new_lower = new StringBuilder(PasswordGenerator.LOWER);
                        System.out.println("Now enter the lowercases you want to add: ");

                        String lowerCasers = indexer.nextLine();

                        new_lower.insert(0, lowerCasers);

                        System.out.println("The following Lowercases has been added: " + lowerCasers);

                    } else if(indexnumberadd == 3) {
                        StringBuilder new_digits = new StringBuilder(PasswordGenerator.DIGITS);
                        System.out.println("Now enter the digits you want to add: ");

                        String digiters = indexer.nextLine();
                        
                        new_digits.insert(0, digiters);

                        System.out.println("The following Digits has been added: " + digiters);

                    } else if(indexnumberadd == 4) {
                        StringBuilder new_special = new StringBuilder(PasswordGenerator.SPECIAL);
                        System.out.println("Now enter the special characters you want to add");

                        String spcharacters = indexer.nextLine();

                        new_special.insert(0, spcharacters);

                        System.out.println("The following Special characters has been added: " + spcharacters);

                    }
                }
            }

            if(indexnumber == 3) {
                System.exit(0);
            }
        }
    }
}