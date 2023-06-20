public class ThreadedWorkerWithoutSync extends Thread{
    private final ResourcesExploiter rExp;

    public ThreadedWorkerWithoutSync(ResourcesExploiter resource) {
        rExp = resource;
    }

    @Override
    public void run() {
            for(int i = 0; i < 1000; i++){
                rExp.exploit();
            }
        }

}
