package Chapter6

import scala.collection.mutable.Stack
import scala.collection.mutable.ArrayBuffer

//Write a scala application that prints command line instances
// in reverse order, seperated by spaces using App trait.

object chapter6_5 extends App {

  var stack = new Stack[String]
  var buffer = new ArrayBuffer[String]()

  if(args.length >0)
    for(i <- 0 to args.length -1)
      stack.push(args(i))

  for(i <- 0 to stack.length -1) buffer += stack.pop();

  print(buffer.mkString(" "))

}
