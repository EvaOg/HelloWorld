package oop.oop_interfaces;

 class Keyboard implements Description{

    private String name;

    public Keyboard(String name) {
        this.name = name;
    }

     public void description() {
         System.out.println("Keyboard: " + name);
     }


}
