package et3.portes.com;

public class Nor extends Porte {
    public Nor(){
        super();
    }

    public Nor(int e1,int e2){
        super(e1,e2);
    }


    @Override
    public int miseAJour() {
        if (getE1() == 0 && getE2() == 0)
        {

            return 1;
        }
        else {

            return 0;
        }
    }
}
