package mediator;

/**
 * Used by our MachineMediator classes for SoilRemoval levels, not necessarily a Colleague of the Machine as this is
 * an "extra" feature which is general for all but not a colleague, hence at the package level.
 *
 *
 * */
public class SoilRemoval {


    void low() {
        System.out.println("Set Soil Removal Level to Low");
    }
    void medium() {
        System.out.println("Set Soil Removal Level to Medium");
    }
    void high() {
        System.out.println("Set Soil Removal Level to High");
    }
}
