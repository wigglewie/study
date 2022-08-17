fun main(args: Array<String>) {

    val car1 = Car(123, "blue", 4)
    car1.maxSpeed = 245
    car1.doors = 3
    car1.color = "red"

    val car2 = Car(345345, "red", 6, 6)

    val car3 = Car()

    car2.removeDoors()

    car1.addWheels(2)

    car3.changeColorAndMaxSpeed("pink", 600)

    println("car1: $car1")
    println("car2: $car2")
    println("car3: $car3")



//    val ilya = User("Ilya", 1, "Parebrik")
//    val fedor: User = User("Fedor", 2)
//    val garik: User = User("Garik", 3)
//    val tatyana: User = User("Tatyana", 1339)
//
//    val msg1: Message = Message(ilya, garik, "hi")
//    val msg2: Message = Message(garik, fedor, "hello")
//    val msg3: Message = Message(fedor, tatyana, "bye")
//
//    println(msg1.author!!.secondName)
//    println(msg2.messageText)
//    println(msg3.destination!!.id)
//
//    msg2.send()
//
//    val x = 123
//    val y = 123
//    val z: Int
//
//    val toString = x.toString()
//    z = x + y
//
//    println(toString)

}

