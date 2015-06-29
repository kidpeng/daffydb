package com.lvp.interest.daffydb;

public class Key implements Serializable<Key> {
    private byte[] key;
    private long   valuePointer;

    public byte[] seriablize() {
        byte[] bytes = new byte[16];
        return bytes;
    }

    public Key deserialize(byte[] bytes) {
        // TODO Auto-generated method stub
        return null;
    }
}
// subNodePointer keyLen key valuePointer subNodePointer
