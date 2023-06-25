

object L3 extends App {

    try {
        val x: String = null
        println(x.length)
    } catch {
        case e: Exception => println("Exception caught")
    } finally {
        println("finally")
    } 

}
