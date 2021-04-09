package animal;

public class Cat extends Animal implements Jumpable, Swimable {
    private final int swim_limit;
    private final float jump_limit;

    public Cat(String name) {
        this.name = name;
        this.run_limit = 80;
        swim_limit = 100;
        jump_limit = 3.8f;
    }


    @Override
    public boolean swim(int length) {
        return swim_limit >= length;
    }

    @Override
    public boolean jump(float height) {
        return jump_limit >= height;
    }
    @Override
    public int getSwimLimit(){
        return swim_limit;
    }
    @Override
    public float getJumpLimit(){
        return jump_limit;
    }
}
