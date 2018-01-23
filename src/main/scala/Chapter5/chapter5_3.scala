package Chapter5

//3. Write a Time class that has read-only property hours and minutes and a method
// before(other: Time) : Boolean that checking if this time is earlier than other time or not.
// Time object can be constructed by new Time(hrs, min) and here, hrs is military time format (0~23).

object chapter5_3 {

  class Time {
    private var hrs = 0
    private var min = 0

    def this(hrs: Int, min: Int) {
      this()
      this.hrs = hrs
      this.min = min
    }

    def before(other : Time): Boolean = {
      hrs < other.hrs || ( hrs == other.hrs && min < other.min )
    }

  }
}
