package item8;

import java.lang.ref.Cleaner;

public class Room implements AutoCloseable{

    private static final Cleaner cleaner = Cleaner.create();

    //청소가 필요한 자원, 절대 Room을 참조하면 안됩니다.
    private static class State implements Runnable {
        int numJunkPiles; // 쓰레기 수

        State(int numJunkPiles) {
            this.numJunkPiles = numJunkPiles;
        }

        //close 메서드나, cleaner가 호출
        @Override
        public void run() {
            System.out.println("방 청소");
            numJunkPiles = 0;
        }
    }

    //방의 상태, cleanable과 공유합니다.
    private final State state;

    //cleanable 객체, 수거 대상이 되면 방을 청소합니다.
    private final Cleaner.Cleanable cleanable;

    public Room(int numJunkPiles) {
        this.state = new State(numJunkPiles);
        this.cleanable = cleaner.register(this, state);
    }

    @Override
    public void close() throws Exception {
        cleanable.clean();
    }
}
