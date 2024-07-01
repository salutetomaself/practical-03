package practical3

object listofst {
  def filterLongStrings(strings: List[String]): List[String] = {
    strings.filter(_.length > 5)
  }

  def main(args: Array[String]): Unit = {
    val inputList = List("Scala", "is", "awesome", "and", "powerful")
    val filteredList = filterLongStrings(inputList)
    println(s"Original List: $inputList")
    println(s"Filtered List (length > 5): $filteredList")
  }
}
