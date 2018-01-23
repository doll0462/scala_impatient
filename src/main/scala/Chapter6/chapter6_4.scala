package Chapter6

//4. Define Point class with companion object
// so that it can generate Point instance like Point(3,4) without new.

object chapter6_4 {

  class Point private (val x: Int, val y: Int) {

  }

  object Point {
    def apply(x: Int, y: Int): Point = new Point(x,y)
  }

}
