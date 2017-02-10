package workshop2_2.composite;

import java.util.Optional;

/**
 * Created by remcoruijsenaars on 19/11/16.
 */
public class HoogsteCijferBerekening implements Berekening {

    public double bereken(SamengesteldCijfer samengesteldCijfer) {
        double max = 0;
        for(Cijfer deelcijfer : samengesteldCijfer.getCijfers()){
            double iterCijfer = deelcijfer.getCijfer();
            if(iterCijfer > max){
                max = iterCijfer;
            }
        }
        return max;
    }
}
