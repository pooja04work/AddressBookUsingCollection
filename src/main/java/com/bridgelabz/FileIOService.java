package com.bridgelabz;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class FileIOService {
   public static File HOME = new File("C:\\Users\\PUJA\\development\\IntellijWorksoace\\UsingCollectionAddressBook\\src\\main\\resources\\.");

    public void writeData(String addressBookName, List<ContactPerson> contactPersonList) {
        String files = HOME+addressBookName + ".txt";
        contactPersonList.forEach((contactPerson) ->{
            FileWriter fileWriter;
            try {
                fileWriter = new FileWriter(files);
                for (ContactPerson contactPerson1:contactPersonList  ){
                    fileWriter.write(contactPerson1.toString());
                }
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void readData() throws FileNotFoundException {
        File filesList[] = HOME.listFiles();
        Scanner scanner = null;
        for (File file : filesList) {
            scanner= new Scanner(file);
            String input;
            StringBuffer sb = new StringBuffer();
            while (scanner.hasNextLine()) {
                input = scanner.nextLine();
                sb.append(input+" ");
            }
            System.out.println(sb.toString());
            System.out.println(" ");
        }
            }
}