public class Puffendui extends Horward{
   private int industriousness;
   private int loyalty;
   private int honesty;

    public Puffendui(String name, int power,int distance,int industriousness, int loyalty, int honesty) {
        super(name,power,distance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
    private void maximum() {
        int summ = 0, summ1 = 0, max = 0;
        for (int i = 0; i < puffendui.lenght; i++) {
            Puffendui person = puffendui[i];
            summ1 =  person.getIndustriousness() +
                    person.getLoyalty() + person.getHonesty();
            System.out.println("У " + person.getName()  +
                    person.getIndustriousness() +  person.getLoyalty() + person.getHonesty());
            System.out.println("У " + person.getName() + "Сумма баллов = " + summ1);
            if (summ < summ1) {
                summ = summ1;
                max = i;
            }
            Puffendui person = puffendui[max];
            System.out.println(person.getName() + "   лучший Пуффендуй");

        }
    }
    private void who(int i,int g) {
        String name = "";
        int summ1 = 0;
        Puffendui person = puffendui[i];
        name = person.getName();
        summ1 = person.getIndustriousness() +
                person.getLoyalty() + person.getHonesty();
        Puffendui person = puffendui[g];
        if (summ1 > person.getIndustriousness() +
                person.getLoyalty() + person.getHonesty()) {
            System.out.println(name + "  лучше чем  " + person.getName());
        } else {
            System.out.println(person.getName() + "  лучше чем  " + name);

        }
    }

        public int getIndustriousness() {
            return industriousness;
        }

        public int getLoyalty() {
            return loyalty;
        }

        public int getHonesty() {
            return honesty;
        }

        @Override
        public String toString() {
            return "Puffendui{" +
                    "industriousness=" + industriousness +
                    ", loyalty=" + loyalty +
                    ", honesty=" + honesty +
                    ", power=" + power +
                    ", distance=" + distance +
                    '}';
        }
    }
