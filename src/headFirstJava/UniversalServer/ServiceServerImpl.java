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

    public Object[] getServiceList() {
        System.out.println("in remote");
        return serviceList.keySet().toArray();
        /*
        Клиент вызывает этотт метод, чтоюы получть список сервисов и отобразить их в обозревателе.
        Мы отправляем массив типа Object (хотя внутри он содержит строки), который состоит только из ключей из Хешмап.
        Мы не будем отправлять сам сервис, пока клиент не вызовет метод getService
         */
    }

    public Service getService (Object serviceKey) throws RemoteException {
        Service theService = (Service) serviceList.get(serviceKey);
        return theService;
    }

    public static void main(String[] args) {
        try {
            Naming.rebind("ServiceServer", new ServiceServerImpl());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Remote service is running");
    }
}


