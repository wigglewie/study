class Car(
    var maxSpeed: Int = 10,
    var color: String = "grey",
    var doors: Int = 4,
    var wheels: Int = 4
)
{
    fun removeDoors() {
        println("мяч брошен")
    }

    fun addWheels(amount: Int) {
        wheels += amount
    }

    fun changeColorAndMaxSpeed(newColor: String, newMaxSpeed: Int) {
        color = newColor
        maxSpeed = newMaxSpeed
    }

    override fun toString(): String {
        return "$maxSpeed, $color, $doors, $wheels"
    }
}
