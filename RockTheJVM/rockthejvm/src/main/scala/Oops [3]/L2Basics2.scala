object L2Basics2 extends App {

    val author = new Writer("Charles", "Dickens", 1812)
    val imposter = new Writer("Charles", "Dickens", 1812)
    val novel = new Novel("Great Expectations", 1861, author)
    println(novel.authorAge())
    println(novel.isWrittenBy(author))
    println(novel.isWrittenBy(new Writer("Charles", "Dickens", 1812)))
    //BRUH WTFFFF
    //AREEE HADH HOGYI
    println(novel.isWrittenBy(imposter))
    // 1) Novel and writer
    // Writer: first name, surname, DOB
    // - method fullname
    // Novel: name, year of release, author
    // - authorAge
    // - isWrittenBy(author)
    // - copy (new year of release) = new instance of Novel

    case class Writer(firstName: String, surname: String, DOB: Int){
        def fullname(): String = firstName + " " + surname

    }
    case class Novel(name: String, year: Int, author: Writer){
        def authorAge(): Int = year - author.DOB
        def isWrittenBy(author: Writer): Boolean = author == this.author
        //author == this.author match the authors, class wala and parameter wala
        def copy(newYear: Int): Novel = new Novel(name, newYear, author)
    }

    //2) Counter class
    // - receives an int value
    // - method current count
    // - method to increment/decrement => new Counter   
    // - overload inc/dec to receive an amount

    class Counter(val count: Int = 0){
        def inc = {
            println("incrementing")
            new Counter(count + 1) // immutability
            
        }
        def dec = {
            println("decrementing")
            new Counter(count - 1)
        }
        def inc(n: Int): Counter = {
            if(n <= 0) this
            else inc.inc(n-1) // tail recursion
            //inc uske baad inc(n-1) call hoga
        }
        def dec(n: Int): Counter = {
            if(n <= 0) this
            else dec.dec(n-1)
        }
        def print = println(count)
    }
    val counter = new Counter
    println(counter.inc.count)
    println(counter.inc.inc.inc.count)
    counter.inc.inc.inc.print
    println(counter.inc(10).count)
}
