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

    private void who(Puffendui puffendui) {
        int summ = summ();
        int summ1 = puffendui.summ();
        if (summ < summ1) {
            System.out.println("слизеринец " + getName() + " лучше чем " + puffendui.getName()
                    + "  у него " + summ + " больше чем " + summ1);
        } else {
            System.out.println("слизеринец " + puffendui.getName() + " лучше чем " + getName()
                    + "  у него " + summ1 + " больше чем " + summ);
        }
    }
    private  int summ(){
        return  industriousness + loyalty + honesty;
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
