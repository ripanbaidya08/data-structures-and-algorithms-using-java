package io.dsalgo.stack.problems.medium;

import java.util.ArrayDeque;
import java.util.Deque;

// 735. Asteroid Collision
class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stk = new ArrayDeque<>();

        for (int val : asteroids) {
            if (val > 0) {
                // Push positive asteroids onto the stack
                stk.offerLast(val);
            } else {
                // Handle negative asteroids
                boolean destroyed = false;

                while (!stk.isEmpty() && stk.peekLast() > 0) {
                    if (stk.peekLast() == Math.abs(val)) {
                        // Same size, destroy both
                        stk.pollLast();
                        destroyed = true;
                        break;
                    } else if (stk.peekLast() < Math.abs(val)) {
                        // Positive asteroid is smaller, pop it
                        stk.pollLast();
                    } else { // Positive asteroid is larger
                        destroyed = true; // The negative asteroid is destroyed
                        break;
                    }
                }

                // If the negative asteroid was not destroyed, add it to the stack
                if (!destroyed) {
                    stk.offerLast(val);
                }
            }
        }

        // Convert Deque to int array
        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}
