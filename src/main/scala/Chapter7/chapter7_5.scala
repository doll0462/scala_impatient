package Chapter7

//5. What is the meaning of private[com] def giveRaise(rate: Double)?
// Is this useful?
object chapter7_5 {

  // giveRaise라는 이름의 함수는 Double형 rate를 리턴하는데
  // 이는 private[com]으로 설정되어 com이라는 package 에서만 접근 가능하다.
  // 다른 package 였다면 접근지정자를 통하여 더 세밀하게 접근을 제어할 수 있으므로 유용할 수 있겠으나,
  // com은 매우 흔한 package 명이므로 유용하지 않다.

}
