package animal;

public class Mouse extends Animal implements Swimable {
    private final int swim_limit;

    public Mouse(String name) {
        this.name = name;
        this.run_limit = 30;
        swim_limit = 150;
    }

    @Override
    public boolean swim(int length) {
        return swim_limit >= length;
    }
    @Override
    public int getSwimLimit(){
        return swim_limit;
    }
}
