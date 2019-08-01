# patterns

Some useful patterns implemented in Java 8 that need no other libraries/frameworks.

Observer - Let's any Java property be actively 'observed' or 'listened to' in runtime. By implemententing Java native PropertyChangeListener this is similar to a user interface listener (or a ReactiveX Observable/Subscribe).

Visitor - An alternative/complement to external properties files. By adding an "accept" method for a visitor into objects these can later conveniently be "reconfigured" after initialization. 
