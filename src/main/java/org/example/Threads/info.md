# Threads in Java

A **thread** is a lightweight process in Java that allows a program to perform multiple tasks simultaneously. 
Each thread runs independently within the same program, enabling **multithreading**, which improves performance and efficiency.

## Key Concepts
- **Single-threaded**: A program with only one thread, executing tasks sequentially.
- **Multithreaded**: A program with multiple threads running tasks concurrently.

## Why Use Threads?
- To perform multiple tasks at the same time (e.g., downloading files while processing data).
- To make programs more responsive (e.g., keeping the UI responsive in GUI applications).

## Creating Threads in Java
There are two main ways to create threads:
1. **Extending the `Thread` class**.
2. **Implementing the `Runnable` interface**.




# when we use thread we should have run method not other, okay and at last we should have start not the obj name .