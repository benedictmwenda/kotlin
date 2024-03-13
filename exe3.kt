fun main() {

// m == mean
    val math = 0
    val phy = 0
    val eng = 0
    val comp = 0
    val sum = math + phy + eng + comp
    val m = sum / 4
    println(m)

    if (m >= 80 && m <= 100) {
        println("Grade A")
    } else if (m >= 50 && m <= 79) {
        println("Grade B")
    } else if (m >= 30 && m <= 49) {
        println("Grade C")
    } else if (m >= 17 && m <= 39) {
        println("Grade D")
    } else if (m >= 16 && m <= 1) {
        println("Grade E")
    } else {
        println("Invalid")
    }

}
    //while loop

