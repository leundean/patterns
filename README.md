# patterns

Some useful patterns implemented in Java 8 that need no other libraries/frameworks.

Observable - Let's any Java property be actively 'observed' or 'listened to' in runtime. By implemententing Java native PropertyChangeListener the pattern resembles a user interface listener or the ReactiveX Observable/Subscriber pair.

Visitor - Create new operations independently on a set of objects by delegating to one (or more) visitor object(s). Also, an alternative/complement to setting properties by external files. Adding an "accept" method for a visitor into objects, these can later conveniently be "enhanced" or "reconfigured". 
