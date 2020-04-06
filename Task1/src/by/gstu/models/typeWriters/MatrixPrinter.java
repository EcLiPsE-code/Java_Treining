package by.gstu.models.typeWriters;

import by.gstu.models.CreateTypeWriters;

public class MatrixPrinter extends CreateTypeWriters {

    public MatrixPrinter(String namePrinter, String modelPrinter) {
        super(namePrinter, modelPrinter);
    }

    @Override
    public void print() {
        System.out.println("Был создан матричный принтер, который может выполнять матричную печать");
    }
}
