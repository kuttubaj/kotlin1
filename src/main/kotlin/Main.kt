import java.util.Scanner
fun main(args: Array<String>) {
    val userInfo=  User("Kuttuuai","kuti@com",14,207090)
    val scanner=Scanner(System.`in`)
    println("Введите ваше имя:")
    val userName= scanner.nextLine()
    println("Введите почту")
    val email= scanner.nextLine()
    println("Введите возвраст")
    val age=scanner.nextInt()
    println("Введите пароль")
    val password =scanner.nextInt()
    val imputUserModel= User(userName.trim(),email.trim(),age,password)
    userInfo.verify(imputUserModel)
}