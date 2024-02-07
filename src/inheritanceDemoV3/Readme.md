This package includes no-arg constructor in Animal class. 
Your task is remove all super() calls from the constructors of the subclasses. 
Then, run the main method in the Main class and observe.

Then, figure out what is the benefits including the no-arg(default constructor) 
in the superclass and what is the downside of it: 

The benefits of including the no-arg constructor in the superclass is that it allows the subclasses to 
inherit the superclasses no-arg constructor.

The downside of including the no-arg constructor in the superclass is that it can be called by the subclasses, 
which can lead to unexpected behavior.

The benefits of removing the super() calls from the constructors of the subclasses is that it prevents 
the superclasses no-arg constructor from being called by the subclasses, 
which can prevent unexpected behavior.

