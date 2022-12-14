package lectures.oop

object MethodNotation extends App {

  class Person(val name: String, favoriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(nickname: String): Person = new Person(s"${name} ($nickname)", favoriteMovie)
    def unary_! : String = s"$name, ayo whats happenin"
    def unary_+ : Person = new Person(name, favoriteMovie, age + 1)
    def isAlive: Boolean = true
    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"
    def apply(n: Int): String = s"$name watched $favoriteMovie $n times"

    def learns(language: String): String = s"$name is $language!"
    def learnsScala: String = learns("Scala")
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // this is called infix notation = operator notation (syntactic sugar)

  // operators in Scala
  val tom = new Person("Tom", "Fight Club")
  println(mary + tom)
  println(mary.+(tom))

  println(1+2)
  println(1.+(2))

  // ALL OPERATORS ARE METHODS
  // Akka actors have ! ?

  // prefix notation
  val x = -1
  val y = 1.unary_-

  println(!mary)
  println(mary.unary_!)

  // postfix notation, function with no parameters can be in a postfix notation
  println(mary.isAlive)

  //apply
  println(mary.apply())
  println(mary()) //equivalent

  /*
    1. Overload the + operator
      mary + "the rockstar" => return new person "Mary (the rockstar)"

    2. Add an age to the Person class
      Add a unary + operator => new person with the age + 1
      +mary => mary with the age incrementer

    3. Add "learns" method in the Person class => "Mary learns Scala"
      Add a learnsScala method, calls learns method with "Scala"
      Use in postfix notation

    4. Overload the apply method
      mary.apply(2) => "Mary watched Inception 2 times"
  */

  // 1
  println((mary + "the rockstar")())

  // 2
  println((+mary).age)

  // 3
  println(mary.learnsScala)

  // 4
  println(mary.apply(2))

}
