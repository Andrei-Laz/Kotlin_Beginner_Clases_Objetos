package example.myapp

fun buildAquariums() {
    val myAquarium1 = Aquarium()
    myAquarium1.printSize()
    /*myAquarium1.width = 50
    It is important to consider that by declaring the width property as val in the constructor of the
    Aquarium class we have set the variable as a constant. This the value read-only which implies
    that it can not be reassigned once an object of the Aquarium class is created but we can create
    an object with a different value than the constructor because we are still instancing the class
     */
    myAquarium1.height = 60
    myAquarium1.printSize()

    val myAquarium2 = Aquarium(height = 0)
    myAquarium2.printSize()
    val myAquarium3 = Aquarium(width = 40, length = 80, height = 70)
    myAquarium3.printSize()
    //Using just the default constructor method Kotlin can create different objects with
    //different parameters
}

fun main () {
    buildAquariums()
}