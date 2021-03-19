package Animals;


class Cat extends Animal {

    protected boolean swim;
    int jump;

    public Cat(String name, int run, boolean swim, int jump) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }

    public void catInfo() {
        System.out.println("CatName: " + name + " /RunLimit: " + run+ " meters/" + " /Swim:" + swim + " /Jump: " +jump+ " meters/");
    }
}
