package 模仿ArrayList类;

import java.awt.Container;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CmazList<E> {

    private Object[] elementData;

    private static final Object[] EMPTY_ELEMENTDATA = {};

    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

    private static final int DEAULT_CAPACITY = 10;

    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    // 当前容器存储了多少元素
    private int size;

    // 数组对象修改次数
    private int modCount = 0;

    public CmazList(int initialCapacity) {

        if (initialCapacity > 0) {

            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {

            this.elementData = EMPTY_ELEMENTDATA;
        } else {
            throw new IllegalArgumentException("参数错误!");
        }

    }

    public CmazList() {

        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;

    }

    public boolean add(E e) {
        ensureCapacityInternal(size + 1);
        elementData[size++] = e;

        System.out.println("size=" + size);
        return true;
    }

    public E remove(int index) {
        modCount++;
        E oldValue = (E) elementData[index];
        int numMoved = size - 1 - index;
        System.out.println("移动了" + numMoved + "个元素");
        /**
         * System.arraycopy(src, srcPos, dest, destPos, length); src 源数组 srcPos
         * 源数组要复制的起始位置 dest 目的数组 destPos 目的数组放置的起码位置 length 复制的长度
         */
        if (numMoved > 0) {
            System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        }
        elementData[--size] = null;
        return oldValue;
    }

    public boolean remove(Object obj) {

        if (obj == null) {

            for (int index = 0; index < size; index++) {

                if (elementData[index] == null) {

                    remove(index);

                    return true;
                }

            }
        } else {

            for (int index = 0; index < size; index++) {

                if (elementData[index].equals(obj)) {

                    remove(index);

                    return true;
                }
            }
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {

        return (E) elementData[index];
    }

    public int size() {

        return size;
    }

    public boolean isEmpty() {

        return size == 0;
    }

    public Object[] toArray() {
        return Arrays.copyOf(this.elementData, size);

    }

    /**
     * 判断是否要进行扩容 如果数组是空的话，那么minCapacity就取默认的容量和传入的minCapacity的最大值。
     * 
     * @param minCapacity
     */
    private void ensureCapacityInternal(int minCapacity) {

        if (this.elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {

            minCapacity = Math.max(DEAULT_CAPACITY, minCapacity);

            System.out.println("这是无参数空容量的CmazList");
        }

        ensureExplicitCapacity(minCapacity);

    }

    /**
     * 
     * @param minCapacity
     */
    private void ensureExplicitCapacity(int minCapacity) {

        modCount++;

        System.out.println("minCapacity=" + minCapacity + ",容器大小=" + elementData.length);

        if (minCapacity - elementData.length > 0) {

            System.out.println("----要扩容了----");
            grow(minCapacity);
        }
    }

    private void grow(int minCapacity) {

        int oldCapacity = elementData.length;
        /**
         * 扩容为原来的1.5倍
         */
        int newCapacity = oldCapacity + (oldCapacity >> 1);// 记得打括号

        System.out.println("newCapacity=" + newCapacity);

        if (newCapacity - minCapacity < 0) {
            newCapacity = minCapacity;

        }

        System.out.println("newCapacity=" + newCapacity);

        if (newCapacity - MAX_ARRAY_SIZE > 0) {

            newCapacity = hugeCapacity(minCapacity);
        }

        this.elementData = Arrays.copyOf(elementData, newCapacity);
    }

    private static int hugeCapacity(int minCapacity) {

        return (minCapacity > MAX_ARRAY_SIZE) ? Integer.MAX_VALUE : MAX_ARRAY_SIZE;

    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    public boolean contains(Object obj) {

        return indexOf(obj) >= 0;

    }

    public int indexOf(Object o) {

        if (o == null) {

            for (int i = 0; i < size; i++) {

                if (o == elementData[i]) {

                    return i;
                }
            }

        } else {
            for (int i = 0; i < size; i++) {

                if (o.equals(elementData[i])) {

                    return i;
                }
            }
        }

        return -1;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {

            sb.append(elementData[i] + " ");
        }

        return sb.toString();

    }

}
