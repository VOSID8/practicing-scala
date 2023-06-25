import scala.util.Random

object L9Options {
  
    val myFirstOption: Option[Int] = Some(4)
    val noOption: Option[Int] = None

    println(myFirstOption) //Some(4)
    println(noOption) //None

    def unsafeMethod(): String = null
    //val result = Some(unsafeMethod()) //WRONG
    //some is a companion object of Option
    //it should have a valid value inside
    val result = Option(unsafeMethod()) //Some(null)
    println(result) //Some(null)
    val result2 = unsafeMethod() //null
    def backupMethod(): String = "A valid result"
    val chainedResult = Option(unsafeMethod()).orElse(Option(backupMethod()))
    println(chainedResult) //Some(A valid result)

    //Design unsafe APIs
    def betterUnsafeMethod(): Option[String] = None
    def betterBackupMethod(): Option[String] = Some("A valid result")

    val betterChainedResult = betterUnsafeMethod() orElse betterBackupMethod()
    //it has already been wrapped in an Option so we don't need to do it again

    //functions on Options
    println(myFirstOption.isEmpty) //false
    println(myFirstOption.get) //4
    //println(noOption.get) //NoSuchElementException

    //map, flatMap, filter
    println(myFirstOption.map(_ * 2)) //Some(8)
    println(myFirstOption.filter(_ > 10)) //None
    println(myFirstOption.flatMap(x => Option(x * 10))) //Some(40)

    //for-comprehensions

    //Exercise
    val config: Map[String,String] = Map(
        //fetched from elsewhere
        "host" -> "176.45.36.1",
        "port" -> "80"
    )

    class Connection {
        def connect = "Connected" //connect to some server
    }
    object Connection {
        val random = new Random(System.nanoTime())
        def apply(host: String, port: String): Option[Connection] =
            if (random.nextBoolean()) Some(new Connection)
            else None
    }    
 }
