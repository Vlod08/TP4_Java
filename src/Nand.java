public class Nand extends Porte{

    public Nand(){
        super();
    }

    public Nand(int e1,int e2){
        super(e1,e2);
    }


    @Override
    public int miseAJour() {
        if (getE1() == 1 && getE2() == 1)
        {

            return 0;
        }
        else {

            return 1;
        }
    }
}