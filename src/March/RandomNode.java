package March;

public class RandomNode {
    int val;
    RandomNode next;
    RandomNode random;

    public RandomNode(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
    public RandomNode(int val, RandomNode next1, RandomNode random1) {
        this.val = val;
        this.next = next1;
        this.random = random1;
    }
    public RandomNode(int val, RandomNode next1) {
        this.val = val;
        this.next = next1;

    }
}
