# Laboratory work no. 8
## Theme: Interfaces and abstract classes

Task1

We have the following class hierarchy:

Base Class GeometricBody with the following abstract methods 
- getSurface(), getVolume() which return the surface and the volume of some figure.

And the child classes of GeometricBody - Cub, Sphere, Parallelepiped. 

In main is created a object of each type of GeometricBody and put all in a array of GeometricBody's.

Task2

The class GeometricBodyController has a method which gets as parameter a list of GeometricBody's 
and return the one with the biggest Volume.

The second method gives the body with the biggest Surface.

Task3
Change the abstract class GeometricBody to a interface and resolve any error if occured.