
object L8TuplesAndMaps extends App {
    //tuples- finite ordered "lists"
    //tuples can group at most 22 elements of different types
    //tuples are difference from lists because they can group different types of elements
    //list can only group elements of the same type
    val aTuple = (2,"Hello Scala") 
    println(aTuple._1) //2
    println(aTuple.copy(_2 = "Goodbye Java")) //(2,Goodbye Java)
    println(aTuple.swap) //("Hello Scala",2)

    //maps
    val aMap: Map[String,Int] = Map()
    val phoneBook = Map(("Jim",555),("Daniel",789)).withDefaultValue(-1)
    //a -> b is sugar for (a,b)
    //withDefaultValue is a method that returns a default value if the key is not found
    println(phoneBook)
    println(phoneBook.contains("Jim"))
    println(phoneBook("Jim"))
    println(phoneBook("Mary")) //returns -1 because of withDefaultValue
    val newPairing = "Mary" -> 678
    val newPhoneBook = phoneBook + newPairing
    println(newPhoneBook)

    //functions on maps
    //map, flatMap, filter
    println(phoneBook.map(pair => pair._1.toLowerCase -> pair._2))
    //result: Map(jim -> 555, daniel -> 789)
    //filterKeys
    println(phoneBook.filterKeys(x => x.startsWith("J")))

    //mapValues
    println(phoneBook.mapValues(number => "0245-" + number))

    //conversions to other collections
    println(phoneBook.toList)
    println(List(("Daniel",789)).toMap)
    val names = List("Bob","James","Angela","Mary","Daniel","Jim")

    println(names.groupBy(name => name.charAt(0)))
    //result: Map(J -> List(James, Jim), A -> List(Angela), M -> List(Mary), B -> List(Bob), D -> List(Daniel))

    /*
    1. What would happen if I had two original entries "Jim" -> 555 and "JIM" -> 900
    2. Overly simplified social network based on maps
        Person = String
        - add a person to the network
        - remove
        - friend (mutual)
        - unfriend
        - number of friends of a person
        - person with most friends
        - how many people have NO friends
        - if there is a social connection between two people (direct or not)
    */

    //1) Resulting keys should not overlap
    def add(network: Map[String,Set[String]], person: String): Map[String,Set[String]] = {
        network + (person -> Set())
    }
    def friend(network: Map[String,Set[String]], a: String, b: String): Map[String,Set[String]] = {
        val friendsA = network(a)
        val friendsB = network(b)
        network + (a -> (friendsA + b)) + (b -> (friendsB + a))
    }

    def unfriend(network: Map[String,Set[String]], a: String, b: String): Map[String,Set[String]] = {
        val friendsA = network(a)
        val friendsB = network(b)
        network + (a -> (friendsA - b)) + (b -> (friendsB - a))
    }
    def remove(network: Map[String,Set[String]],a: String, b: String): Map[String,Set[String]] = {
        val unfriended = unfriend(network,a,b)
        unfriended - a - b
    } 
    val empty: Map[String,Set[String]] = Map()
    val network = add(add(empty,"Bob"),"Mary")
    println(network) //Map(Bob -> Set(), Mary -> Set())
    println(friend(network,"Bob","Mary"))
    println(unfriend(friend(network,"Bob","Mary"),"Bob","Mary"))
    println(remove(friend(network,"Bob","Mary"),"Bob","Mary"))

    //Jim, Bob, Mary
    val people = add(add(add(empty,"Bob"),"Mary"),"Jim")
    val jimBob = friend(people,"Bob","Jim")
    val testNet = friend(jimBob,"Bob","Mary")
    println(testNet) //Map(Jim -> Set(Bob), Bob -> Set(Jim, Mary), Mary -> Set(Bob))

    def nFriends (network: Map[String,Set[String]], person: String): Int = {
        if(!network.contains(person)) 0
        else network(person).size
    }
    println(nFriends(testNet,"Bob")) //2

    def mostFriends(network: Map[String,Set[String]]): String = {
        network.maxBy(pair => pair._2.size)._1
        //this is the same as network.maxBy(_._2.size)._1
        //
    }
    println(mostFriends(testNet)) //Bob
    
    def nPeopleWithNoFriends(network: Map[String,Set[String]]): Int = {
        network.count(_._2.isEmpty)
        //network.filterKeys(k => network(k).isEmpty).size
    }

    println(nPeopleWithNoFriends(testNet)) //0
    def SocialConnection(network: Map[String, Set[String]], a:String,b:String): Unit = {
        def bfs(target: String, consideredPeople: Set[String], discoveredPeople: Set[String]): Boolean = {
            if(discoveredPeople.isEmpty) false
            else {
                val person = discoveredPeople.head
                if(person == target) true
                else if(consideredPeople.contains(person)) bfs(target,consideredPeople,discoveredPeople.tail)
                else bfs(target,consideredPeople + person, discoveredPeople.tail ++ network(person))
            }
        }
    }

}
