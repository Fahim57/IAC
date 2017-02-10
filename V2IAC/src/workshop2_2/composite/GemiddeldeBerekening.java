package workshop2_2.composite;

/**
 * Created by remcoruijsenaars on 19/11/16.
 */
public class GemiddeldeBerekening implements Berekening{

    public double bereken(SamengesteldCijfer samengesteldCijfer){
        double totaal = 0;
        int aantalCijfers = samengesteldCijfer.getCijfers().size();

        for(Cijfer deelcijfer : samengesteldCijfer.getCijfers()){
            totaal += deelcijfer.getCijfer();
        }
        return totaal / aantalCijfers;
    }

}
