# Custom Random Number Generator

A simple implementation of a random number generator built from scratch in Java, using the Linear Congruential Generator (LCG) algorithm. This project demonstrates how to create pseudo-random numbers without relying on built-in libraries.

## Features
- Custom random number generation using the LCG algorithm.
- Configurable seed for reproducibility or automatic seeding with the current time.
- Support for generating random numbers within a specified range.

## How It Works
The generator uses the following formula:
```
seed = (a * seed + c) % m
```
Where:
- `a` is the multiplier.
- `c` is the increment.
- `m` is the modulus.

These parameters ensure the randomness properties of the generated numbers.

## Usage
### Prerequisites
- Java Development Kit (JDK) 8 or later.

### Running the Project
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/custom-random-generator.git
   ```
2. Navigate to the project directory:
   ```bash
   cd custom-random-generator
   ```
3. Compile the Java file:
   ```bash
   javac CustomRandomNumberGenerator.java
   ```
4. Run the program:
   ```bash
   java CustomRandomNumberGenerator
   ```

### Sample Output
The program generates 10 random numbers between 1 and 100. Example:
```
42
78
15
91
34
67
3
56
23
89
```

## Code Example
Here's a snippet of how to use the generator:
```java
CustomRandomNumberGenerator rng = new CustomRandomNumberGenerator();
int randomValue = rng.nextInt(1, 100);
System.out.println("Generated random number: " + randomValue);
```
