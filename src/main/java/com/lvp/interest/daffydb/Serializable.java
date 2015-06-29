package com.lvp.interest.daffydb;

public interface Serializable<T> {
    byte[] seriablize();

    T deserialize(byte[] bytes);
}
