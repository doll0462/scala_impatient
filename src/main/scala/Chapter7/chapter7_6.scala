package Chapter7

import java.util.{HashMap => JavaHashMap}
import scala.collection.JavaConverters._
import scala.collection.mutable.{HashMap => ScalaHashMap}

//6. Write a program that copies all elements from java hashmap to scala hashmap.
// Use import to rename two classes.

object chapter7_6 extends App{

  val jHashmap = new JavaHashMap[Int, String]() {
    put(1,"one"); put(2,"two"); put(3,"three"); put(4,"four")
  }

  val sHashmap = new ScalaHashMap[Int, String]()
  sHashmap ++= jHashmap.asScala

  print(sHashmap)

}