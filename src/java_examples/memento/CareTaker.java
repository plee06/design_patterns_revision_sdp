package memento;

import java.util.HashMap;
import java.util.Map;

public class CareTaker {

    // this is our memento storage which maps a specific save point to that memento object
    private final Map<String, Memento> savepointStorage = new HashMap<String, Memento>();

    // save that specific memento object
    void saveMemento(Memento memento, String savepointName) {
        System.out.println("Saving state with the save point name of: " + savepointName);
        savepointStorage.put(savepointName, memento);
    }

    // return the memento object
    Memento getMemento(String savepointName) {
        System.out.println("Undo at this savepoint name: " + savepointName);
        return savepointStorage.get(savepointName);
    }

    // clears out all save points
    void clearSavepoints() {
        System.out.println("CLEARING ALL SAVE POINTS!");
        savepointStorage.clear();
    }

}
