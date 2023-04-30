package et3.portes.com;


import et3.portes.com.Exceptions.ExceptionPorteAChanger;

public abstract class Porte{
    private int e1;
    private int e2;
    private int o;
    private int cycles;

    private final int CYCLEMAX = 7;

    public Porte (){
        e1=0;
        e2=0;
        o=miseAJour();
        cycles =0;
    }

    public Porte (int e1, int e2){
        this.e1 = e1;
        this.e2 = e2;
        o=miseAJour();
        cycles =0;
    }


    public abstract int miseAJour();
    public void setE1(int e1) throws ExceptionPorteAChanger{
        this.e1 =e1;
        o=miseAJour();
        cycles+=1;
        if(cycles>=CYCLEMAX){
            throw new ExceptionPorteAChanger();
        }
    }
    public void setE2 (int e2) throws ExceptionPorteAChanger
    {
        this.e2 = e2;
        o=miseAJour();
        cycles+=1;
        if(cycles>=CYCLEMAX){
            throw new ExceptionPorteAChanger();
        }
    }
    public void set(int e1, int e2) throws ExceptionPorteAChanger{
        this.e1 = e1;
        this.e2 = e2;
        o=miseAJour();
        cycles+=1;
        if(cycles>=CYCLEMAX){
            throw new ExceptionPorteAChanger();
        }
    }
    public int getE1() throws ExceptionPorteAChanger{
        cycles+=1;
        if(cycles>=CYCLEMAX){
            throw new ExceptionPorteAChanger();
        }
        return e1;
    }
    public int getE2()throws ExceptionPorteAChanger{
        cycles+=1;
        if(cycles>=CYCLEMAX){
            throw new ExceptionPorteAChanger();
        }
        return e2;
    }

    public int getO(){
        cycles+=1;
        if(cycles>=CYCLEMAX){
            throw new ExceptionPorteAChanger();
        }
        return o;
    }




 }
