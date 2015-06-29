package com.lvp.interest.daffydb;

public class ByteUtil {
    public static byte[] long2bytes(long l) {
        final int len = 8;
        byte[] result = new byte[len];
        for (int i = 0; i < len; i++) {
            result[i] = (byte) (l & 0xFF);
            l = l >>> 8;
        }
        return result;
    }

}
