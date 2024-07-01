package practical3

object mean {
  def mean(num1: Int, num2: Int): String = {
    val average = (num1 + num2) / 2.0
    f"$average%.2f"
  }

  def main(args: Array[String]): Unit = {
    val num1 = 5
    val num2 = 10
    val result = mean(num1, num2)
    println(s"The mean of $num1 and $num2 is $result")
  }
}
