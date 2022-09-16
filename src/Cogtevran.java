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
            System.out.println("Когтевранец " + getName() + " лучше чем " + cogtevran.getName()
                    + "  у него " + summ + " больше чем " + summ1);
        } else if (summ > summ1) {
            System.out.println("Когтевранец " + cogtevran.getName() + " лучше чем " + getName()
                    + "  у него " + summ1 + " больше чем " + summ);
        } else {
            System.out.println("Когтевранец " + cogtevran.getName() + " равен " + getName()
                    + "  у него " + summ1 + " равно " + summ);
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
        return  String.format(super.toString() +"nobility" + mind + "honor" +
                wit +"bravery" +creativity);
    }
}