package day18;

public class Node {
    private int nodeValue;
    private Node rightSon;
    private Node leftSon;


    public Node(int nodeValue) {
        this.nodeValue = nodeValue;
    }

    public void setRightSon(Node rightSon) {
        this.rightSon = rightSon;
    }

    public void setLeftSon(Node leftSon) {
        this.leftSon = leftSon;
    }

    public int getNodeValue() {
        return nodeValue;
    }

    public Node getRightSon() {
        return rightSon;
    }

    public Node getLeftSon() {
        return leftSon;
    }


}
