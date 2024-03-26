public class Timer {
    public static void measureExecutionTime(Runnable codeBlock) {
        long startTime = System.nanoTime();

        codeBlock.run();

        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        float durationInMilliseconds = (float) duration / 1_000_000;
        float durationInSeconds = durationInMilliseconds / 1_000;

        System.out.println("Execution time in nanoseconds: " + duration);
        System.out.println("Execution time in milliseconds: " + durationInMilliseconds);
        if (durationInMilliseconds > 1000) {
            System.out.println("Execution time in seconds: " + durationInSeconds);

        }
    }
}