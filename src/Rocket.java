public class Rocket implements SpaceShip{

    int cost;
    int weight;
    int maxWeight;

    int actualCargo;



    @Override
    public boolean launch() {
        return true;
    }


    @Override
    public boolean land() {
        return true;
    }


    @Override
    public void carry(Item item) {
        this.actualCargo += item.weight;


    }


    @Override
    public boolean canCarry(Item item) {

        /* add item weight to the actual cargo */
        this.carry(item);

        /* check whether we can carry the item */
        if (this.actualCargo > this.maxWeight) {
            return false;
        }
        else {
            return true;
        }

    }


}
