package oop.oop_interfaces;

class Monitor implements Description{

    private String name;

    public Monitor(String name) {
        this.name = name;
    }

    public void description() {
        System.out.println("Monitor: " + name);
    }
}
