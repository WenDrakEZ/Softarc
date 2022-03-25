package creational;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.io.PrintStream;

public abstract class BookMetadataExporter extends BookCollection {

    public void export(PrintStream stream) {
        public abstract void export(PrintStream stream) throws IOException, ParserConfigurationException, XMLStreamException;
    }
}
