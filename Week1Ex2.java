public class Week1Ex2{
    public static void main(String[] args) {
        DocumentFactory factory = new WordFactory();
        Document doc = factory.createDocument();
        doc.open();
    }
}
interface Document {
    public void open();
}

class WordDocument implements Document {
    public void open() {
        System.out.println("Word Document Opened");
    }
}

class PdfDocument implements Document {
    public void open() {
        System.out.println("PDF Document Opened");
    }
}

abstract class DocumentFactory {
    abstract Document createDocument();
}

class WordFactory extends DocumentFactory {
    Document createDocument() {
        return new WordDocument();
    }
}

class PdfFactory extends DocumentFactory {
    Document createDocument() {
        return new PdfDocument();
    }
}