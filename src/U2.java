public class U2 extends Rocket{


    /* Constructor */
    public U2 () {
        this.cost = 120;        // Millions
        this.weight = 18;       // Tonnes
        this.maxWeight = 29;    // Tonnes
        this.actualCargo = this.weight;
    }



    @Override
    public boolean launch() {
        return super.launch();
    }

    @Override
    public boolean land() {
        return super.land();
    }
}
