# Laboratory work no. 5

## Theme: Inheritance

**Task 1**

Create 10 classes with their names as first 10 aphabetical letters (A, B, C, D, ... , J). Each next class inherits from previous letter class (ex: B inherits from A, C inherits from B ...).Each class should have their own String property with corresponding letter as their refference (ex: A - public String a; public B - String b; ... J - public String j;).

Create by an object of each class type and print it in console in a clever way (such that to be clear each objects states).

**Task 2**
Change all states from previous classes from public access specifiers to protected. Create class X which has a private String name property that should have also a constructor for that X. Add a object of X to A class as a state and modify the constructor of A from A(new String("blabla")) to A(new String("blabla"), new X("some name")).
Finally print J and see what happens states does it have.

**Task 3**

Add initial value to state X from class A. (ex: protected X x = new X("xxx")). Print a object of J and see the result.
Go in class D and create also a state with the same name x as in class A and give another initial value. Print the result and checkout if any changes.
