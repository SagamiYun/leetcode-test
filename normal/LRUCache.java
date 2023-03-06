package normal;

import java.util.HashMap;
import java.util.Map;

/**
 * @author SagamiYun
 * @version 2023/3/6
 * <p>@ClassName LRUCache</p>
 * <p>@Description TODO </p>
 * <p>146. LRU 缓存</p>
 */
public class LRUCache {
    private final Map<Integer, Node> map;
    private final Node head, tail;
    private final int capacity;
    private int size;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>(capacity);
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        Node node = map.get(key);
        if (node == null) {
            return -1;
        }
        moveNodeToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        Node node = map.get(key);
        if (node == null) {
            node = new Node(key, value);
            addNodeToHead(node);
            map.put(key, node);
            size++;
            if (size > capacity) {
                Node removed = removeTailNode();
                map.remove(removed.key);
                size--;
            }
        } else {
            node.value = value;
            moveNodeToHead(node);
        }
    }

    private void moveNodeToHead(Node node) {
        removeNode(node);
        addNodeToHead(node);
    }

    private void addNodeToHead(Node node) {
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
        node.prev = head;
    }

    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private Node removeTailNode() {
        Node node = tail.prev;
        removeNode(node);
        return node;
    }

    private static class Node {
        int key;
        int value;
        Node prev;
        Node next;

        public Node() {
        }

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
