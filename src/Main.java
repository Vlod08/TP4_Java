
import et3.portes.com.*;
public class Main {
    public static void main(String[] args) {
        /*********************Bascule  RS********************/
        System.out.println("testing the bascule RS");
        BasculeRS b = new BasculeRS();
        int q1,q2;
        String str;

        q1 = b.getQ();
        b.setS(1);
        b.setR(0);
        q2 = b.getQ();
        str = "Q : "+q1+"; S : "+b.getS()+"; R : "+b.getR()+"; Q+1 : "+q2;
        System.out.println(str);

        q1 = b.getQ();
        b.setS(0);
        b.setR(0);
        q2 = b.getQ();
        str = "Q : "+q1+"; S : "+b.getS()+"; R : "+b.getR()+"; Q+1 : "+q2;
        System.out.println(str);

        q1 = b.getQ();
        b.setS(1);
        b.setR(1);
        q2 = b.getQ();
        str = "Q : "+q1+"; S : "+b.getS()+"; R : "+b.getR()+"; Q+1 : "+q2;
        System.out.println(str);

        b = new BasculeRS();
        q1 = b.getQ();
        b.setS(0);
        b.setR(1);
        q2 = b.getQ();
        str = "Q : "+q1+"; S : "+b.getS()+"; R : "+b.getR()+"; Q+1 : "+q2;
        System.out.println(str);

        q1 = b.getQ();
        b.setS(0);
        b.setR(0);
        q2 = b.getQ();
        str = "Q : "+q1+"; S : "+b.getS()+"; R : "+b.getR()+"; Q+1 : "+q2;
        System.out.println(str);

        q1 = b.getQ();
        b.setS(1);
        b.setR(0);
        q2 = b.getQ();
        str = "Q : "+q1+"; S : "+b.getS()+"; R : "+b.getR()+"; Q+1 : "+q2;
        System.out.println(str);

        q1 = b.getQ();
        b.setS(1);
        b.setR(1);
        q2 = b.getQ();
        str = "Q : "+q1+"; S : "+b.getS()+"; R : "+b.getR()+"; Q+1 : "+q2;
        System.out.println(str);









        /*********************Test Nand et Nor****************/
        /*Nand nand1 = new Nand();
        System.out.println("printing for Nand :");
        int res;
        for (int i =0; i<2;i++)
        {
            for(int j = 0;j<2;j++)
            {
                nand1.set(i,j);
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
                nor1.set(i,j);
                res = nor1.getO();
                System.out.println("Entree1: "+i+ "  Entree2: "+j+"  Sortie: "+res);
            }
        }

    }*/

    }

}