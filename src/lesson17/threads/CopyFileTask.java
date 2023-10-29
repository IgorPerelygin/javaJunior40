package lesson17.threads;

import lesson15.CopyUtils;

/**
 * Задача копирования файла в отдельном потоке
 * 
 * @author nedis
 * @version 1.0
 */
public interface CopyFileTask extends Task {
	/**
	 * Устанавливает алгоритм копирования файлов. созданный в предыдущем задании
	 * 
	 * @param copyUtils алгоритм копирования файлов
	 */
	void setFileCopyUtils(CopyUtils copyUtils);
}
