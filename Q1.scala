object Q1 extends App{

  def filterEvenNumbers(integerList: List[Int]): List[Int] = {
    integerList.filter(integer => integer % 2 == 0) //each element of the list is passed to the 'integer' parameter //the expression will evaluate to true or false
  }

  var inputList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  var outputList = filterEvenNumbers(inputList)
  print(outputList)

}
