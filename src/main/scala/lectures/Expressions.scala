package lectures

object Expressions extends App {

  // This is an expression
  val x = 1 + 2
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>>

  println(1 == x)

  println(!(1 == x))

  var aVariable = 2
  aVariable += 3 // This is a sideffects
  println(aVariable)

  // Instructions (DO) vs Expressions (VALUE)

  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // IF EXPRESSION
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)

  // AVOID WHILE LOOPS
  // EVERYTHING IN SCALA IS AN EXPRESSION!
  var i = 0
  while (i < 10){
    println(i)
    i += 10
  }

  // Side effects are returning Unit
  val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue)

  // side effects: println(), whiles, reassigning

  // Code Blocks
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

  val someValue = {
    2 < 3
  }
  println(someValue)
}
