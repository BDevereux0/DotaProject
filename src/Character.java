public class Character {

    String name;
    int HP;
    int MP;
    int AGI;
    int INT;
    int STR;
    int lowerBaseDamage;
    int upperBaseDamage;
    double AGIgain;
    double STRgain;
    double INTgain;
    int level;

    public Character(){

    }

    public Character(String name, int HP, int MP, int AGI, int INT, int STR, int lowerBaseDamage, int upperBaseDamage,
                          double AGIgain, double STRgain, double INTgain, int level){
     this.name=name;
     this.HP = HP;
     this.MP = MP;
     this.AGI = AGI;
     this.AGIgain = AGIgain;
     this.INT = INT;
     this.INTgain = INTgain;
     this.STR = STR;
     this.STRgain = STRgain;
     this.lowerBaseDamage = lowerBaseDamage;
     this.upperBaseDamage = upperBaseDamage;
    }

    public double attackDamage(){
        double lowerAttackDamage;
        double highAttackDamage;

       return (lowerAttackDamage = getLowerBaseDamage() + (AGIgain * level));

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public int getAGI() {
        return AGI;
    }

    public void setAGI(int AGI) {
        this.AGI = AGI;
    }

    public int getINT() {
        return INT;
    }

    public void setINT(int INT) {
        this.INT = INT;
    }

    public int getSTR() {
        return STR;
    }

    public void setSTR(int STR) {
        this.STR = STR;
    }

    public int getLowerBaseDamage() {
        return lowerBaseDamage;
    }

    public void setLowerBaseDamage(int lowerBaseDamage) {
        this.lowerBaseDamage = lowerBaseDamage;
    }

    public int getUpperBaseDamage() {
        return upperBaseDamage;
    }

    public void setUpperBaseDamage(int upperBaseDamage) {
        this.upperBaseDamage = upperBaseDamage;
    }

    public double getAGIgain() {
        return AGIgain;
    }

    public void setAGIgain(double AGIgain) {
        this.AGIgain = AGIgain;
    }

    public double getSTRgain() {
        return STRgain;
    }

    public void setSTRgain(double STRgain) {
        this.STRgain = STRgain;
    }

    public double getINTgain() {
        return INTgain;
    }

    public void setINTgain(double INTgain) {
        this.INTgain = INTgain;
    }
}
