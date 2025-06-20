package Factories;

public class DocumentFactoryProvider {
    public static DocumentFactory getFactory(String extension) {
        if (extension.equalsIgnoreCase(".pdf")) {
            return new PdfDocumentFactory();
        } else if (extension.equalsIgnoreCase(".docx")) {
            return new WordDocumentFactory();
        } else if (extension.equalsIgnoreCase(".xlsx")) {
            return new ExcelDocumentFactory();
        } else {
            throw new IllegalArgumentException("Unsupported document type: " + extension);
        }
    }
}
