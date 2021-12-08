public class Items{


    //TODO Bring in items and there stats.

     int Strength;
     int Intelligence;
     int Agility;
    int StatusResistance;
    int AttackSpeed;
    int HealthRegenAmp;
    int LifeStealAmp;
    int MovementSpeed;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return Strength;
    }

    public void setStrength(int strength) {
        Strength = strength;
    }

    public int getIntelligence() {
        return Intelligence;
    }

    public void setIntelligence(int intelligence) {
        Intelligence = intelligence;
    }

    public int getAgility() {
        return Agility;
    }

    public void setAgility(int agility) {
        Agility = agility;
    }

    public Items(String name, int Agility, int Strength ){
       this.name = name;
       this.Agility= Agility;
       this.Strength = Strength;


   }

}
