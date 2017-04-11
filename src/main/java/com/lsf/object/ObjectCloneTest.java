package com.lsf.object;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectCloneTest {

    public static void main(String[] args) {

        ObjectCloneBean objectCloneBean = new ObjectCloneBean();
        ObjectCloneBean newObject = clone(objectCloneBean);

        newObject.setUserName("jack");

        System.out.println(newObject.getUserName());

    }

    @SuppressWarnings("unchecked")
    public static <T extends Serializable> T clone(T object) {

        T cloneObject = null;

        try {
            // 把母对象写入字节流
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ObjectOutputStream objOut = new ObjectOutputStream(out);
            objOut.writeObject(object);
            objOut.close();

            // 分配内存，写入原始对象，生成新的对象
            ByteArrayInputStream inputStream = new ByteArrayInputStream(out.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            
            //生成新对象，并转型
            cloneObject = (T) objectInputStream.readObject();
            objectInputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return cloneObject;

    }

}
