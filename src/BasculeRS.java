public class BasculeRS {
    private Nor norQ;
    private Nor norNonQ;

    public BasculeRS()
    {
        norQ = new Nor();
        norNonQ = new Nor();
    }
    public int getS(){
        return norQ.getE1();
    }
    public int getR(){
        return norNonQ.getE2();
    }
    public int getQ(){
        return norQ.getO();
    }
    public int getNonQ(){
        return norNonQ.getO();
    }




}
