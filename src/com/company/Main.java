package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        God god = new God();
        Snake snake = new Snake();
        Apple appleForAdam = new Apple();
        Apple appleForEva = new Apple();

        Human humanAdam = new Human("Adam", true);
        Human humanEva = new Human("Eva", false);

        god.say("You don't allow to eat apple or you will die");
        snake.say("Just eat apple, it's delicious");

        humanAdam.eat(appleForAdam);
        appleForAdam.isEmpty();
        humanEva.eat(appleForEva);
        appleForEva.isEmpty();

        humanAdam.sleep();
        humanEva.sleep();

        god.say("Eva, you have to listen to your husband and suffer from pain when you give birth and Adam, you have to plant a tree to have food");
    }
}
