package Networking;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class NetworkingDemo {

    public static void main(String[] args) throws UnknownHostException {

        String url = "www.simplilearn.com";

        InetAddress inetAddress = Inet4Address.getByName(url);
        System.out.println("Address : " + Arrays.toString(inetAddress.getAddress()));

        System.out.println("Host Address : " + inetAddress.getHostAddress());

        System.out.println("isLinkLocalAddress : " + inetAddress.isLinkLocalAddress());

        System.out.println("isLoopBackAddress : " + inetAddress.isLoopbackAddress());

        System.out.println("isSiteLocalAddress : " + inetAddress.isSiteLocalAddress());

        System.out.println("hashCode : " + inetAddress.hashCode());

    }
}
