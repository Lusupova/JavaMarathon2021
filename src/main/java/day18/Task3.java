package day18;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);
        int[] numbers = {14, 23, 11, 16, 22, 27, 5, 15, 18, 24, 150, 8};
        for (int number : numbers) {
            addNode(number, root);
        }

        dfs(root);
    }

    private static void dfs(Node node) {
        if (node == null) {
            return;
        }
        dfs(node.getLeftSon());
        System.out.print(node.getNodeValue() + " ");
        dfs(node.getRightSon());

    }

    //После этого, необходимо реализовать метод, который будет добавлять новые узлы в ваше дерево.
    //Этот метод должен принимать в качестве аргументов добавляемое значение и ссылку на корень дерева.
    // Проходясь по дереву, он должен вставлять новый узел в правильное место дерева.
    private static void addNode(int newNode, Node root) {
        if (root == null) {
            throw new IllegalArgumentException("Root should not be null");
        }
        Node next = null;
        Node current = root;
        while (next != null) {
            current = next;

            if (newNode < current.getNodeValue()) {
                next = current.getLeftSon();
            } else {
                next = current.getRightSon();
            }
        }
        if (newNode < current.getNodeValue()) {
            current.setLeftSon(new Node(newNode));
        } else {
            current.setRightSon(new Node(newNode));
        }
    }
}