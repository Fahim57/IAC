package workshop2_2.composite;

import workshop2_2.composite.GemiddeldeBerekening;
import workshop2_2.composite.HoogsteCijferBerekening;
import workshop2_2.composite.PrimitiefCijfer;
import workshop2_2.composite.SamengesteldCijfer;

/**
 * Created by remcoruijsenaars on 19/11/16.
 */
public class Main {


    public static void main(String[] args) {

        Berekening b1 = new GemiddeldeBerekening();
        Berekening b2 = new HoogsteCijferBerekening();



        PrimitiefCijfer toets0 = new PrimitiefCijfer(5.8);

        PrimitiefCijfer toets1 = new PrimitiefCijfer(8.7);
        PrimitiefCijfer toets2 = new PrimitiefCijfer(4.5);
        PrimitiefCijfer toets3 = new PrimitiefCijfer(3.8);

        PrimitiefCijfer prak1 = new PrimitiefCijfer(6);
        PrimitiefCijfer prak2 = new PrimitiefCijfer(7.2);


        SamengesteldCijfer sc1 = new SamengesteldCijfer(b1);
        SamengesteldCijfer sc2 = new SamengesteldCijfer(b1);
        SamengesteldCijfer sc3 = new SamengesteldCijfer(b2);


        sc1.addCijfer(toets0);
        sc1.addCijfer(sc2);
        sc1.addCijfer(sc3);


        sc2.addCijfer(toets1);
        sc2.addCijfer(toets2);
        sc2.addCijfer(toets3);

        sc3.addCijfer(prak1);
        sc3.addCijfer(prak2);


//        SpeciaalGemiddeldeBerekening b3 = new SpeciaalGemiddeldeBerekening();
//
//        SamengesteldCijfer sc4 = new SamengesteldCijfer(b3);
//
//        sc4.addCijfer(new PrimitiefCijfer(4));
//        sc4.addCijfer(new PrimitiefCijfer(6));
//        sc4.addCijfer(new PrimitiefCijfer(5));
//        sc4.addCijfer(new PrimitiefCijfer(10));
//        sc4.addCijfer(new PrimitiefCijfer(8));

//        System.out.println(sc4.getCijfer());


        System.out.println("En het eindcijfer is: " + sc1.getCijfer());



    }
}
