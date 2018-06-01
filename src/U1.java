public class U1 extends Rocket {



    /* Constructor */
    public U1 (){
        this.cost = 100;        // Millions
        this.weight = 10;       // Tonnes
        this.maxWeight = 18;    // Tonnes
        this.actualCargo = this.weight;
    }


    @Override
    public boolean launch() {

        double chanceLaunchExplosion = 0.05 * (this.maxWeight);

        return super.launch();
    }


    @Override
    public boolean land() {
        return super.land();
    }
}



