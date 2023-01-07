package lectures.basics

object Functions extends App {

  // A block is an expression and the result is the last consituent value
  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 3))

  def aParameterlessFunction(): Int = 42

  println(aParameterlessFunction())

  // WHEN YOU NEED LOOPS, USE RECURSION
  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("Hello", 3))

  // Use this when console logging or want to display something
  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n - 1)
  }

  // TASK
  def greeting(name: String, age: Int): String = {
    "Hi my name is " + name + " and I am " + age + " years old"
  }

  println(greeting("Ghazian", 24))
}
