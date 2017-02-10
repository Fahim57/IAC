package workshop2_2.composite;

/**
 * Created by remcoruijsenaars on 19/11/16.
 */
public class PrimitiefCijfer implements Cijfer {

    private double cijfer;

    public PrimitiefCijfer(double cijfer) {
        this.cijfer = cijfer;
    }

    public double getCijfer(){
        return cijfer;
    }
    public String toString(){
    	return "Primitie Cijfer is " + cijfer;
    }
}
