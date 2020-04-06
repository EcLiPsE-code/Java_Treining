package by.gstu.utils.classesError;

public class SetModelPrinterError extends Error {
    private String model;
    public String getModel(){return this.model;}
    public SetModelPrinterError(String message, String model){
        super(message);
        this.model = model;
    }
}
