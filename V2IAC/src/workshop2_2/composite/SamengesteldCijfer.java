package workshop2_2.composite;

//import sun.security.ssl.krb5.KerberosClientKeyExchangeImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by remcoruijsenaars on 19/11/16.
 */
public class SamengesteldCijfer implements Cijfer {

    private List<Cijfer> cijfers;
    private Berekening berekening;


    public SamengesteldCijfer(Berekening berekening) {
        this.cijfers = new ArrayList<Cijfer>();
        this.berekening = berekening;
    }

    public void addCijfer(Cijfer cijfer){
        this.cijfers.add(cijfer);
    }

    public void setBerekening(Berekening berekening) {
        this.berekening = berekening;
    }

    public List<Cijfer> getCijfers() {
        return cijfers;
    }

    public double getCijfer() {
        return berekening.bereken(this);
    }
}
