package by.gstu.models.typeWriters;

import by.gstu.models.CreateTypeWriters;

public class LedPrinter extends CreateTypeWriters {

    public LedPrinter(String namePrinter, String modelPrinter) {
        super(namePrinter, modelPrinter);
    }

    @Override
    public void print() {
        System.out.println("Был создан светодиодный принтер, который может выполнять светодиодную печать");
    }
}
