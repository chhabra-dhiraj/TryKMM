class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}! Let the battle begin! - Dhiraj Chhabra"
    }
}