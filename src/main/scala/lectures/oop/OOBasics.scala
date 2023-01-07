package lectures.oop

object OOBasics extends App {

//  val person = new Person("John", 23)
//  println(person.age)

  val author = new Writer("james", "rodrigo", 1812)
  val novel = new Novel("The Great Expectatyions", 1861, author)

  println(novel.authorAge)
  println(novel.isWrittenBy(author))
  println(novel.copy(2023))
}
// Class parameters are not FIELDS
class Person(name: String, val age: Int) {

  val x = 2
  println( 1 + 3 )

  def greet(name: String): Unit = println()
}

// Exercise
/*
  Novel and a Writer
  Writer: first name, surname, year
    - method fullname
  Novel: name, year of release, author
    - method authorAge
    - isWrittenBy (author)
    - copy (new year of release) = new instance of Novel
*/

/*
  Counter Class
    - receives an int value
    - method current count
    - method to increment/decrement => new Counter
    - overload inc/dec to receive an amount
*/

class Writer(firstName: String, surname: String, val year: Int) {
  def fullName(): String = s"$firstName $surname"
}

class Novel(name: String, year: Int, author: Writer) {
  def authorAge: Int = year - author.year
  def isWrittenBy(author: Writer): Boolean = author == this.author
  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}
//

class Counter(val count: Int) {
  def inc: Counter = {
    println("Incrementing")
    new Counter(count + 1)
  } // immutability

  def dec: Counter = {
    println("Decrementing")
    new Counter(count - 1)
  }

  def inc(n: Int) = new Counter(count + n)
  def dec(n: Int) = new Counter(count + n)
}













