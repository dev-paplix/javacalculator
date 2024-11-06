public class Calculator {
    
    private String model;
    private int version;

    public Calculator(){
        this.model = "Basic Model";
        this.version = 1;
        System.out.println("Calculator created: model =  " + model + " " + "Version =  " + version);
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

    public Calculator(Calculator other){
        this.model = other.model;
        this.version = other.version;
        System.out.println("Calculator created: model =  " + model + " " + "Version =  " + version);
    }

    public static Calculator createSientifCalculator(int version){
        Calculator calc = new Calculator("Scientific", version);
        System.out.println("Calculator created: model =  " + calc.model + " " + "Version =  " + calc.version);
        return calc;
    }

    public void displayInfo(){
        System.out.println("Calculator created: model =  " + model + " " + "Version =  " + version);
    }

    public static void main(String[] args){
        Calculator calc1 = new Calculator();
        Calculator calc01 = new Calculator("Graphing", 2);
        Calculator calc2  = new Calculator("Scientific");
        Calculator calc3 = new Calculator(4);
        Calculator calc4 = new Calculator(3);
        Calculator calcCopy = new Calculator(calc01);

        Calculator sientificCalc = Calculator.createSientifCalculator(3);
        calc01.displayInfo();
        calc1.displayInfo();
        calc2.displayInfo();
        calc3.displayInfo();
        calc4.displayInfo();
        calcCopy.displayInfo();
        sientificCalc.displayInfo();
    }
}
