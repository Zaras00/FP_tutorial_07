object Q2 extends App{

  def calculateSquare(integerList: List[Int]): List[Int] = {
    integerList.map(integer => integer * integer)
  }

  var inputList = List(1, 2, 3, 4, 5)
  var outputList = calculateSquare(inputList)
  print(outputList)

}