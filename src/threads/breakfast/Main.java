package threads.breakfast;


import threads.exercises.breakfast.template.kitchen.*;


public class Main {

    public static void main(String[] args) {
        Breakfast breakfast = new Breakfast();

        Cup cup = breakfast.getUtensils().getCup();
        WaterTap waterTap = breakfast.getUtensils().getWaterTap();
        WaterBoiler waterBoiler = breakfast.getUtensils().getWaterBoiler();
        Spoon spoon = breakfast.getUtensils().getSpoon();
        Knife knife = breakfast.getUtensils().getKnife();
        Toaster toaster = breakfast.getUtensils().getToaster();
        Pot pot = breakfast.getUtensils().getPot();

        //schritt 1 toast & water
        Egg egg = new Egg();
        pot.pourIn(waterTap.getWater(pot.getVolume()));
        pot.boilWater();
        BreadSlice cheeseToast = new BreadSlice();
        toaster.toast(cheeseToast);
        BreadSlice marmaladeToast = new BreadSlice();
        toaster.toast(marmaladeToast);
        pot.boilEgg(egg);
        waterBoiler.pourIn(waterTap.getWater(cup.getVolume()));
        waterBoiler.boil();
        cup.pourIn(waterBoiler.pourOut());
        cup.pourIn(new Milk());
        cup.letTeaBrew(new TeaBag());
        Apple apple = new Apple();
        waterTap.wash(apple);
        ApplePiece[] applePieces = knife.cut(apple);
        spoon.spoon(new Sugar(), cup);
        spoon.stir(cup);
        knife.smear(new Butter(), marmaladeToast);
        spoon.spoon(new Marmalade(), marmaladeToast);
        knife.smear(new Butter(), cheeseToast);
        cheeseToast.putOn(new Cheese());



        breakfast.ready(cup, marmaladeToast, cheeseToast, egg, applePieces);






    }
}
