abstract class MyList{

    /*
        head = first element of the list
        tail = remainder of the list
        isEmpty = is this list empty
        add(int) => new list with this element added
        toString => a string representation of the list
    */

    def head: Int
    def tail: MyList
    def isEmpty: Boolean
    def add(element: Int): MyList
    override def toSting : String = "[" + printElements + "]"
}

object EmptyList extends MyList{
    def head: Int = throw new NoSuchElementException
    def tail: MyList = throw new NoSuchElementException
    def isEmpty: Boolean = true
    def add(element: Int): MyList = new NonEmptyList(element, EmptyList)
    override def toString: String = ""
}
class Cons(h: Int, t: MyList) extends MyList{
    def head: Int = h // h is the head of the list
    def tail: MyList = t
    def isEmpty: Boolean = false 
    def add(element: Int): MyList = new Cons(element, this)
    override def toString: String = {
        //here we are using recursion to print the list 
        if(t.isEmpty) "" + h
        else h + " " + t.toString
    }
}
object ListTest extends App{
    val list = new Cons(1, new Cons(2, new Cons(3, EmptyList)))
    println(list.tail.head)
    println(list.add(4).head)
    println(list.isEmpty)
    println(list.toString)
}