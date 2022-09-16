public class Griffindor extends Horward {

    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name ,int power, int distance, int nobility, int honor, int bravery) {
        super(name,power, distance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
    public void who(Griffindor griffindor) {
        int summ = summ();
        int summ1 = griffindor.summ();
        if (summ < summ1) {
            System.out.println("слизеринец " + getName() + " лучше чем " + griffindor.getName()
                    + "  у него " + summ + " больше чем " + summ1);
        } else if (summ > summ1) {
            System.out.println("слизеринец " + griffindor.getName() + " лучше чем " + getName()
                    + "  у него " + summ1 + " больше чем " + summ);
        } else {
            System.out.println("слизеринец " + griffindor.getName() + " равен " + getName()
                    + "  у него " + summ1 + " равно " + summ);
        }
    }
    private  int summ(){
        return  nobility + honor + bravery;
    }


    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return String.format(super.toString() +"nobility" + nobility + "honor" +
                honor +"bravery" +bravery);
    }
}
