package Chapter4

import java.io.File
import java.util.Scanner
import scala.collection.mutable

object chapter4_3 {
  def main(args: Array[String]): Unit = {

    //3. Repeat chaper4_2 with an immutable map.

    val in = new Scanner(new File("C:/in.txt"))
    var map = new mutable.HashMap[String, Int]

    def process(str: String) = {
      var containStr = map.getOrElse(str, 0)
      map(str)= containStr+1
    }
    while (in.hasNext()) process(in.next())
    map

    val imMap = map.toMap
    print(imMap)

  }

}
