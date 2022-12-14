package lectures

object StringOps extends App {

  val str: String = "Hello I am learning scala"

  println(str.charAt(2))
  println(str.substring(6,11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.length)

  val aNumberString = "45"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z')
  println(str.reverse)
  println(str.take(2))

  // Scala Specific: String interpolators

  // S-interpolators
  val name = "Ghazian"
  val age = 12
  val greeting = s"Hello, my name is $name and I am $age years old"
  val anotherGreeting = s"Hello, my name is $name and I am ${age + 1} years old"
  println(anotherGreeting)

  // F-interpolators
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per minute"
  println(myth)

  // Raw-interporlator
  println(raw"This is a \n newline")
  val escape = "This is a \n newline"
  println(raw"$escape")
}
