## Strategy

The Strategy pattern is a behavioral design pattern that defines a family of algorithms, encapsulates each one, and makes them interchangeable. It allows the client to choose the appropriate algorithm to use at runtime. This pattern promotes the principle of "composition over inheritance" by favoring composition to define a set of algorithms and behaviors instead of inheriting them in subclasses.

### When to use

Use the Strategy pattern when:

* You have a set of related algorithms or behaviors, and you want to make them interchangeable.
* You want to select an algorithm at runtime based on the client's requirements.
* You want to define a family of algorithms, encapsulate each one, and make them independent of the client code that uses them.
* You want to avoid creating multiple subclasses to represent variations of an algorithm.

The Strategy pattern promotes flexibility, maintainability, and extensibility in your code by allowing you to change or add new algorithms without affecting the client code. It separates the behavior from the context, making it easier to manage and test individual algorithms independently.

In summary, use the Strategy pattern when you need to manage a set of interchangeable algorithms or behaviors in a flexible and maintainable way.