import java.time.Instant;

public class CustomRandomNumberGenerator {

    // Seed value
    private long seed;

    // Constructor to initialize the seed
    public CustomRandomNumberGenerator(long seed) {
        this.seed = seed;
    }

    // Default constructor using current time as seed
    public CustomRandomNumberGenerator() {
        this.seed = Instant.now().toEpochMilli();
    }

    // Method to generate the next random number
    public int nextInt(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        // Parameters for the linear congruential generator
        long a = 1664525;   // Multiplier
        long c = 1013904223; // Increment
        long m = (long) Math.pow(2, 32); // Modulus

        // Generate the next seed value
        seed = (a * seed + c) % m;

        // Scale the result to the desired range
        return (int) (min + (seed % (max - min + 1)));
    }

    public static void main(String[] args) {
        // Create an instance of the random number generator
        CustomRandomNumberGenerator rng = new CustomRandomNumberGenerator();

        // Generate and print random numbers in the range of 1 to 100
        for (int i = 0; i < 10; i++) {
            System.out.println(rng.nextInt(1, 100));
        }
    }
}
