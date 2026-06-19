package DeepSkilling.Week1.DesignPatterns.Exercise2_FactoryMethodPattern;

public class WordDocumentFactory extends DocumentFactory {

    public Document createDocument() {
        return new WordDocument();
    }
}
