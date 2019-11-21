class Dude {
    Cat first = new Cat();
    Dog second = new Dog();

	public String call() {
        return "рейнджеры, объединяемся!!!!\n" + first.meow() + "\n" + second.bark();
    }
}
