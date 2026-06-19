package DeepSkilling.Week1.DesignPatterns.Exercise2_FactoryMethodPattern;

public class PdfDocument implements Document {

    public void open() {
        System.out.println("Opening PDF Document");
    }
}