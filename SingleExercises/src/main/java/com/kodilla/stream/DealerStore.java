package com.kodilla.stream;

import java.util.ArrayList;
import java.util.List;

public enum DealerStore {

    INSTANCE
    ;

    private List<Car> garage = new ArrayList<>();

    public List<Car> getGarage() {
        return garage;
    }

    private DealerStore(){
        garage.add(new Car("Opel","Vectra",1998,4000));
        garage.add(new Car("Opel","Corsa",1200,7000));
        garage.add(new Car("Opel","Tigra",1401,1000));
        garage.add(new Car("Opel","Calibra",1801,7000));
        garage.add(new Car("Opel","Omega",1700,4030));
        garage.add(new Car("Opel","Signum",1998,5000));
        garage.add(new Car("Opel","Astra",1998,4000));
        garage.add(new Car("Opel","Kadett",1402,4020));
        garage.add(new Car("Hyundai","i30",1898,4000));
        garage.add(new Car("Hyundai","Tucson",2500,16000));
        garage.add(new Car("Hyundai","i40",2200,21030));
        garage.add(new Car("Hyundai","Getz",1180,20000));
        garage.add(new Car("Kia","Ceed",1600,45001));

    }

}
