public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("Состояние 1");
        caretaker.add(originator.saveStateToMemento());

        originator.setState("Состояние 2");
        caretaker.add(originator.saveStateToMemento());

        originator.setState("Состояние 3");

        // Восстановление состояния из сохраненных моментов
        originator.getStateFromMemento(caretaker.get(0)); // Восстанавливаем "Состояние 1"
        originator.getStateFromMemento(caretaker.get(1)); // Восстанавливаем "Состояние 2"
    }
}
