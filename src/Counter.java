public class Counter {
    private Integer count;

    public Counter() {
        this.count = 0;
    }

    public void increment(){
        count++;
    }

    public Integer getValue(){
        return count;
    }
}
