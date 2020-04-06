package by.gstu.models.typeWriters;

import by.gstu.models.CreateTypeWriters;

public class JetPrinter extends CreateTypeWriters {

    public JetPrinter(String namePrinter, String modelPrinter) {
        super(namePrinter, modelPrinter);
    }
    @Override
    public void print() {
        System.out.println("Был создан струйный принтер, который может выполнять сруйную печать");
    }
}
