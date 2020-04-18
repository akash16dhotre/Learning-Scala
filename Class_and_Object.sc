object Demo {
// Use special keyword "case". The below line of code creates a class; () is a constructor
// Understand that this entire thing when written in Java will be of ~ 70 lines
// The values after "=" are default values
case class Student(var rollno : Int = 1, var name : String = "Akash", var marks : Int = 90)

// We create an object; In s1 default values were assigned as there were no inputs
var s1 = Student();                               //> s1  : Demo.Student = Student(1,Akash,90)
var s2 = Student(4, "Navin", 92);                 //> s2  : Demo.Student = Student(4,Navin,92)
// Scala will be confused. Because there is a mismatch in the type; Let us comment the next command and retype it
//var s3 = Student("Rahul");
var s3 = Student(name = "Rahul");                 //> s3  : Demo.Student = Student(1,Rahul,90)
}