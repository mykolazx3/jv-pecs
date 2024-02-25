package core.mate.academy.service.impl;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int AMOUNT_OF_TRUCKS = 5;
    private List<Truck> trucks = new ArrayList<>();

    @Override
    public List<Truck> get() {
        for (int i = 0; i < AMOUNT_OF_TRUCKS; i++) {
            trucks.add(new Truck());
        }
        return trucks;
    }
}
