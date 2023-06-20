public class ThreadWorkerWithLock extends Thread{
    private final ResourcesExploiterWithLock rExp;


    public ThreadWorkerWithLock(ResourcesExploiterWithLock rExp) {
        this.rExp = rExp;
    }
    public void run(){
        for(int i = 0 ; i < 1000; i++){
            rExp.exploit();
        }
    }
}
