package core.mate.academy.service.impl;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int AMOUNT_OF_EXCAVATORS = 5;
    private List<Excavator> excavators = new ArrayList<>();

    @Override
    public List<Excavator> get() {
        for (int i = 0; i < AMOUNT_OF_EXCAVATORS; i++) {
            excavators.add(new Excavator());
        }
        return excavators;
    }
}
