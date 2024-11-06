public class Calculator {
    
    private String model;
    private int version;

    public Calculator(){
        System.out.println("Defualt Calculator.");
    }

    public Calculator(String model){
        this.model = model;
        System.out.println("Calculator created model = " + model);
    }

    public Calculator(String model, int version){
        this.model = model;
        this.version = version;
        System.out.println("Calculator created: model =  " + model + " " + "Version =  " + version);
    }

    public Calculator(int version){
        this.model = " Standard Model";
        this.version = version;
        System.out.println("Calculator created: model =  " + model + " " + "Version =  " + version);
    }

    public static void main(String[] args){
        Calculator calc1 = new Calculator();
        Calculator calc01 = new Calculator("Graphing", 2);
        Calculator calc2  = new Calculator("Scientific");
        Calculator calc4 = new Calculator(3);
    }
}
