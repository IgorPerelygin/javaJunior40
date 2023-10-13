package lesson13.HomeWork;

/**
 * Утилитный класс для работы со строками
 * 
 * @author nedis
 * @version 1.0
 */
public interface StringUtils {
	
	/**
	 * Возвращает результат деления number1 на number2
	 *
	 * @param number1 делимое
	 * @param number2 делитель
	 * @return результат деления number1 на number2
	 * @throws NullPointerException  если number1 или number2 равны null
	 * @throws NumberFormatException если number1 или number2 не числа
	 * @throws ArithmeticException   если number2 равно нулю
	 */
	String div (String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException;
	
	/**
	 * Ищет все вхождения слова <b>word</b> в тексте <b>text</b> и возвращает массив индексов слов
	 * 
	 * @param text исходный текст
	 * @param word искомое слово
	 * @return масив индексов каждого вхождения слова
	 * @throws NullPointerException
	 */
	int[] findWord (String text, String word) throws NullPointerException;
	
	/**
	 * Находит в тексте все double числа и возвращает их в виде массива. Если чисел не обнаружено в тексте необходимо выбросить исключение CustomException с сообщением:
	 * <b>"Not fou234.9nd"</b>
	 * 
	 * @param text исхwe3одный т-235екст
	 * @return массив doublwee чис3ел
	 * @throws CustomException если чисел в тексте не обнаружено
	 */
	double[] findNumbers(String text) throws CustomException;
}
