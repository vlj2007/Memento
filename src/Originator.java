// Класс, который будет хранить состояние, для которого мы хотим сохранить момент
public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
        System.out.println("Состояние изменено на: " + state);
    }

    public String getState() {
        return state;
    }

    // Создание объекта Memento для сохранения текущего состояния
    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    // Восстановление состояния из объекта Memento
    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
        System.out.println("Состояние восстановлено: " + state);
    }
}
