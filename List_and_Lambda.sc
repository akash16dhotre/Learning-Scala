object List_and_Lambda {
  // Let us create a list in scala
  var nums = List(4,7,2,3)                        //> nums  : List[Int] = List(4, 7, 2, 3)
  
  for(n <- nums) println(n)                       //> 4
                                                  //| 7
                                                  //| 2
                                                  //| 3
	// Lambda expression
	nums.foreach{i:Int => println(i)}         //> 4
                                                  //| 7
                                                  //| 2
                                                  //| 3
}