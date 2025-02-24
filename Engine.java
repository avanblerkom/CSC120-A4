public class Engine implements EngineRequirements{
   
    //Attributes
    private FuelType f;
    private double currentFuelLevel;
        private double maxFuelLevel;
    
        /**
         * Constructor for Engine
         * @param f Engine's fuel type
         * @param currentFuelLevel Engine's current fuel level
         * @param maxFuelLevel Engine's max fuel level
         */
        public Engine(FuelType f, double currentFuelLevel, double maxFuelLevel) {
            this.f = f;
            this.currentFuelLevel = currentFuelLevel;
            this.maxFuelLevel = maxFuelLevel;
        }
    
        //Methods 
        public FuelType getFuelType() {
            return this.f;
        }
    
        public double getMaxFuel() {
            return 0.; //placeholder
    
        }
    
        public double getCurrentFuel() {
            return 0.; //placeholder
        }
    
         
        public void refuel() {
            this.currentFuelLevel = this.maxFuelLevel;
        }
    
        public Boolean go() {
            if (this.currentFuelLevel > 0) {
                this.currentFuelLevel -= 1; // Assuming each go operation consumes 1 unit of fuel
                return true;
            } else {
                return false;
            }
        }
    
        public String toString() {
            return (" Engine has fuel type " + this.f + " current fuel level: " + this.currentFuelLevel + " and max fuel level: " + this.maxFuelLevel);
        }
    
        public static void main(String[] args) {
            Engine myEngine = new Engine(FuelType.ELECTRIC,  0.,  100.);
        System.out.println(myEngine);

        Engine myOtherEngine = new Engine(FuelType.STEAM, 50., 100.);
        System.out.println(myOtherEngine);
    }


}