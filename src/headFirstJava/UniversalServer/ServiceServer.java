package headFirstJava.UniversalServer;
import java.rmi.*;

/*
Обычный удалённый RMI интерфейс. Описывает два метода, которыми должен обладать удалённый сервис
 */
public interface ServiceServer extends Remote {
    Object[] getServiceList() throws RemoteException;
    Service getService(Object serviceKey) throws RemoteException;
}
