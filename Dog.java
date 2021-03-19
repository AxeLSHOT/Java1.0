package Animals;

class Dog extends Animal {

    public double jump;
    public int swim;



    public Dog(String name, int run, int swim, double jump ) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }
    public void dogInfo() {
        System.out.println("DogName: " + name  + " /RunLimit: " + run+ " meters/" + " /Swim:" + swim + " /Jump: " +jump+ " meters/");
    }
}