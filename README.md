# patterns

Some useful patterns implemented in Java 8 that need no other libraries/frameworks.

Adapter - Translates the method calls from one type of interface to another type of interface. By wrapping the "output interface" in a class implementing the "input interface" an adapter class is created. In this example the methods are identical, but depending on the adaptor design a variety of legacy class interfaces can be "connected". See more: https://en.wikipedia.org/wiki/Adapter_pattern

Composite - For structural modeling and design a fundamental pattern. By letting objects (components) with any number of children (composite or leaf) implement the same interface, an infinite variety of structures can be composed. Here a simple a house is composed with a tree structure. See more: https://en.wikipedia.org/wiki/Composite_pattern

Observer - Lets any Java property be actively observed ('attended', 'listened to') in runtime. Any number of subscribers will update their value upon a property change. By implemententing Java native PropertyChangeListener the pattern resembles a user interface listener or the ReactiveX Observable/Subscriber pair. See more: https://en.wikipedia.org/wiki/Observer_pattern
...
