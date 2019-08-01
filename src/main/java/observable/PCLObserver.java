package observable;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PCLObserver implements PropertyChangeListener {

    private String greeting;

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public void propertyChange(PropertyChangeEvent evt) {
        this.setGreeting((String) evt.getNewValue());
    }
}
