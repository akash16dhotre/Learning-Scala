object CreatingMethods {

	case class Student(var rollno : Int = 1, var name : String = "Akash", var marks : Int = 90)
	{
		// We are creating method; mention = sign and perform anything
		def show() = println("Hello!!");
		def > (s2 : Student) : Boolean = marks > s2.marks
		// Multiple line code can be written there in the curly bracket
		// {
		//	 println("Hello!");
		// }
	}
	
	// We give 2 inpuuts and compare them
	var s1 = Student();                       //> s1  : CreatingMethods.Student = Student(1,Akash,90)
 	var s2 = Student(2, "Rahul", 96)          //> s2  : CreatingMethods.Student = Student(2,Rahul,96)
 	s1.>(s2)                                  //> res0: Boolean = false
}