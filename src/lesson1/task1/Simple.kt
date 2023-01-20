@file:Suppress("UNUSED_PARAMETER")
package lesson1.task1

//import kotlin.math.PI

//import kotlin.math.*


/**
 * Пример главной функции
 */

fun main(args: Array<String>)
{
    val x1x2 = quadraticRootProduct(1.0, -3.0, 2.0)
    println("Root product: $x1x2")
}

/**
 * Пример
 *
 * Вычисление квадрата целого числа
 */
fun sqr(x: Int) = x * x

/**
 * Пример
 *
 * Вычисление квадрата вещественного числа
 */
fun sqr(x: Double) = x * x

/**
 * Пример
 *
 * Вычисление дискриминанта квадратного уравнения
 */
fun discriminant(a: Double, b: Double, c: Double) = sqr(b) - 4 * a * c

/**
 * Пример
 *
 * Поиск одного из корней квадратного уравнения
 */
fun quadraticEquationRoot(a: Double, b: Double, c: Double) =
        (-b + kotlin.math.sqrt(discriminant(a, b, c))) / (2 * a)

/**
 * Пример
 *
 * Поиск произведения корней квадратного уравнения
 */
fun quadraticRootProduct(a: Double, b: Double, c: Double): Double
{
    val sd: Double = kotlin.math.sqrt(discriminant(a, b, c))
    val x1: Double = (-b + sd) / (2 * a)
    val x2: Double = (-b - sd) / (2 * a)
    return x1 * x2 // Результат
}



/**
 * Тривиальная
 *
 * Пользователь задает время в часах, минутах и секундах, например, 8:20:35.
 * Рассчитать время в секундах, прошедшее с начала суток (30035 в данном случае).
 */
fun seconds(hours: Int, minutes: Int, seconds: Int): Int
{
    return seconds + (minutes * 60) + (hours * 3600)
}

/**
 * Тривиальная
 *
 * Пользователь задает длину отрезка в саженях, аршинах и вершках (например, 8 саженей 2 аршина 11 вершков).
 * Определить длину того же отрезка в метрах (в данном случае 18.98).
 * 1 сажень = 3 аршина = 48 вершков, 1 вершок = 4.445 см.
 */
fun lengthInMeters(sagenes: Int, arshins: Int, vershoks: Int): Double
{
    return 0.04445 * (vershoks + (arshins * 16) + (sagenes * 48))
}

/**
 * Тривиальная
 *
 * Пользователь задает угол в градусах, минутах и секундах (например, 36 градусов 14 минут 35 секунд).
 * Вывести значение того же угла в радианах (например, 0.63256).
 */
fun angleInRadian(grad: Int, min: Int, sec: Int): Double
{
    return (grad + ((min+sec/60.0)/60.0)) * (kotlin.math.PI/180.0)
}

/**
 * Тривиальная
 *
 * Найти длину отрезка, соединяющего точки на плоскости с координатами (x1, y1) и (x2, y2).
 * Например, расстояние между (3, 0) и (0, 4) равно 5
 */
fun trackLength(x1: Double, y1: Double, x2: Double, y2: Double): Double
{
    //return kotlin.math.sqrt(sqr(x1-y1)+sqr(x2+y2))
    return kotlin.math.sqrt(sqr(kotlin.math.abs(x1-x2)) + sqr(kotlin.math.abs(y1-y2)) )
}

/**
 * Простая
 *
 * Пользователь задает целое число, большее 100 (например, 3801).
 * Определить третью цифру справа в этом числе (в данном случае 8).
 */
fun thirdDigit(number: Int): Int
{
    val stroka = number.toString()
    val stroka2: String = "" + stroka[stroka.length-3]

    return stroka2.toInt();
}

/**
 * Простая
 *
 * Поезд вышел со станции отправления в h1 часов m1 минут (например в 9:25) и
 * прибыл на станцию назначения в h2 часов m2 минут того же дня (например в 13:01).
 * Определите время поезда в пути в минутах (в данном случае 216).
 */
fun travelMinutes(hoursDepart: Int, minutesDepart: Int, hoursArrive: Int, minutesArrive: Int): Int
{
    val min1 = 60 - minutesDepart
    return ((hoursArrive - (hoursDepart + 1)) * 60) + min1 + minutesArrive
}

/**
 * Простая
 *
 * Человек положил в банк сумму в s рублей под p% годовых (проценты начисляются в конце года).
 * Сколько денег будет на счету через 3 года (с учётом сложных процентов)?
 * Например, 100 рублей под 10% годовых превратятся в 133.1 рубля
 */
fun accountInThreeYears(initial: Int, percent: Int): Double
{
    val god1 = (initial * (1.0 + percent/100.0));

    val god2 = god1 * (1.0 + percent/100.0);
    return (god2 * (1.0 + percent/100.0));
}

/**
 * Простая
 *
 * Пользователь задает целое трехзначное число (например, 478).
 * Необходимо вывести число, полученное из заданного перестановкой цифр в обратном порядке (например, 874).
 */
fun numberRevert(number: Int): Int
{
    val stroka = number.toString()
    println(stroka)
    val stroka2 = stroka[2].toString() + stroka[1].toString() + stroka[0].toString();
    return stroka2.toInt();

}
