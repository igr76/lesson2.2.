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
    private void maximum() {
        int summ = 0,summ1 = 0, max = 0;
        for (int i = 0; i < slizerin.lenght; i++) {
            Slizerin person = slizerin[i];
            summ1 = person.getTrick() + person.getResolute() + person.getAmbitious();
            System.out.println("У " + person.getName() +
                    person.getTrick() + person.getResolute() + person.getAmbitious());
            System.out.println("У " + person.getName() + "Сумма баллов = " + summ1);
            if (summ < summ1) {
                summ =summ1;
                max = i;
            }
            Slizerin person = slizerin[max];
            System.out.println(person.getName() + "   лучший Слизерин");

        }
    }
    private void who(int i,int g) {
        String name = "";
        int summ1 = 0;
        Puffendui person = puffendui[i];
        name = person.getName();
        summ1 = person.getTrick() + person.getResolute() + person.getAmbitious();
        Puffendui person = puffendui[g];
        if (summ1 >person.getTrick() + person.getResolute() + person.getAmbitious()) {
            System.out.println(name + "  лучше чем  " + person.getName());
        } else {
            System.out.println(person.getName() + "  лучше чем  " + name);


        }
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
        return "Slizerin{" +
                "trick=" + trick +
                ", resolute=" + resolute +
                ", ambitious=" + ambitious +
                ", power=" + power +
                ", distance=" + distance +
                '}';
    }
}
