import Documents.Document;
import Factories.DocumentFactory;
import Factories.DocumentFactoryProvider;

public class Main {
    public static void main(String[] args) {
        String extension = ".xlsx";  

        DocumentFactory factory = DocumentFactoryProvider.getFactory(extension);
        Document document = factory.createDocument();

        document.open();  
    }
}
