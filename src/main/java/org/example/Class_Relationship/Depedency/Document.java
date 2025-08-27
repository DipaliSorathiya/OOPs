package org.example.Class_Relationship.Depedency;

public class Document {

    String context;
    Document(String context){
        this.context = context;
    }

    // Dependency : Document uses Printer to print its content.
    public void printDocument(Printer printer) {
        printer.print(context);
    }
}
