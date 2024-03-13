fun main() {
    // Nomor 1
    val piramida: Drawable = PiramidaBintang(5)
    piramida.draw()
    
    // Nomor 2
    val piramidaTerbalik = PiramidaBintangTerbalik(5)
    piramidaTerbalik.draw()
    
    // Nomor 3
    layanglayangBintang(5)
    
    // Nomor 4
    xBintang(5)
    
    // Nomor 5
    piramidaHollowBintang(5)
}

interface Drawable {
    fun draw()
}

class PiramidaBintang(val rows: Int) : Drawable {
    override fun draw() {
        for (i in 1..rows) {
            for (j in 1..(rows - i)) {
                print(" ")
            }
            for (j in 1..(2 * i - 1)) {
                print("*")
            }
            println()
        }
    }
}

class PiramidaBintangTerbalik(val rows: Int) {
    fun draw() {
        for (i in rows downTo 1) {
        for (j in 1..rows - i) {
            print(" ")
        }
        for (j in 1..i * 2 - 1) {
            print("*")
        }
        println()
    }
    }
}

fun layanglayangBintang(rows: Int) {
  for (i in 1..rows) {
    for (j in 1..(rows - i)) {
      print(" ")
    }
    for (j in 1..(2 * i - 1)) {
      print("*")
    }
    println()
  }

  for (i in rows downTo 1) {
        for (j in 1..rows - i) {
            print(" ")
        }
        for (j in 1..i * 2 - 1) {
            print("*")
        }
        println()
    }
}

fun xBintang(rows: Int) {
    val count = rows * 2 - 1; 

    for(i in 1..count){
        for(j in 1..count){
            if(j==i || (j==count - i + 1)) {
                print("*");
            } else {
                print(" ");
            }
        }
        println("")
    }
}

fun piramidaHollowBintang(rows: Int) {
    for (i in 1..rows) {
        for (j in 1..rows - i) {
            print(" ")
        }
        for (k in 1..(2 * i - 1)) {
            if (k == 1 || k == 2 * i - 1 || (i == rows && k % 2 == 1)) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
}

