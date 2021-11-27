package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // write your code here
        Bank b = new Bank();

        // Skapar customers
        ReadFileAndInstantiateObjects(b);

        // ----om  man vill manuelt skapa customer
        String CustommerName = "lisa";
        long CustommerPersonummer = 190105213331L;
        Customer  c = new Customer(CustommerName, CustommerPersonummer);
        b.AddCustomer(c);
        /// -----



        /// Skapar konton
        b.AddAccount(198402191111L);

        b.AddAccount(199605213331L);
        b.AddAccount(199605213331L);
        //--------------------------


        // Får information om specefik kund
        System.out.println(b.getCustommer(199605213331L));
        // Ändrar namn  från Robin till lars
        System.out.println(b.ChangeCustommerName("lars" , 199605213331L));
        // Får information om specefik kund
        System.out.println(b.getCustommer(199605213331L));
        /// ----------------------

        System.out.println(" *******************");
        System.out.println(b.getAccsInfo(199605213331L));
        System.out.println(" *******************");
        System.out.println(b.getAccsInfo(198402191111L));
        System.out.println(" *******************");
        b.deposit(199605213331L, 1001,10);
        System.out.println(" *******************");
        System.out.println(b.getAccsInfo(199605213331L));
        System.out.println(" *******************");
        b.withdraw(199605213331L, 1001,3);
        System.out.println("111111111111");
        System.out.println(b.getAccsInfo(199605213331L));
        System.out.println(" -----------");
        System.out.println(b.CloseAccount(199605213331L,1002));
        System.out.println(" ,,,,,,,,,,,,,");







        //System.out.println(b.getCustommersInfo());
        //System.out.println(b.getCustommer(199605213331L));
        //b.ChangeCustommerName("Joel",199605213331L);
        //System.out.println(b.getCustommer(199605213331L));
        //b.CloseAccount(198402191111L,1001);


        //System.out.println(b.RemoveCustomer(198402191111L));

        //System.out.println(b.RemoveCustomer(199605213331L));





    }

        public static void ReadFileAndInstantiateObjects(Bank bank) throws FileNotFoundException {
            File file = new File("C:\\Users\\zorpi\\Desktop\\BankAppen\\src\\com\\company\\Customer.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();


                var NamePnr = line.split(",");


                //Handle Name and Age
                var CustommerName = NamePnr[0];
                var CustommerPersonummer = Long.parseLong(NamePnr[1]);
                Customer  c = new Customer(CustommerName, CustommerPersonummer);
                bank.AddCustomer(c);




            }
        }
    }

