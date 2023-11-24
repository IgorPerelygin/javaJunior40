package headFirstJava.UniversalServer;
import java.rmi.*;
import java.security.Provider;

/*
Обычный удалённый RMI интерфейс. Описывает два метода, которыми должен обладать удалённый сервис
 */
public interface ServiceServer extends Remote {
    Object[] getServiceList() throws RemoteException;
    Provider.Service getService(Object serviceKey) throws RemoteException;
}
