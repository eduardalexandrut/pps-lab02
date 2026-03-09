package it.unibo.pps.u02

enum Expr:
    case Literal(n: Int)
    case Add(x: Expr, y: Expr)
    case Mult(x: Expr, y: Expr)

object Evaluator {


  def evaluate(expr: Expr): Int = expr match
    case Expr.Literal(n) => n
    case Expr.Add(x, y) => evaluate(x) + evaluate(y)
    case Expr.Mult(x, y) => evaluate(x) * evaluate(y)

  def show(expr: Expr): String = expr match
    case Expr.Literal(n) => s"$n"
    case Expr.Add(x, y) => s"(${show(x)} + ${show(y)})"
    case Expr.Mult(x, y)=> s"${show(x)} * ${show(y)}"

  @main def run(): Unit =
    val myExpr = Expr.Add(Expr.Literal(2), Expr.Literal(3))
    println(Evaluator.show(myExpr))
}
