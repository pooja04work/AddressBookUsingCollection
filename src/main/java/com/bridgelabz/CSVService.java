package com.bridgelabz;

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CSVService {
    public static File HOME = new File("C:\\Users\\PUJA\\development\\IntellijWorksoace\\UsingCollectionAddressBook\\src\\main\\resources\\.");

    public void writeDataToCSV(String addressBookName, List<ContactPerson> contactPersonList) throws IOException {
        //       CSVWriter csvWriter = new CSVWriter(new FileWriter(HOME + addressBookName + ".csv"));
//        csvWriter.writeNext(contactPersonList);
        try (
                Writer writer = Files.newBufferedWriter(Paths.get(HOME + addressBookName + ".csv"));

                CSVWriter csvWriter = new CSVWriter(writer,
                        CSVWriter.DEFAULT_SEPARATOR,
                        CSVWriter.NO_QUOTE_CHARACTER,
                        CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                        CSVWriter.DEFAULT_LINE_END);
        ) {

            String[] headerRecord = {"First Name", "Last Name", "City", "State", "Email", "ZIP", "Phone No"};
            csvWriter.writeNext(headerRecord);

            for (ContactPerson contactPerson1 : contactPersonList) {
                csvWriter.writeNext(new String[]{contactPerson1.getFirstName(), contactPerson1.getLastName(),
                        contactPerson1.getCity(), contactPerson1.getState(),
                        contactPerson1.getEmail(), String.valueOf(contactPerson1.getZip()),
                        String.valueOf(contactPerson1.getPhoneNo())});

            }
        }
    }
}
