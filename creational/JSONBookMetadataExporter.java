import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;


public class JSONBookMetadataExporter extends BookMetadataExporter{
    @Override
    public void export(PrintStream stream) throws IOException {

        BookMetadataFormatter JSON_formatter = new JSONBookMetadataFormatter();

        FileWriter file = null;

        for (Book book : books)
        {
            JSON_formatter.append(book);
        }

        try
        {
            file = new FileWriter("json.txt");
            ((JSONBookMetadataFormatter) formatter).getJsonArray().writeJSONString(file);
        } 
        catch (IOException exception) 
        {
            exception.printStackTrace();
        }
        finally
        {
            file.flush();
            file.close();
        }
    }

}