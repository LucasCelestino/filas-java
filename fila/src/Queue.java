public class Queue
{
    private People[] peoples;
    private int first;
    private int last;
    private int total;

    public Queue(int queueSize)
    {
        peoples = new People[queueSize];
        first = 0;
        last = -1;
        total = 0;
    }

    public void enqueue(People newPeople)
    {
        if(isFull())
        {
            throw new RuntimeException("A fila está cheia!");
        }

        last = (last + 1) % peoples.length;

        peoples[last] = newPeople;

        total++;
    }

    public People dequeue()
    {
        if(isEmpty())
        {
            throw new RuntimeException("A fila está vazia!");
        }

        People removedPeople = peoples[first];

        first = (first + 1) % peoples.length;

        total--;

        return removedPeople;
    }

    public boolean isEmpty()
    {
        return total == 0;
    }

    public boolean isFull()
    {
        return total == peoples.length;
    }

    public int size()
    {
        return total;
    }
}
