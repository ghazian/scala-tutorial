package lectures.basics

object ValuesVariablesTypes extends App {

  // Val are immutable
  // Compiler can infer types
  val x: Int = 42
  println(x)

  val aString: String = "Hello World!"
  val anotherString = "goodbye!"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4121
  val aLong: Long = 123123123123123L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.123

  // Variables
  var aVariable: Int = 4
  aVariable = 3 //Variables are known as side effects - changing something in console
}
