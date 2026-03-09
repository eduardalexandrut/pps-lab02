package it.unibo.pps.u02

object CurryingExercise {

  val p1: (x: Int) => (y: Int) => (z: Int) => Boolean = x => y => z => x <= y && y == z

  val p2: (Int, Int, Int) => Boolean = (x: Int, y: Int, z: Int) => x <= y && y == z

  def p3(x: Int)(y: Int)(z: Int): Boolean = x <= y && y == z

  def p4(x: Int,y: Int,z: Int): Boolean = x <= y && y == z

  def compose(f: Int => Int, g: Int => Int): Int => Int = (n: Int) => f(g(n))

 // @main
  def main: Unit =
    println(compose(_ - 1, _ * 2)(5))
}
