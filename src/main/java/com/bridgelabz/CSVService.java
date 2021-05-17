package com.bridgelabz;

import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Scanner;

public class CSVService {
    public static File HOME = new File("C:\\Users\\PUJA\\development\\IntellijWorksoace\\UsingCollectionAddressBook\\src\\main\\resources\\CSVFile\\.");

    public static void writeDataToCSV(String addressBookName, LinkedList<ContactPerson> contact) {
        try (Writer writer = Files.newBufferedWriter(Paths.get(HOME+addressBookName+".csv"))) {
            StatefulBeanToCsvBuilder<ContactPerson> builder = new StatefulBeanToCsvBuilder<>(writer);
            StatefulBeanToCsv<ContactPerson> beanWriter = builder.build();
            beanWriter.write(contact);
        } catch (CsvRequiredFieldEmptyException e) {
            e.printStackTrace();
        } catch (CsvDataTypeMismatchException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readDataFromCsv() throws IOException {
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