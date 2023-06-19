

abstract class MyList {
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
  def printElements: String //polymorphic call
                            //here we would need to override this method in the child class
                            //verna missing implementation
  override def toString: String = "[" + printElements + "]"
}

object Empty extends MyList {
  def head = throw new NoSuchElementException
  def tail = throw new NoSuchElementException
  def isEmpty = true
  def add(element: Int): MyList = new Cons(element, Empty)
  def printElements: String = ""
}

class Cons(h: Int, t: MyList) extends MyList {
  def head: Int = h
  def tail: MyList = t
  def isEmpty: Boolean = false
  def add(element: Int): MyList = new Cons(element, this) //Cons hii return horha
  def printElements: String = 
    if(t.isEmpty) "" + h
    else h + " " + t.printElements //recursive call
}

object ListTest extends App {
  val list = new Cons(1, Empty)
  println(list.head)
  val list2 = new Cons(1, new Cons(2, new Cons(3, Empty)))
  println(list2.tail.head)
  println(list2.add(4).head) //add method returns a new list with the element added 
  // println(list2.printElements)
  println(list2.toString) //will call toString method of the object
                          //that will call printElements method of the object
  //println(list2) //syntactic sugar for println(list2.toString) as toString is a method of the object
  //plymorphic call where the most derived method will be called at runtime


}