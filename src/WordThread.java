public class WordThread extends Thread {
    private String word;
    private int time;
    private int count;

    public WordThread(String word, int time, int count) {
        this.word = word;
        this.time = time;
        this.count = count;
    }

    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.print(word);
            try {
                Thread.sleep(time); //sleep() 메서드 -> 밀리초만큼 스레드 정지 -> 1초 = 1000밀리초
            } catch (Exception e) {

            }
        }
    }

    public static void main(String[] args) {
        WordThread tick = new WordThread("tick", 1000, 4);
        WordThread tack = new WordThread(" tack\n", 1000, 3);

        tick.start(); //start() 메서드 -> 스레드 실행
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
        tack.start();
    }
}
