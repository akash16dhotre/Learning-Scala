object DemoScala {
  println("Hello Akash")                          //> Hello Akash
// In Scala everythhinig is method and object
var num1 : Int = 8                                //> num1  : Int = 8
var num2 : Int = 7                                //> num2  : Int = 7
// num1 = 23 -> "This will work but avoid mutation. Scala believes in concurrency.
// Changing is good. Sharing is good. But, both should not happen at the same time!! :)
println(num1+num2)                                //> 15

// + is a function and not a operator. This is like operator overloading
// Imagine 8 is a object; + is a function; 7 is the parameter
//Scala = Object Oriented and Functional programming
var result = 8.+ (7)                              //> result  : Int = 15

}