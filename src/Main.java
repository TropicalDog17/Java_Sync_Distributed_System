// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ResourcesExploiter resource = new ResourcesExploiter(0);
        ThreadedWorkerWithoutSync worker1 = new ThreadedWorkerWithoutSync(resource);
        ThreadedWorkerWithoutSync worker2 = new ThreadedWorkerWithoutSync(resource);
        ThreadedWorkerWithoutSync worker3 = new ThreadedWorkerWithoutSync(resource);
        worker1.start();
        worker2.start();
        worker3.start();
        worker1.join();
        worker2.join();
        worker3.join();
        System.out.println(resource.getRsc());

        ResourcesExploiterWithLock resourcesExploiterWithLock = new ResourcesExploiterWithLock(0);
        ThreadWorkerWithLock worker_lock1 = new ThreadWorkerWithLock(resourcesExploiterWithLock);
        ThreadWorkerWithLock worker_lock2 = new ThreadWorkerWithLock(resourcesExploiterWithLock);
        ThreadWorkerWithLock worker_lock3 = new ThreadWorkerWithLock(resourcesExploiterWithLock);
        worker_lock1.start();
        worker_lock2.start();
        worker_lock3.start();
        worker_lock1.join();
        worker_lock2.join();
        worker_lock3.join();
        System.out.println(resourcesExploiterWithLock.getRsc());
    }
}
