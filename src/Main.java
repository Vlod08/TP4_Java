public class Main {
    public static void main(String[] args) {
        Nand nand1 = new Nand();
        System.out.println("printing for Nand :");
        int res;
        for (int i =0; i<2;i++)
        {
            for(int j = 0;j<2;j++)
            {
                nand1.setter(i,j);
                res = nand1.getO();
                System.out.println("Entree1: "+i+ "  Entree2: "+j+"  Sortie: "+res);
            }
        }
        Nor nor1 = new Nor();
        System.out.println("printing for Nor :");
        for (int i =0; i<2;i++)
        {
            for(int j = 0;j<2;j++)
            {
                nor1.setter(i,j);
                res = nor1.getO();
                System.out.println("Entree1: "+i+ "  Entree2: "+j+"  Sortie: "+res);
            }
        }

    }
}