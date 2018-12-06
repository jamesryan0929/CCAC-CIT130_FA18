/*
James Hayes
CIT_130 FA18
Assignment 10
*/

//package doubleLink;

public class DoublyLinkedList<T> implements Cloneable {
 
    private class TwoWayNode<T> {
 
        public T item;
        public TwoWayNode<T> next;
        public TwoWayNode<T> previous;
 
        public TwoWayNode(T it, TwoWayNode<T> previousNode, TwoWayNode<T> nextNode) {
            item = it;
            previous = previousNode;
            next = nextNode;
        }
 
        public T displayItem()
        {
            return item;
        }
    }
    private TwoWayNode<T> head;
    private TwoWayNode<T> tail;
 
    public DoublyLinkedList() {
        head = null;
        tail = null;
    }
 
    public boolean isEmpty() {
        return head == null;
    }
 
    public DoublyLinkedList(DoublyLinkedList<T> otherList) {
        if (otherList == null) {
            throw new NullPointerException();
        }
        if (otherList.head == null) {
            head = null;
        } else {
            head = copyOf(otherList.head);
        }
    }
 
    public DoublyLinkedList<T> clone() {
        try {
            DoublyLinkedList<T> copy = (DoublyLinkedList<T>) super.clone();
            return copy;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
 
    public TwoWayNode<T> copyOf(TwoWayNode<T> otherHead) {
        TwoWayNode<T> position = otherHead;
        TwoWayNode<T> newHead;
        TwoWayNode<T> end = null;
 
        newHead = new TwoWayNode<T>(position.item, position.previous, null);
        end = newHead;
        position = position.previous;
        while (position != null) {
            end.previous = new TwoWayNode<T>(position.item, position.previous, null);//position.prev
            end = end.previous;
            position = position.previous;
        }
 
        return newHead;
    }
 
    public boolean equals(Object otherObject) {
        if (otherObject == null) {
            return false;
        } else if (getClass() != otherObject.getClass()) {
            return false;
        } else {
            DoublyLinkedList<T> otherList = (DoublyLinkedList<T>) otherObject;
            if (size() != otherList.size()) {
                return false;
            }
            TwoWayNode<T> position = head;
            TwoWayNode<T> otherPosition = otherList.head;
            while (position != null) {
                if (!(position.item.equals(otherPosition.item))) {
                    return false;
                }
                position = position.next;
                otherPosition = otherPosition.next;
            }
            return true;
        }
    }
 
    public class DoublyLinkedListIterator {
 
        private TwoWayNode position = null;
 
        public DoublyLinkedListIterator() {
            position = head;
        }
 
        public void restart() {
 
            position = head;
        }
 
        public T next() {
            if (!hasNext()) {
                throw new IllegalStateException();
            }
 
            T toReturn = (T) position.item;
            position = position.next;
            return toReturn;
        }
 
        public boolean hasNext() {
            return (position != null);
        }
 
        public void insertBefore(T item) {
            if (position == null && head != null) {
                TwoWayNode<T> temp = head;
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = new TwoWayNode<T>(item, temp, null);
            } else if (head == null || position.previous == null) {
                DoublyLinkedList.this.addToStart(item);
            } else {
                TwoWayNode<T> temp = new TwoWayNode(item, position.previous, position);
                position.previous.next = temp;
                position.previous = temp;
            }
        }
 
        public void delete() {
            if (position == null) {
                throw new IllegalStateException();
            } else if (position.previous == null)
            {
                head = head.next;
                position = null;
            } else if (position.next == null) {
                tail = position.previous;
                position.previous.next = null;
                position = null;
            } else {
                position.previous.next = position.next;
                position.next.previous = position.previous;
                position = position.next;
            }
        }
 
        public T peek() {
            if (!hasNext()) {
                throw new IllegalStateException();
            }
            return (T) position.item;
        }
    }
 
    public void addToStart(T itemName) {
        TwoWayNode<T> newHead = new TwoWayNode(itemName, null, head);
 
        if (head != null) {
            head.previous = newHead;
        }
        if(tail == null)
            tail = newHead;
            head = newHead;
    }
 
    private TwoWayNode next() {
        if (head.next != null) {
            return head.next;
        } else {
            return head.previous;
        }
    }
 
    public void outputBackwards() {
        TwoWayNode current = tail;
        while (current != null)
        {
            System.out.println(current.displayItem());
            current = current.previous;
        }
    }
 
    public boolean deleteHeadNode() {
        if (head != null) {
            head = head.previous;
            return true;
        } else {
            return false;
        }
    }
 
    public int size() {
        int count = 0;
        TwoWayNode<T> position = head;
        while (position != null) {
            count++;
            position = position.next;
        }
        return count;
    }
 
    public boolean contains(T item) {
        return (find(item) != null);
    }
 
    private TwoWayNode<T> find(T target) {
        TwoWayNode<T> position = head;
        T itemAtPosition;
        while (position != null) {
            itemAtPosition = position.item;
            if (itemAtPosition.equals(target)) {
                return position;
            }
            position = position.previous;
        }
        return null;
    }
 
    public T findItem(T target) {
        return find(target).item;
    }
 
    public void clear() {
        head = null;
        tail = null;
    }
 
    public DoublyLinkedListIterator iterator() {
        return new DoublyLinkedListIterator();
    }
 
    public String toString(){
        String output = "";
        TwoWayNode<T> position = head;
        while (position != null) {
            output = output + position.item + " ";
            position = position.next;
        }
        return output;
    }
} 