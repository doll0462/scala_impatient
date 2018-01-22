package Chapter4

import java.io.File
import java.util.Scanner
import scala.collection.mutable

object chapter4_2 {

  def main(args: Array[String]): Unit = {

    //2. Write a program that reads words from File.
    // Use mutable map counts how often each word appears.
    // To read words, simply use java.util.Scanner.
    // val in = new java.util.Scanner(java.io.File("myfile.txt"))
    // while (in.hasNext()) process in.next()
    // Or look at Chapter 9 for Scala way.
    // At the end, print all words and their counts.

    val in = new Scanner(new File("C:/in.txt"))
    var map = new mutable.HashMap[String, Int]

    def process(str: String) = {
      var containStr = map.getOrElse(str, 0)
      map(str)= containStr+1
    }
    while (in.hasNext()) process(in.next())
    map
    print(map)

  }


}
