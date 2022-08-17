class Message(
    val author: User? = null,
    val destination: User? = null,
    val messageText: String = ""
) {
    fun send() {
        println("${author!!.name} sent \"$messageText\" to ${destination!!.name}")
    }
}
