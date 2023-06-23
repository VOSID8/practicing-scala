object Solution {
  //https://leetcode.com/problems/find-the-highest-altitude/
  def largestAltitude(gain: Array[Int]): Int = {
    def calculateAltitude(gain: Array[Int], currentAltitude: Int, maxAltitude: Int, index: Int): Int = {
      if (index >= gain.length) maxAltitude
      else {
        val nextAltitude = currentAltitude + gain(index)
        val nextMaxAltitude = math.max(maxAltitude, nextAltitude)
        calculateAltitude(gain, nextAltitude, nextMaxAltitude, index + 1)
      }
    }

    calculateAltitude(gain, 0, 0, 0)
  }
}
