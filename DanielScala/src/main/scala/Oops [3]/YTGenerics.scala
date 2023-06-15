object YTGenerics {
  
    val aList = List(1,2,3)
    val aNumber = 42
    val appendList = aList :+ aNumber // List(1,2,3,42)

    trait MyList[A] {
        def head: A
        def tail: MyList[A]
    } // Generic class 

    class NonEmptyList[A](h: A, t: MyList[A]) extends MyList[A] {
        def head: A = h // h is the head of the list
        def tail: MyList[A] = t
    } // Generic class with parameters  

    val someNumbers: MyList[Int] = new NonEmptyList[Int](1, new NonEmptyList[Int](2, new NonEmptyList[Int](3, EmptyList)))

    case class GoodList[A](head: A, tail: GoodList[A]) extends GoodList[A] // Generic class with parameters and case class
    // case class has already implemented equals, hashCode, toString, copy methods
    trait MyMap[Key, Value]{
        def get(key: Key): Value
        def set(key: Key, value: Value): MyMap[Key, Value]
    } // Generic trait

    def main(args: Array[String]): Unit = {
        println(aList)
    }
}
