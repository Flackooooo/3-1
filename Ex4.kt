fun main(args: Array<String>) {
    val rows = 5

    for (num in rows downTo 1) {
        if(num == 3){
        	continue
        }
        for (dot in 1 .. num) {
            print("* ")
        }
        println(" ")
    }
}