@file:Suppress("UNUSED_PARAMETER")
package lesson2.task2

import lesson1.task1.sqr
import kotlin.math.abs

/**
 * Пример
 *
 * Лежит ли точка (x, y) внутри окружности с центром в (x0, y0) и радиусом r?
 */
fun pointInsideCircle(x: Double, y: Double, x0: Double, y0: Double, r: Double) =
        sqr(x - x0) + sqr(y - y0) <= sqr(r)

/**
 * Простая
 *
 * Четырехзначное число назовем счастливым, если сумма первых двух ее цифр равна сумме двух последних.
 * Определить, счастливое ли заданное число, вернуть true, если это так.
 */
fun isNumberHappy(number: Int): Boolean
{
    val numstr = number.toString();
    if (Character.getNumericValue(numstr[0])+ Character.getNumericValue(numstr[1]) == Character.getNumericValue(numstr[2]) + Character.getNumericValue(numstr[3])) return true;
    return false;

}

/**
 * Простая
 *
 * На шахматной доске стоят два ферзя (ферзь бьет по вертикали, горизонтали и диагоналям).
 * Определить, угрожают ли они друг другу. Вернуть true, если угрожают.
 * Считать, что ферзи не могут загораживать друг друга.
 */
fun queenThreatens(x1: Int, y1: Int, x2: Int, y2: Int): Boolean
{
    if ((abs(x1 - x2) == abs(y1 - y2)) || (x1 == x2 || y1 == y2)) return true else return false
}


/**
 * Простая
 *
 * Дан номер месяца (от 1 до 12 включительно) и год (положительный).
 * Вернуть число дней в этом месяце этого года по григорианскому календарю.
 */
fun daysInMonth(month: Int, year: Int): Int
{
    println(month);
    when (month) {
        1 -> return 31
        3 -> return 31
        4 -> return 30
        5 -> return 31
        6 -> return 30
        7 -> return 31
        8 -> return 31
        9 -> return 30
        10 -> return 31
        11 -> return 30
        12 -> return 31 }

    if (month == 2 && year == 1900) return 28
    if (month == 2 && year % 4 == 0) return 29
    if (month == 2 && year % 4 != 0) return 28
    return 0
}

/**
 * Средняя
 *
 * Проверить, лежит ли окружность с центром в (x1, y1) и радиусом r1 целиком внутри
 * окружности с центром в (x2, y2) и радиусом r2.
 * Вернуть true, если утверждение верно
 */
fun circleInside(x1: Double, y1: Double, r1: Double, x2: Double, y2: Double, r2: Double): Boolean = TODO()
/**
 * Средняя
 *
 * Определить, пройдет ли кирпич со сторонами а, b, c сквозь прямоугольное отверстие в стене со сторонами r и s.
 * Стороны отверстия должны быть параллельны граням кирпича.
 * Считать, что совпадения длин сторон достаточно для прохождения кирпича, т.е., например,
 * кирпич 4 х 4 х 4 пройдёт через отверстие 4 х 4.
 * Вернуть true, если кирпич пройдёт
 */
fun brickPasses(a: Int, b: Int, c: Int, r: Int, s: Int): Boolean
{
    if ((a <= r && b <= s) || (a <= r && c <= s) || (b <= r && c <= s) || (a <= s && b <= r) || (a <= s && c <= r) || (b <= s && c <= r)) return true else return false

}
