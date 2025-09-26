package example.myapp

class Aquarium(val width: Int = 100, var height: Int = 30, var length: Int = 50) {

    init {
        println("\nAquarium initializing")
    }

    init {
        var volume = width*height*length/1000
        println("Volume of the aquarium: $volume")
        //It is more efficient to write it as
        //println("Volume of the aquarium: ${width*height*length/1000}")
    }

    fun printSize() {
        println("Width: $width cm " +
                "Height: $height cm " +
                "Length: $length cm ")
    }
}