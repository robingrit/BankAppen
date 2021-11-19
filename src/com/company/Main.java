package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here


    }

        public static void ReadFileAndInstantiateObjects(Bank bank) throws FileNotFoundException {
            File file = new File("C:\\Users\\zorpi\\Desktop\\BankAppen\\src\\com\\company\\Customer.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                var line = scanner.nextLine();
                var InfoLine = line.split(":");
                var NameAge = InfoLine[0].split(",");
                var gradesArr = InfoLine[1].split(",");

                //Handle Name and Age
                var StudentName = NameAge[0];
                var StudentAge = Integer.parseInt(NameAge[1]);
                //Customer  s = new Customer(StudentName, StudentAge);


                ////Handle Grades
                /*for(var grade : gradesArr)
                {
                    s.AddGrade(Integer.parseInt(grade));
                }
                recordCatalogue.AddStudent(s);*/
            }
        }
    }

