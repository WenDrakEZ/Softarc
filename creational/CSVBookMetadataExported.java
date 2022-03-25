import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import java.io.*;
import java.util.ArrayList;



public class CSVBookMetadataExporter extends BookMetadataExporter{
    @Override
    public void export(PrintStream stream) throws IOException {
        BookMetadataFormatter CSV_formatter = new CSVBookMetadataFormatter();
        for (Book book : bookList)
        {
            csvFormatter.append(book);
        }
        String[] text = csvFormatter.getMetadataString().split(" \n ");

        try (CSVPrinter printer = new CSVPrinter(new FileWriter("csvOutput.csv"), CSVFormat.DEFAULT)) 
        {
            for (String a : text){
                printer.printRecord(a.split(","));
            }
        } 
        catch (IOException exception) 
        {
                exception.printStackTrace();
        }
    }
















}