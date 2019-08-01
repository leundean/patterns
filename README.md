# patterns

Some useful patterns implemented in Java 8 that need no other libraries/frameworks.

Observer - Let's any Java property be actively observed ('attended', 'listened to') in runtime. Any number of subscribers will update their value upon a property change. By implemententing Java native PropertyChangeListener the pattern resembles a user interface listener or the ReactiveX Observable/Subscriber pair. See more: https://en.wikipedia.org/wiki/Observer_pattern

Visitor - Create new operations independently on a set of objects by delegating to one (or more) visitor object(s). Also, an alternative/complement to setting properties by external files. Adding an "accept" method to classes, these can conveniently be "enhanced" or "reconfigured" by the external visitor(s). See more: https://en.wikipedia.org/wiki/Visitor_pattern
