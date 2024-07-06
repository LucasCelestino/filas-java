public class App {
    public static void main(String[] args) throws Exception
    {
        Queue peopleQueue = new Queue(5);

        peopleQueue.enqueue(new People("People 1", 20));
        peopleQueue.enqueue(new People("People 2", 45));
        peopleQueue.enqueue(new People("People 3", 32));

        System.out.println("Existem "+peopleQueue.size()+" pessoas na fila!");

        People removedPeople = peopleQueue.dequeue();

        System.out.println("A vez do primeiro da fila chegou: "+removedPeople.getNome());

        System.out.println("Existem "+peopleQueue.size()+" pessoas na fila!");
    }
}
