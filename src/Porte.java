/*
interface porteFunctions{
    public int setter();
    public Porte getter();

    public int miseAJour();


}
*/
 public abstract class Porte /*implements porteFunctions*/{
    private int e1;
    private int e2;
    private int o;

    public Porte (){
        e1=0;
        e2=0;
        o=miseAJour();
    }

    public Porte (int e1, int e2){
        this.e1 = e1;
        this.e2 = e2;
        o=miseAJour();
    }


    public abstract int miseAJour();
    public void setE1(int e1){
        this.e1 =e1;
        o=miseAJour();
    }
    public void setE2(int e2)
    {
        this.e2 = e2;
        o=miseAJour();
    }
    public void setter(int e1, int e2){
        this.e1 = e1;
        this.e2 = e2;
        o=miseAJour();
    }
    public int getE1(){
        return e1;
    }
    public int getE2(){
        return e2;
    }

    public int getO(){
        return o;
    }




 }
