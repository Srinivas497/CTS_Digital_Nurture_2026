package DeepSkilling.Week1.DesignPatterns.Exercise2_FactoryMethodPattern;
public class ExcelDocument implements Document {

    public void open() {
        System.out.println("Opening Excel Document");
    }
}