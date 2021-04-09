package animal;

public class Dog extends Animal implements Jumpable {
    private final float jump_limit;

    public Dog(String name) {
        this.name = name;
        this.run_limit = 100;
        jump_limit = 10f;
    }


    @Override
    public boolean jump(float height) {
        return jump_limit >= height;
    }
    @Override
    public float getJumpLimit(){
        return jump_limit;
    }
}
