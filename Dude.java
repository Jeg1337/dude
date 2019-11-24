class Dude {
    Cat first = new Cat();
    Dog second = new Dog();
    Leha third = new Leha();
    Turkey forth = new Turkey();
    Duck fifth = new Duck();
    Goose six = new Goose();

	public String call() {
        return "рейнджеры, объединяемся!!!!\n" + first.meow() + "\n" + second.bark() + "\n" + third.call() + '\n' + forth.clucks() + '\n' + fifth.call() + '\n' + six.call();
    }
}
