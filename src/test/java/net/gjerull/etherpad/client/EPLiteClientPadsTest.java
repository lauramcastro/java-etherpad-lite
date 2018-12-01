package net.gjerull.etherpad.client;

import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.GraphWalker;

@GraphWalker(value = "random(edge_coverage(100))", start = "setUp")
public class EPLiteClientPadsTest extends ExecutionContext implements EPLiteClientPads {

    public void setUp() {
        System.out.println("INICIALIZANDO");
    }

    public void NoExistePad() {
        System.out.println("NON HAI PAD");
    }

    public void ExistePad() {
        System.out.println("HAI PAD");
    }

    public void createPad() {
        System.out.println("*** CREANDO PAD ***");
    }

    public void deletePad() {
        System.out.println("*** BORRANDO PAD ***");
    }

    public void getText() {
        System.out.println("*** LENDO DO PAD ***");
    }

    public void setText() {
        System.out.println("*** ESCRIBINDO NO PAD ***");
    }

}
