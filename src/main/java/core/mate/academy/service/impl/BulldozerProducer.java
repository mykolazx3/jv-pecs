package core.mate.academy.service.impl;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int AMOUNT_OF_BULLDOZERS = 5;
    private List<Bulldozer> bulldozers = new ArrayList<>();

    @Override
    public List<Bulldozer> get() {
        for (int i = 0; i < AMOUNT_OF_BULLDOZERS; i++) {
            bulldozers.add(new Bulldozer());
        }
        return bulldozers;
    }
}
