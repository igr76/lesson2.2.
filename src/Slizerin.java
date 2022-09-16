public class Slizerin extends Horward{
   private int trick;
   private int resolute;
   private int ambitious;

    public Slizerin(String name, int power,int distance,int trick, int resolute, int ambitious) {
        super(name,power,distance);
        this.trick = trick;
        this.resolute = resolute;
        this.ambitious = ambitious;
    }
    private void who(Slizerin slizerin) {
        int summ = summ();
        int summ1 = slizerin.summ();
        if (summ < summ1) {
            System.out.println("слизеринец " + getName() + " лучше чем " + slizerin.getName()
                    + "  у него " + summ + " больше чем " + summ1);
        } else if (summ < summ1) {
            System.out.println("слизеринец " + slizerin.getName() + " лучше чем " + getName()
                    + "  у него " + summ1 + " больше чем " + summ);
        } else {
            System.out.println("слизеринец " + slizerin.getName() + " равен " + getName()
                    + "  у него " + summ1 + " равно " + summ);
        }

    }

    private  int summ(){
        return  trick + resolute + ambitious;
    }

    public int getTrick() {
        return trick;
    }

    public int getResolute() {
        return resolute;
    }

    public int getAmbitious() {
        return ambitious;
    }

    @Override
    public String toString() {
        return String.format(super.toString() +"nobility" + trick + "honor" +
                resolute +"bravery" +ambitious);
    }
}
