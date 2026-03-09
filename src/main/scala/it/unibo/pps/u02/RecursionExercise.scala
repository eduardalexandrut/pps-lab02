package it.unibo.pps.u02

object RecursionExercise {

  def power(base: Double, exponent: Int): Double = exponent match
    case n if n > 0 => base * power(base, exponent - 1)
    case 0 => 1
    case _ => 0

  def powerTail(base: Double, exponent: Int, curr: Double): Double = exponent match
    case n if n > 0 => powerTail(base, exponent - 1, curr * base)
    case 0 => curr
    case _ => 0

  @main
  def main: Unit =
    println(powerTail(10,2, 1))
}
