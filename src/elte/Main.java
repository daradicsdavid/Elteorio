package elte;

import elte.buildings.BeltLine;
import elte.buildings.production.CopperWireFactory;
import elte.buildings.production.Furnace;
import elte.buildings.production.GreenCircuitFactory;
import elte.buildings.resource_gathering.CoalMine;
import elte.buildings.resource_gathering.CopperMine;
import elte.buildings.resource_gathering.IronMine;
import elte.buildings.resource_gathering.OilWell;
import elte.resources.GreenCircuit;
import elte.resources.Resource;

public class Main {

    public static void main(String[] args) {
        CoalMine coalMine = new CoalMine();
        IronMine ironMine = new IronMine();
        Furnace ironFurnace = new Furnace();
        BeltLine coalToIronFurnace = new BeltLine(coalMine, ironFurnace);
        BeltLine ironToIronFurnace = new BeltLine(ironMine, ironFurnace);


        OilWell oilWell = new OilWell();
        CopperMine copperMine = new CopperMine();
        Furnace copperFurnace = new Furnace();
        BeltLine oilToCopperFurnace = new BeltLine(oilWell, copperFurnace);
        BeltLine copperToCopperFurnace = new BeltLine(copperMine, copperFurnace);

        CopperWireFactory copperWireFactory = new CopperWireFactory();
        BeltLine copperPlateToCopperFactory = new BeltLine(copperFurnace, copperWireFactory);


        GreenCircuitFactory greenCircuitFactory = new GreenCircuitFactory();
        BeltLine ironToGreenCircuitFactory = new BeltLine(ironFurnace, greenCircuitFactory);
        BeltLine copperWireToGreenCircuitFactory = new BeltLine(copperWireFactory, greenCircuitFactory);

        Resource greenCircuit = greenCircuitFactory.gather();
        assert greenCircuit instanceof GreenCircuit;
    }
}
