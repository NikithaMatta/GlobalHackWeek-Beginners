# Quick Sort in Java

Quick Sort is an efficient, divide-and-conquer sorting algorithm. This project demonstrates a simple implementation of Quick Sort in Java, complete with partitioning logic and recursive sorting.

## Features

- Implements Quick Sort for sorting an array of integers.
- Demonstrates how partitioning works with a pivot element.
- Recursively sorts subarrays to achieve a fully sorted array.

## How It Works

1. Select a pivot element (last element in this implementation).
2. Partition the array so that:
   - Elements smaller than or equal to the pivot are on the left.
   - Elements larger than the pivot are on the right.
3. Recursively apply the process to subarrays.

## Input Example

Input array:
[10, 7, 8, 9, 1, 5]

## Output Example

Sorted array:
[1, 5, 7, 8, 9, 10]

## Time Complexity
- Best/Average Case: O(n log n)
- Worst Case: O(n²) (occurs when the pivot divides the array poorly, e.g., already sorted data with no optimization)

## Space Complexity
- O(log n) for recursive stack (in-place sorting).

