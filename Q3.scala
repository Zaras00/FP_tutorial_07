object Q3 extends App{

  def filterPrime(integerList: List[Int]): List[Int] = {
    integerList.filter(integer => {
      if (integer <= 1) false
      else if (integer == 2) true
      else !(2 to Math.sqrt(integer).toInt).exists(x => integer % x == 0) //The exists method checks if there exists elements in this range that satisfy the predicate
    })
  }

  var inputList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  var outputList = filterPrime(inputList)
  print(outputList)

}