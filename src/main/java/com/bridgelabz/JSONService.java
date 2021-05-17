package com.bridgelabz;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Scanner;

import static com.bridgelabz.AddressBook.list;

public class JSONService {
    public static File HOME = new File("C:\\Users\\PUJA\\development\\IntellijWorksoace\\UsingCollectionAddressBook\\src\\main\\resources\\JSONFile\\.");

    public static void writeDataToJSon(String addressBookName, LinkedList contact) throws IOException {
        {
            Path filePath = Paths.get(HOME+addressBookName+".json");
            Gson gson = new Gson();
            String json = gson.toJson(list);
            FileWriter writer = new FileWriter(String.valueOf(filePath));
            writer.write(json);
            writer.close();
        }
    }
    public void readDataFromJson() throws IOException {
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
