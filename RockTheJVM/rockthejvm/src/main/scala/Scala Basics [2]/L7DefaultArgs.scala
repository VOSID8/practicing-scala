object L7DefaultArgs extends App{
  
    def trFact(n: Int, acc: Int = 1): Int = // return type is Int 
        //default value for acc is 1
        if (n <= 1) acc else trFact(n - 1, n * acc)

    val fact10 = trFact(10,1) // acc is 1

    def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = 
        println("saving picture")
    savePicture(width = 800, height = 600) // this will use the default value for format
    //mention the parameter name to use the default value for that parameter


}
