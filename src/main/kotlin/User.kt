data class User(
    var username: String = "Kuttuuai", var email: String = "kuti@gmail.com",
    var age: Int = 14, var password: Int = 207090,
) : Verifiable{
    override fun verify(user: User) {
      println(user)
      println(User())
        if (user ==User()){
            println("Вход выполнен успешно!")
        }else {
            throw IllegalArgumentException("Неверные данные для входа")
        }
    }
}
