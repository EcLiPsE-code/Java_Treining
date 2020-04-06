package by.gstu.utils.classesError;

public class SetNamePrinterError extends Error {
    private String name;
    public String getName(){return this.name;}
    public SetNamePrinterError(String message, String name){
        super(message);
        this.name = name;
    }
}
