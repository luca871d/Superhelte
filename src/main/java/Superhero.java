public class Superhero {
    private String realName;
    private String superName;
    private boolean human;
    private String superPower;
    private int yearOfCreation;
    private double strength;

    public Superhero (String realName, String superName, boolean human, String superPower, int yearOfCreation, double strength){
        this.realName = realName;
        this.superName = superName;
        this.human = human;
        this.superPower = superPower;
        this.yearOfCreation = yearOfCreation;
        this.strength = strength;
    }

    public String getRealName(){
        return realName;
    }
    public String getSuperName(){
        return superName;
    }
    public boolean getHuman(){
        return human;
    }
    public String getSuperPower(){
        return superPower;
    }
    public int getYearOfCreation(){
        return yearOfCreation;
    }
    public double getStrength() {
        return strength;
    }

    public String toString(){
        return realName + " " + superName + " " + human + " " + superPower + " " + yearOfCreation + " " + strength;
    }
}
