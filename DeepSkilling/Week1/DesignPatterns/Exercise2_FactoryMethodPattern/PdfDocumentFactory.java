package DeepSkilling.Week1.DesignPatterns.Exercise2_FactoryMethodPattern;

public class PdfDocumentFactory extends DocumentFactory {

    public Document createDocument() {
        return new PdfDocument();
    }
}