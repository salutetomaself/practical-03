package practical3

import scala.io.StdIn.readLine

object reverse {
  def reverseString(s: String): String = {
    if (s.isEmpty) ""
    else reverseString(s.tail) + s.head
  }

  def main(args: Array[String]): Unit = {
    println("Enter a string to reverse:")
    val originalString = readLine()
    val reversedString = reverseString(originalString)
    println(s"Original String: $originalString")
    println(s"Reversed String: $reversedString")
  }
}
