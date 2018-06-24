package lectures.part1basics

/**
  * Created by Alexander Krasovsky on 24.06.2018.
  */
object Functions extends App {

  def aFunction(a: Int, b: String): String = {
    a + " " + b
  }

  println(aFunction(1, "pew"))


  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n -1)
  }

  //WHEN YOU NEED LOOPS, USE RECURSION

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b
    aSmallerFunction(n, n -1)
  }

  //1 greeting function
  def aGreetingFunction(name: String, age: Int): Unit = {
    println("Hi, my name is " + name + " and I am " + age + " years old.")
  }
  aGreetingFunction("David", 12)

  //2 factorial function 1 * 2 * 3 * ... * n
  def factorial(n: Int): Int = {
    if (n == 1) n
    else computeFactorialNextValue(1, 1, n)
  }
  private def computeFactorialNextValue(accumulatedValue: Int, iterationIndex: Int, stopAtIteration: Int): Int = {
    val result = accumulatedValue * iterationIndex
    if (stopAtIteration == iterationIndex) {
      result
    } else {
      val nextIteration = iterationIndex + 1
      computeFactorialNextValue(result, nextIteration, stopAtIteration)
    }
  }

  println(factorial(4))

  //3 A Fibonacci Function
  def fibonacci(n: Int): Int = {
    if (n >= 0 && n <= 2) 1
    else computeNextFibonacci(1, 1, 3, n)
  }

  private def computeNextFibonacci(nTwoIterationsBefore: Int, nOneIterationBefore: Int, currentIteration: Int, stopAtIteration: Int): Int = {
    val result = nTwoIterationsBefore + nOneIterationBefore
    if (stopAtIteration == currentIteration) {
      result
    } else {
      val nextIteration = currentIteration + 1
      computeNextFibonacci(nOneIterationBefore, result, nextIteration, stopAtIteration)
    }
  }

  println(fibonacci(2))
  println(fibonacci(3))
  println(fibonacci(8))
}
