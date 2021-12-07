## Java14

March 17, 2020 Release Date


### Switch Expressions
Switch Expressions after staying a preview feature in the last two releases –Java 12 and Java 13 have finally attained permanent status in Java 14.
Java 12 introduced the lambda syntax for switch expressions thereby allowing multiple case 
labels for pattern matching as well as preventing fall-throughs which lead to verbose code. 
It also enforced exhaustive cases wherein a compilation error would be thrown if all the input cases aren’t covered.
Java 13, the second preview introduced yield statements instead of break for returning values from an expression.

J14 has these features standard now. Which means its in production and good to use.

Note: Yield isn’t a new keyword in Java. It’s just used in switch expressions.

### Pattern Matching
Since J12 This is Preview mode - https://openjdk.java.net/jeps/305
`if (obj instanceof Customer customer) {
   System.out.println(customer.getFirstName());
 }`
 
### NullPointerExceptions (NPE)
This is a Production ready feature and shipped with J14.
Until J13, Figuring out the NPE in a custom object with fields was not feasible.
J14 introduces new features for Null identification specific to field in object. 
JEP 358

Configure gradle task to print NPE expception.
Command Line args can be used as well.

### Records Preview Feature
https://openjdk.java.net/jeps/359
A record is a data class that stores pure data. 
The idea behind introducing records is to quickly create simple and concise classes devoid of boilerplate code.
The Java compiler will generate a constructor, private final fields, accessors, equals/hashCode and toString methods automatically.
`record Customer(String firstName, String lastName){}
`
if you want to view the compiled code, goto the output directory.
> javap Customer

Few important things to note about Records:

A record can neither extend a class nor it can be extended by another class. It’s a final class.
Records cannot be abstract
Records cannot extend any other class and cannot define instance fields inside the body. Instance fields must be defined in the state description only
Declared fields are private and final
The body of a record allows static fields and methods
Records can implement a interface.

https://www.journaldev.com/39987/java-records-class

### Text Blocks
Preview feature
Backslash for displaying nice-looking multiline string blocks.
\s is used to consider trailing spaces which are by default ignored by the compiler. It preserves all the spaces present before it.

`
String text = """
                 Did you know \
                 Java 14 \
                 has the most features among\
                 all non-LTS versions so far\
                 """;
  
 String text2 = """
                 line1
                 line2 \s
                 line3
                 """;
  
  
 String text3 = "line1\nline2 \nline3\n"
  
 //text2 and text3 are equal.`
 
### Other Features
