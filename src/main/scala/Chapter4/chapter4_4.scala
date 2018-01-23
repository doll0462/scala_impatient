package Chapter4

import java.io.File
import java.util.Scanner
import scala.collection.immutable.SortedMap
import scala.collection.mutable

// 4. Repeat chaper4_2 with an sorted map
// to print words in sorted order.

object chapter4_4 {

  def main(args: Array[String]): Unit = {

    val in = new Scanner(new File("C:/in.txt"))
    var map = new mutable.HashMap[String, Int]

    def process(str: String) = {
      var containStr = map.getOrElse(str, 0)
      map(str)= containStr+1
    }
    while (in.hasNext()) process(in.next())
    map

    val stMap = SortedMap[String, Int]() ++map
    print(stMap)

  }

}
