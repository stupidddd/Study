package simple;

public class ComputerFactory {
    public Computer makeComputer(String computerName){
        if(computerName.equalsIgnoreCase("Mac")){
            return new Mac();
        }else if(computerName.equalsIgnoreCase("Lenovo")){
            return new Lenovo();
        }
        return null;
    }
}
