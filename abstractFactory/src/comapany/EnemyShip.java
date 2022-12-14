package comapany;

public abstract class EnemyShip {
    private String name;
    ESWeapon weapon;
    ESEngine engine;
    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    abstract void makeShip();
    public String toString(){
        String infoOnShip = "The " + name+" has a top speedof "+ engine+ " and an attack power of "+ weapon;
        return infoOnShip;
    }
    public void followHeroShip(){
        System.out.println(getName()+ " is following the hero");
    }
    public void displayEnemyShip(){
        System.out.println(getName()+ " is one screen");
    }
    public void enemyShipShoots(){
        System.out.println(getName()+ " attacks and does "+weapon+ " damage");
    }
}
