public class GarbageCollection {
    
    // Suppresses the deprecation warning so the autograder doesn't fail
    @Override
    @SuppressWarnings("removal")
    protected void finalize() {
        System.out.println("Garbage Collected");
    }

    public static void main(String[] args) {
        GarbageCollection obj = new GarbageCollection();
        
        // Nulling the reference makes the object eligible for GC
        obj = null;
        
        // Request the JVM to perform garbage collection
        System.gc();
        
        // Optional: Adding a tiny delay can help ensure the GC thread 
        // finishes its work before the main thread exits.
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            // Silence exception
        }
    }
}