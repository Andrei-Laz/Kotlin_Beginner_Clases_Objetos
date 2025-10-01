package example.myapp

import java.lang.reflect.Constructor
import kotlin.times

class Aquarium(val width: Int = 100, var height: Int = 30, var length: Int = 50) {

    var volume: Int
        get() = width*height*length/1000
    /*this is a computed property which is used to access/read a value/variable without the need to store it
    in a backing field because every time you call the volume variable it is going to calculate it at the moment
    and show you the result
    On the other hand if you declare the variable and store it you would always get the same volume even if you
    changed any of the dimensions.
    For these reasons it is important to use a computed property if you need a variable to be dynamic
    and can use a variable stored in a backing field if the variable in question needs not to be changed
     */
    set(value) {
        height = (value * 1000) / (width * length)
    }

    /*The visibility of everything in Kotlin in public by default and it works similarly to other
    programming languages
    public: accessible from everywhere
    private: only accesible in the class/file
    protected: only accessible to class and sub-classes
    internal:  only visible within that module. A module is a set of Kotlin files compiled together,
    for example, a library, a client or application, a server application in an IntelliJ project.

    When setting a variable with val it will only be able to be read so if you want it to also be mutable only
    in the current class/file you can define it as var and use a private setter

    var volume: Int
    get() = width * height * length / 1000
    private set(value) {
        height = (value * 1000) / (width * length)
    }

     */

    init {
        println("\nAquarium initializing")
        println("Width: $width cm " +
                "Height: $height cm " +
                "Length: $length cm ")
    }

//    init {
//        var volume = width*height*length/1000
//        println("Initial Volume of the aquarium: $volume")
//        //It is more efficient to write it as
//        //println("Volume of the aquarium: ${width*height*length/1000}")
//    }

    fun printSize() {
        println("Width: $width cm " +
                "Height: $height cm " +
                "Length: $length cm ")
        println("Volume of the aquarium: $volume liters")
    }

    constructor(numberOfFish: Int) : this() {
        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1

        // calculate the height needed
        height = (tank / (length * width)).toInt()
    }
}