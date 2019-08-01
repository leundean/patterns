package observable;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class PCLObservable {

    private String greeting;

    private PropertyChangeSupport support;

    public PCLObservable() {
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl){

        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl){
        support.removePropertyChangeListener(pcl);
    }

    public void setGreeting(String value) {
        support.firePropertyChange("", this.greeting, value);
        this.greeting = value;
    }
}
