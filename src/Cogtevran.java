public class Cogtevran extends Horward{
   private int mind;
   private int wit;
   private int creativity;

    public Cogtevran(String name,int power,int distance,int mind, int wit, int creativity) {
        super(name,power,distance);
        this.mind = mind;
        this.wit = wit;
        this.creativity = creativity;
    }
    private void who(Cogtevran cogtevran) {
        int summ = summ();
        int summ1 = cogtevran.summ();
        if (summ < summ1) {
            System.out.println("слизеринец " + getName() + " лучше чем " + cogtevran.getName()
                    + "  у него " + summ + " больше чем " + summ1);
        } else {
            System.out.println("слизеринец " + cogtevran.getName() + " лучше чем " + getName()
                    + "  у него " + summ1 + " больше чем " + summ);
        }
    }
    private  int summ(){
        return  mind + wit + creativity;
    }



    public int getMind() {
        return mind;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return "Cogtevran{" +
                "mind=" + mind +
                ", wit=" + wit +
                ", creativity=" + creativity +
                ", power=" + power +
                ", distance=" + distance +
                '}';
    }
}