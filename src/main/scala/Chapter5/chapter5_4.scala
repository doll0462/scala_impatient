package Chapter5

//4. Reimplement the Time class of preceding problem
// to internal representation is to be minutes after midnight (0 and 24 * 60 - 1).
// Don't modify public interface.
// In other words, client code should not be affected from this changes.

object chapter5_4 {

  class Time {
    private var hrs = 0
    private var min = 0
    private var time = 0

    def this(hrs: Int, min: Int) {
      this()
      this.hrs = hrs
      this.min = min
      this.time = hrs * 60 + min
    }

    def before(other : Time): Boolean = {
      hrs < other.hrs || (hrs == other.hrs && min < other.min)
    }

  }

}
