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
    private void maximum() {
        int summ =0,summ1 = 0, max =0;
        for ( int i = 0; i < cogtevran.lenght;i++){
            Cogtevran person = cogtevran[i];
            summ1 = person.getMind() + person.getWit() + person.getCreativity();
            System.out.println("У " + person.getName() +   person.getMind() + person.getWit() + person.getCreativity());
            System.out.println("У " + person.getName() + "Сумма баллов = " + summ1);
            if (summ < summ1) {
                summ = summ1;
                max = i;
            }
            Cogtevran person = cogtevran[max];
            System.out.println(person.getName() + "   лучший Когтевран");

        }
    }
    private void who(int i,int g) {
        String name = "";
        int summ1 = 0;
        Puffendui person = puffendui[i];
        name = person.getName();
        summ1 =  person.getMind() + person.getWit() + person.getCreativity();
        Puffendui person = puffendui[g];
        if (summ1 > person.getMind() + person.getWit() + person.getCreativity()) {
            System.out.println(name + "  лучше чем  " + person.getName());
        } else {
            System.out.println(person.getName() + "  лучше чем  " + name);


        }
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