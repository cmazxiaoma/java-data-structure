package 模仿ArrayList类;

import java.util.Arrays;

public class CmazList1<E> {

    private static final Object[] DEFAULT_CAPACITY_ELEMENTDATA = {};

    private static final Object[] EMPTY_ELEMENTDATA = {};

    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    private static int DEFAULT_CAPACITY = 10;

    private Object[] elementData;

    private int modCount = 0;

    private int size;

    public CmazList1(int inititalCapcacity) {

        if (inititalCapcacity > 0) {

            this.elementData = new Object[inititalCapcacity];

        } else if (inititalCapcacity == 0) {
            this.elementData = EMPTY_ELEMENTDATA;
        } else {

            throw new IllegalArgumentException("参数错误");
        }
    }

    public CmazList1() {
        this.elementData = DEFAULT_CAPACITY_ELEMENTDATA;
    }

    public boolean contain(Object object) {

        return indexOf(object) >= 0;
    }

    public int indexOf(Object object) {

        if (object == null) {

            for (int i = 0; i < size; i++) {

                if (elementData[i] == null) {

                    return i;
                }
            }
        } else {

            for (int i = 0; i < size; i++) {

                if (elementData[i].equals(object)) {

                    return i;

                }
            }
        }

        return -1;
    }

    public boolean add(Object object) {

        ensureCapacityInternal(size + 1);

        elementData[size++] = object;

        return true;
    }

    private void ensureCapacityInternal(int minCapacity) {

        if (this.elementData == DEFAULT_CAPACITY_ELEMENTDATA) {

            minCapacity = Math.max(minCapacity, DEFAULT_CAPACITY);
        }

        ensureExplicitCapacity(minCapacity);
    }

    private void ensureExplicitCapacity(int minCapacity) {

        modCount++;

        if (minCapacity - elementData.length > 0) {

            grow(minCapacity);
        }
    }

    private void grow(int minCapacity) {

        int oldCapacity = elementData.length;

        int newCapacity = oldCapacity + (oldCapacity >> 1);

        if (minCapacity - newCapacity > 0) {

            newCapacity = minCapacity;
        }

        if (newCapacity - MAX_ARRAY_SIZE > 0) {

            newCapacity = hugeCapacity(minCapacity);
        }

        this.elementData = Arrays.copyOf(elementData, newCapacity);
    }

    private int hugeCapacity(int minCapacity) {

        if (minCapacity < 0) {

            throw new OutOfMemoryError();
        }
        return minCapacity > MAX_ARRAY_SIZE ? Integer.MAX_VALUE : MAX_ARRAY_SIZE;
    }

    public boolean remove(Object object) {

        if (object == null) {

            for (int i = 0; i < size; i++) {

                if (elementData[i] == null) {

                    fastRemove(i);
                    return true;
                }
            }
        } else {

            for (int i = 0; i < size; i++) {

                if (elementData[i].equals(object)) {
                    fastRemove(i);
                    return true;
                }
            }
        }

        return false;

    }

    private void fastRemove(int index) {
        modCount++;
        int movedNum = size - 1 - index;
        if (movedNum > 0) {

            System.arraycopy(elementData, index + 1, elementData, index, movedNum);
        }

        elementData[--size] = null;

    }

    public E remove(int index) {
        rangeCheck(index);
        modCount++;
        E oldValue = get(index);
        int movedNum = size - 1 - index;

        if (movedNum > 0) {

            System.arraycopy(elementData, index + 1, elementData, index, movedNum);
        }

        elementData[--size] = null;

        return oldValue;
    }

    public E get(int index) {
        rangeCheck(index);
        return (E) elementData[index];
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

    public Object[] toArray() {

        return Arrays.copyOf(this.elementData, size);
    }

    /**
     * toIndex是指要删除的最后一个元素的下一个元素的下标 比如我要删除下标为5的元素，那么toIndex=6
     * 
     * @param fromIndex
     * @param toIndex
     */
    public void removeRange(int fromIndex, int toIndex) {

        modCount++;

        // int movedNum=size-1-(toIndex-1);
        int movedNum = size - toIndex;

        if (movedNum > 0) {

            System.arraycopy(elementData, toIndex, elementData, fromIndex, movedNum);
        }
        //
        int newSize = size + fromIndex - toIndex;

        for (int i = newSize; i < size; i++) {

            elementData[newSize] = null;
        }

        size = newSize;

    }

    private void rangeCheck(int index) {

        if (index >= size || index < 0) {

            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        }
    }

    public int size() {
        return this.size;
    }

    private String outOfBoundsMsg(int index) {
        return "index:" + index + ",size=" + size;
    }
}
