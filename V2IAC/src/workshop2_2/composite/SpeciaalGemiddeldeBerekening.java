package workshop2_2.composite;

/**
 * Created by remcoruijsenaars on 19/11/16.
 */
public class SpeciaalGemiddeldeBerekening implements Berekening{

    public double bereken(SamengesteldCijfer samengesteldCijfer){

        final int AANTALWEGSTREPEN = 2;

        double totaal = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        int aantalCijfers = samengesteldCijfer.getCijfers().size();

        for(Cijfer deelcijfer : samengesteldCijfer.getCijfers()){
            double iter = deelcijfer.getCijfer();

            if(iter > max) max = iter;
            if(iter < min) min = iter;

            totaal += deelcijfer.getCijfer();
        }

        if(aantalCijfers > AANTALWEGSTREPEN){
            return (totaal - max - min) / (aantalCijfers - AANTALWEGSTREPEN);
        }

        return totaal / aantalCijfers;
    }

}
