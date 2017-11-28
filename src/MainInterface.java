import java.util.ArrayDeque;
import java.util.Scanner;

public class MainInterface {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Favor indicar el puerto utilizado para que los demás nodos de su misma red se puedan comunicar con usted.");
        int localNetworkPort = scanner.nextInt();
        System.out.printf("Ahora indique cuál es su dirección IP (virtual)");
        String ipVirtualAddress = scanner.next();
        System.out.println("Cuál es su MAC address virtual?");
        String macAddress = scanner.next();
        System.out.println("Finalmente, cómo identifica usted a su compañero de router?");
        String routerMacAddress = scanner.next();
        System.out.println("Listo!");


        int[] senderIp = {123,45,67,7};
        int[] receiverIp = {123,45,67,8};
        int[] actionIp = {};
        Message message = new Message(senderIp, receiverIp, 3, actionIp, "Hola!");
        Envelope envelope = new ExternalEnvelope("Legos1", "Bolinchas.Kevin", message);
        ArrayDeque<Envelope> inbox = new ArrayDeque<>();
        inbox.add(envelope);
        Thread thread = new Interface(localNetworkPort, inbox);
        thread.start();
        Interface interfac = new Interface(ipVirtualAddress, macAddress, inbox, routerMacAddress);
        interfac.wakeUp();
    }
}