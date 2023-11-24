package headFirstJava.UniversalServer;
import java.rmi.*;
import java.util.*;
import java.rmi.server.*;
public class ServiceServerImpl extends UnicastRemoteObject implements ServiceServer {
    HashMap serviceList;  //Сервисы будут храниться в ХешМап,вместо одного объекта кладём 2 (ключ и значение)
    public ServiceServerImpl() throws RemoteException {
        setUpServices();
    }

    private void setUpServices() {
        serviceList = new HashMap();
        serviceList.put("Dice Rolling Service", new DiceService());
        serviceList.put("Day of the Week Service", new DayOfTheWeekService());
        serviceList.put("Visual Music Service", new MiniMusicService());
        /*
        создаём сервисы (их объекты) и помещаем в хешмап вместе со строковым именем (ключом)
         */

    }
}
