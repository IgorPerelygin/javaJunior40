package headFirstJava.UniversalServer;
import javax.swing.*;
import java.io.*;

/*
Не удалённый интерфейс, описывающий единственный метод, которым должен обладать любой универсальный
сервис - getGuiPanel().
Этот интерфейс наследует Serializable, поэтому любой реализующий его класс можно сериализовать.
Это обязательное условие, т.к. сервис передаётся по сети от сервера в виде результата вызова
клиентом метода getService() из удалённого объекта ServiceServer.
 */
public interface Service extends Serializable {
    public JPanel getGuiPanel();
}
