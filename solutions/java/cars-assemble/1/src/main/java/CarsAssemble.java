public class CarsAssemble {
  
    public double productionRatePerHour(int speed) {
        double production;
        if(speed<5){
            production = 221 * speed;
        }
        else if(4<speed && speed<9){
            production = 221 * speed * 0.9;
        }
        else if(speed==9){
            production = 221 * speed * 0.8;
        }
        else
            production = 221 * speed * 0.77;
        return production;
    }

    public int workingItemsPerMinute(int speed) {
        int value = (int) productionRatePerHour(speed)/60;
        return value;
    }
}
