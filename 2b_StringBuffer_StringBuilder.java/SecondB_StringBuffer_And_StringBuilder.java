package secondQuestion;

public class SecondB_StringBuffer_And_StringBuilder {


	    public static void main(String[] args) {
	        int iterations = 10000;
	        String data = "AIET";

	        // Performance test for StringBuffer
	        long startTimeStringBuffer = System.currentTimeMillis();
	        StringBuffer stringBuffer = new StringBuffer();
	        for (int i = 0; i < iterations; i++) {
	            stringBuffer.append(data);
	        }
	        long endTimeStringBuffer = System.currentTimeMillis();
	        long durationStringBuffer = endTimeStringBuffer - startTimeStringBuffer;

	        // Performance test for StringBuilder
	        long startTimeStringBuilder = System.currentTimeMillis();
	        StringBuilder stringBuilder = new StringBuilder();
	        for (int i = 0; i < iterations; i++) {
	            stringBuilder.append(data);
	        }
	        long endTimeStringBuilder = System.currentTimeMillis();
	        long durationStringBuilder = endTimeStringBuilder - startTimeStringBuilder;

	        System.out.println("Performance Test for String Appending (" + iterations + " iterations):");
	        System.out.println("StringBuffer: Duration = " + durationStringBuffer + " milliseconds");
	        System.out.println("StringBuilder: Duration = " + durationStringBuilder + " milliseconds");

	        // Justification
	        System.out.println("\nJustification:");
	        if (durationStringBuilder < durationStringBuffer) {
	            System.out.println("StringBuilder performed better than StringBuffer in this test.");
	            System.out.println("The primary reason is that StringBuilder is not synchronized,");
	            System.out.println("making it faster for single-threaded environments where thread safety");
	            System.out.println("is not a concern. The overhead of synchronization in StringBuffer");
	            System.out.println("adds extra processing time for each append operation.");
	        } else if (durationStringBuffer < durationStringBuilder) {
	            System.out.println("StringBuffer performed better than StringBuilder in this test (this is less likely).");
	            System.out.println("This scenario is unusual for simple append operations in a single thread.");
	            System.out.println("It might occur under specific JVM implementations or heavy context switching,");
	            System.out.println("but generally, StringBuilder is faster for single-threaded tasks.");
	        } else {
	            System.out.println("StringBuffer and StringBuilder performed similarly.");
	            System.out.println("This could happen in very short tests or under specific system conditions.");
	            System.out.println("However, for a significant number of operations, StringBuilder is usually faster.");
	        }

	        System.out.println("\nRecommendation:");
	        System.out.println("For string manipulation within a single thread where thread safety is not required,");
	        System.out.println("StringBuilder is generally the preferred and more efficient choice due to its");
	        System.out.println("lack of synchronization overhead.");
	        System.out.println("StringBuffer is designed for thread-safe operations in multi-threaded environments.");
	        System.out.println("If your code might be accessed by multiple threads concurrently and you need to");
	        System.out.println("ensure data consistency, then StringBuffer is the safer option, albeit with a");
	        System.out.println("potential performance trade-off.");
	    }
	}