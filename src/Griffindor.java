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

    private void maximum() {
        int summ =0,summ1 = 0, max =0;
        for ( int i = 0; i < griffindor.lenght;i++){
            Griffindor person = griffindor[i];
            summ1 = person.getNobility() +
                    person.getHonor() + person.getBravery();
            System.out.println("У " + person.getName() +person.getNobility() + person.getHonor() + person.getBravery());
            System.out.println("У " + person.getName() + "Сумма баллов = " + summ1);
            if (summ < summ1) {
                summ = summ1;
                max = i;
            }
            Griffindor person = griffindor[max];
            System.out.println(person.getName() + "   лучший Гриффиндоровец");

        }
    }
    private void who(int i,int g) {
        String name = "";
        int summ1 = 0;
        Puffendui person = griffindor[i];
        name = person.getName();
        summ1 = person.getNobility() +
                person.getHonor() + person.getBravery();
        Puffendui person = griffindor[g];
        if (summ1 > person.getNobility() +
                person.getHonor() + person.getBravery()) {
            System.out.println(name + "  лучше чем  " + person.getName());
        } else {
            System.out.println(person.getName() + "  лучше чем  " + name);


        }
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
        return "Griffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                ", power=" + power +
                ", distance=" + distance +
                '}';
    }
}
