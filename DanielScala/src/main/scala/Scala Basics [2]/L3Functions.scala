object Functions extends App {

    def aFunction(a: String, b: Int): String = {
        a + " " + b // this is an expression
    }

    println(aFunction("hello", 3))

    def aParameterlessFunction(): Int = 42
    println(aParameterlessFunction())
    println(aParameterlessFunction) // this is also valid

    def aRepeatedFunction(aString: String, n: Int): String = {
        if(n == 1) aString
        else aString + aRepeatedFunction(aString, n-1)
        //this is a recursive function
    }
    println(aRepeatedFunction("hello", 3))
    // when you need loops, use recursion

    //1) 
    def greetingForKids(name: String, age: Int): String = {
        "Hi, my name is " + name + " and I am " + age + " years old."
    }
    def greetingForKids2(name: String, age: Int): String = {
        s"Hi, my name is $name and I am $age years old."
    }

    def factorial(n: Int): Int = {
        if(n <= 0) 1
        else n * factorial(n-1)
    }
    def fibonacci(n: Int): Int = {
        if(n <= 2) 1
        else fibonacci(n-1) + fibonacci(n-2)
    }

    def isPrime(n: Int): Boolean = {
        def isPrimeUntil(t: Int): Boolean = {
            if(t <= 1) true
            else n % t != 0 && isPrimeUntil(t-1)
        }
        isPrimeUntil(n / 2)
    }
  
}
