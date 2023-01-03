package com.tistory.jx2lee_dev.effectivejava.item_3_use_private_or_enum_when_create_singleton;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// https://madplay.github.io/post/what-is-readresolve-method-and-writereplace-method
public class ElvisSerializable {
    public byte[] serialize(Object instance) {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try (bos; ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            oos.writeObject(instance);
        } catch (Exception e) {
            // 구현 생략
        }
        return bos.toByteArray();
    }

    public Object deserialize(byte[] serializedData) {
        ByteArrayInputStream bis = new ByteArrayInputStream(serializedData);
        try (bis; ObjectInputStream ois = new ObjectInputStream(bis)) {
            return ois.readObject();
        } catch (Exception e) {
            // 구현 생략
        }
        return null;
    }
}
