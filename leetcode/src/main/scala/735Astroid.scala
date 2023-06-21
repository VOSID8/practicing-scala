//https://leetcode.com/problems/asteroid-collision/
//Took help of Chat GPT for this problem
//It is really a challenging one
object Solution {
    def asteroidCollision(asteroids: Array[Int]): Array[Int] = {
    def collide(stack: List[Int], asteroid: Int): List[Int] = {
      stack match {
        case head :: tail if head > 0 && asteroid < 0 =>
          if (head == math.abs(asteroid)) tail
          else if (head > math.abs(asteroid)) stack
          else collide(tail, asteroid)
        case _ => asteroid :: stack
      }
    }
    def collapse(remaining: List[Int], stack: List[Int]): List[Int] = {
      remaining match {
        case Nil => stack
        case head :: tail => collapse(tail, collide(stack, head))
      }
    }

    collapse(asteroids.toList, Nil).reverse.toArray
  }
}
