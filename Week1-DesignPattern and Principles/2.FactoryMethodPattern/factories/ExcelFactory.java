package factories;

import documents.Document;
import documents.ExcelDocument;

public class ExcelFactory extends DocumentFactory {
    public Document createDocument() {
        return new ExcelDocument();
    }
}
