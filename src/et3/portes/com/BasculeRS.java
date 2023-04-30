package et3.portes.com;

import et3.portes.com.Exceptions.ExceptionBasculeAReparer;

public class BasculeRS{
    private Nor norQ;
    private Nor norNonQ;

    public BasculeRS()
    {
        norQ = new Nor();
        norNonQ = new Nor();
    }

    public BasculeRS(int s, int r){
        this();
        setS(s);
        setR(r);
    }


    public int getR() throws ExceptionBasculeAReparer {
        try {
            return norQ.getE1();
        }
        catch (Exception e){
            throw new ExceptionBasculeAReparer(e.getMessage());
        }
    }
    public int getS() throws ExceptionBasculeAReparer{
        try {
            return norNonQ.getE1();
        }
        catch (Exception e){
            throw new ExceptionBasculeAReparer(e.getMessage());
        }
    }
    public int getQ() throws ExceptionBasculeAReparer{
        try {
            return norQ.getO();
        }
        catch (Exception e){
            throw new ExceptionBasculeAReparer(e.getMessage());
        }
    }
    public int getNonQ() throws ExceptionBasculeAReparer{
        try {
            return norNonQ.getO();
        }
        catch (Exception e){
            throw new ExceptionBasculeAReparer(e.getMessage());
        }
    }



    public void setR(int r) throws ExceptionBasculeAReparer {

        try {
            norQ.setE1(r);
            norQ.setE2(norNonQ.getO());
            norQ.miseAJour();
            //norNonQ.miseAJour();
            norNonQ.setE1(norQ.getO());
            norNonQ.miseAJour();
            norQ.setE2(norNonQ.getO());
            norQ.miseAJour();
        }
        catch (Exception e){
            throw new ExceptionBasculeAReparer(e.getMessage());
        }

    }

    public void setS(int s) throws ExceptionBasculeAReparer{

        try {
            norNonQ.setE2(s);
            norNonQ.setE1(norQ.getO());
            norNonQ.miseAJour();
            norQ.setE2(norNonQ.getO());
            norQ.miseAJour();
            norNonQ.setE1(norQ.getO());
            norNonQ.miseAJour();
        }
        catch(Exception e){
            throw new ExceptionBasculeAReparer(e.getMessage());
        }

    }


    public void affiche() throws ExceptionBasculeAReparer{
       String str;
        try {
                    str = "Entrees : \n"
                    +"\t R : "+getR()+";  S : "+getS()+"\n"
                    +"Sorties : \n"
                    +"\t Q : "+getQ()+"; -Q : "+getNonQ()+"\n";
        }
        catch (Exception e){
            throw new ExceptionBasculeAReparer(e.getMessage());
        }
        System.out.println(str);
    }

}
