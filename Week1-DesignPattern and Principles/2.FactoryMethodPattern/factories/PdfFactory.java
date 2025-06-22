package factories;

import documents.Document;
import documents.PdfDocument;

public class PdfFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}
