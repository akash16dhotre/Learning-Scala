object Playing_with_List {
  // Define a list
  var nums = List(4,7,2,3,8,6)                    //> nums  : List[Int] = List(4, 7, 2, 3, 8, 6)
  // Reverse a list; Behind the scene it creates a new list
  // The benefit is we are not chhanging thhe existing
  nums.reverse                                    //> res0: List[Int] = List(6, 8, 3, 2, 7, 4)
  // This will drop as well as take 2
  //nums.drop(2) =====> nums drop 2 (This will give same output: Syntactic Sugar)
  
  // Remove first two element from the list; display next 2
  nums drop 2 take 3                              //> res1: List[Int] = List(2, 3, 8)

  nums.foreach{i:Int => println(i)}               //> 4
                                                  //| 7
                                                  //| 2
                                                  //| 3
                                                  //| 8
                                                  //| 6
	case class Stud(rollno: Int, name : String, marks : Int)
	val students = List(Stud(1, "Akash",40), Stud(2, "Navin", 80), Stud(3, "Rahul",61), Stud(3, "Mohini",50))
                                                  //> students  : List[Playing_with_List.Stud] = List(Stud(1,Akash,40), Stud(2,Nav
                                                  //| in,80), Stud(3,Rahul,61), Stud(3,Mohini,50))
 	val first = students.head                 //> first  : Playing_with_List.Stud = Stud(1,Akash,40)
 	val rest = students.tail.head             //> rest  : Playing_with_List.Stud = Stud(2,Navin,80)
 //	val rest = students.tail.tail <==== This is also valid
	
	// Toppers scoring more than 60
	val toppers = students.filter(s => s.marks >= 60)
                                                  //> toppers  : List[Playing_with_List.Stud] = List(Stud(2,Navin,80), Stud(3,Rahu
                                                  //| l,61))
  // Partition
  // The output is in two lists. Meditate on the output :)
  // With (part1, part2) we used tuples
  val (part1, part2) = students.partition(s => s.marks>=60)
                                                  //> part1  : List[Playing_with_List.Stud] = List(Stud(2,Navin,80), Stud(3,Rahul,
                                                  //| 61))
                                                  //| part2  : List[Playing_with_List.Stud] = List(Stud(1,Akash,40), Stud(3,Mohini
                                                  //| ,50))


}