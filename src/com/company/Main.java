package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // write your code here
        Bank b = new Bank();
        ReadFileAndInstantiateObjects(b);

        System.out.println(b.getCustommersInfo());
        System.out.println(b.getCustommer(199605213331L));






    }

        public static void ReadFileAndInstantiateObjects(Bank bank) throws FileNotFoundException {
            File file = new File("C:\\Users\\zorpi\\Desktop\\BankAppen\\src\\com\\company\\Customer.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();


                var NamePnr = line.split(",");
                //var gradesArr = InfoLine[1].split(",");

                //Handle Name and Age
                var CustommerName = NamePnr[0];
                var CustommerPersonummer = Long.parseLong(NamePnr[1]);
                Customer  c = new Customer(CustommerName, CustommerPersonummer);
                bank.AddCustomer(c);


                ////Handle Grades
                /*for(var grade : gradesArr)
                {
                    s.AddGrade(Integer.parseInt(grade));
                }
                recordCatalogue.AddStudent(s);*/
            }
        }
    }

