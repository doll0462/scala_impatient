package Chapter3

import scala.util.Random

object chapter3_1 {

  def main(args: Array[String]): Unit = {

    print("Enter n : ")

    val n = readInt()
    val arr = new Array[Int](n)
    for(i <- 0 until arr.length) arr(i)=(Random.nextInt(n+1))

    println(arr.mkString(","))

  }

}
