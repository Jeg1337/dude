class Testmain {
    public static void main(String[] args) {
        Dude test = new Dude();

        Cat first = new Cat();
        Dog second = new Dog();
        Leha third = new Leha();
        Turkey forth = new Turkey();
        Duck fifth = new Duck();
        Goose six = new Goose();

        test.getAnimals().add(first);
        test.getAnimals().add(second);
        test.getAnimals().add(third);
        test.getAnimals().add(forth);
        test.getAnimals().add(fifth);
        test.getAnimals().add(six);

        test.getAnimals().get(1).setSize(10);

        System.out.println(test.getAnimals().get(1).getSize());
        System.out.println(test.alo());
    }
}
