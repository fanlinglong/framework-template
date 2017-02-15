package com.solar.framework.core.utils;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by fanlinlong on 2017/2/8.
 */
public final class SystemUtils {
    private static String localIp = null;
    private static List<String> ips = new ArrayList(2);
    private static String hostName;

    public SystemUtils() {
    }

    private static void fetchHostName() throws IOException {
        InetAddress addr = InetAddress.getLocalHost();
        hostName = addr.getHostName();
    }

    private static void fetchHostIps() throws IOException {
        InetAddress[] var0 = InetAddress.getAllByName(hostName);
        int var1 = var0.length;

        for(int var2 = 0; var2 < var1; ++var2) {
            InetAddress address = var0[var2];
            if(address instanceof Inet4Address && !address.isLoopbackAddress()) {
                ips.add(address.getHostAddress());
            }
        }

    }

    private static void fetchLocalIp() {
        if(!ips.isEmpty()) {
            localIp = (String)ips.get(0);
        }

    }

    public static String getLocalIp() {
        return localIp;
    }

    public static String getHostName() {
        return hostName;
    }

    static {
        try {
            fetchHostName();
            fetchHostIps();
            fetchLocalIp();
        } catch (IOException var1) {
            var1.printStackTrace();
        }

    }
}