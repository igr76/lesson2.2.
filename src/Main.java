public class Main {


    public static void main(String[] args) {
        Griffindor[] griffindor = {
                // gariPotter, germionaGreiger, ronUizli;
                new Griffindor("gariPotter",43, 45, 45, 32, 64),
                new Griffindor("germionaGreiger",56, 76, 65, 37, 86),
                new Griffindor("ronUizli",76, 34, 94, 24, 55)
        };
        print( griffindor,0);

        Slizerin[] slizerin = {
                new Slizerin("dracoMalfoi",87, 65, 45, 67, 23),
                new Slizerin("grehemMontegy",23, 76, 76, 23, 57),
                new Slizerin("gregoryGoil",54, 34, 32, 87, 56),
        };

        Puffendui[] puffendui = {
                new Puffendui("zahariyaSmit",45, 65, 45, 65, 23),
                new Puffendui("sedrikDiggory",87, 23, 65, 76, 34),
                new Puffendui("gastinFinch",54, 65, 87, 46, 54),
        };

        Cogtevran[] cogtevran = {
                new Cogtevran("chgouChang",87, 34, 98, 23, 75),
                new Cogtevran("padmaPatil",12, 65, 67, 34, 76),
                new Cogtevran("MarcusBelby",65, 76, 76, 56, 32),
        };


    }
    public static void print(Griffindor[] griffindor,int i) {
        //griffindor = griffindor[i];
        System.out.println(griffindor);
    }

}