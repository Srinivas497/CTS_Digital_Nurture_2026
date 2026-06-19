package DeepSkilling.Week1.DesignPatterns.Exercise2_FactoryMethodPattern;

public class ExcelDocumentFactory extends DocumentFactory {

    public Document createDocument() {
        return new ExcelDocument();
    }
}