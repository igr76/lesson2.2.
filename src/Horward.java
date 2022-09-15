public class Horward {
   private String name;
   int power;
   int distance;

    public Horward(String name,int power, int distance) {
        this.name = name;
        this.power = power;
        this.distance = distance;
    }

    public int ability() {
        return power + distance;
    }
    public void compareHorward(Horward horward) {
        int  ability1 =  ability();
        int  ability2 = horward.ability();
        if (ability1 > ability2) {
            System.out.println("студент " + getName() + " лучше чем " + horward.getName()
            + ability1 + " > " +  ability2);
        } else { System.out.println("студент " + horward.getName() + " лучше чем " + getName()
                + ability2 + " > " +  ability1);}
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getDistance() {
        return distance;
    }
}

