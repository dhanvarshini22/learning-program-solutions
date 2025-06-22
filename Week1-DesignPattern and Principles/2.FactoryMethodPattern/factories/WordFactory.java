package factories;

import documents.Document;
import documents.WordDocument;

public class WordFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}
