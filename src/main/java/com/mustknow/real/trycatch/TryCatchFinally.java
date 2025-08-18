package com.mustknow.real.trycatch;

public class TryCatchFinally {

    public static void main(String[] args) {
        System.out.println( tryCatchFinallyEx() ); // Prints 6
    }

    private static int tryCatchFinallyEx() {
        try {
            // Normal flow: this would return 4 ...
            // int a = 4 / 0; // If you uncomment this, an ArithmeticException is thrown.
            return 4;
        } catch (Throwable e) {
            // If an exception occurs in try, this would return 5 ...
            return 5;
        } finally {
            // ... BUT this finally block ALWAYS runs (unless JVM dies: System.exit(), crash, infinite loop, power off).
            // And because it ALSO returns, it OVERRIDES any pending return from try or catch.
            // So the method ALWAYS returns 6.
            return 6;
        }
        // return 7; // Q3: This is unreachable because every control path above already returns.
    }

    /*
     Q1: With normal flow tryCatchFinallyEx() returns 6 — why?
         - Execution enters try, executes 'return 4'.
         - BEFORE the method actually returns, the finally block executes.
         - The finally block has 'return 6', which REPLACES the earlier pending return.
         - So the final returned value is 6.

     Q2: When an exception occurs it still returns 6 — why?
         - If an exception (e.g., int a = 4 / 0) is thrown, control jumps to catch and executes 'return 5'.
         - Again, before returning, finally executes and its 'return 6' overrides the 'return 5'.
         - Therefore, regardless of exception or not, the method returns 6.

     Q3: After try-catch-finally, if I write 'return 7' the code is unreachable — why?
         - The compiler performs reachability analysis.
         - In this method, every possible path exits via a 'return' inside try, catch, or finally.
         - Because finally ALWAYS runs and itself returns, there is NO path that could reach code after the finally block.
         - Hence 'return 7;' is unreachable => compile-time error: "Unreachable statement".

     Q4: Priority of finally block over try block or catch block?
         - Order of execution:
             1. Execute try.
             2. If exception: execute matching catch.
             3. Execute finally (ALWAYS, unless abnormal termination).
             4. Perform the actual return (or re-throw) AFTER finally—UNLESS finally itself returns/throws.
         - If finally contains a return or throws a new exception, it OVERRIDES:
             - Any value computed by a return in try or catch.
             - Any exception thrown in try or catch (it will be lost/suppressed — bad practice unless intentional).
         - Therefore, "finally" does not have earlier temporal priority, but it has the LAST WORD before the method exits.
         - Best Practice: AVOID 'return' (or 'throw' unless you mean it) inside finally because it obscures logic and can swallow exceptions.

     EXTRA NOTE:
         If you remove 'return 6' from finally, behavior becomes:
             - Normal flow: returns 4.
             - Exception flow: returns 5.
         And then 'return 7;' after the block would become reachable (unless both try and catch still guarantee return).

     Demonstration of better style (no return in finally):

         private static int cleanerVersion() {
             int result = -1;
             try {
                 result = 4;
             } catch (Throwable t) {
                 result = 5;
             } finally {
                 // cleanup only; no return here
                 System.out.println("cleanup");
             }
             return result; // Clear, predictable.
         }

     SUMMARY:
         - finally always runs.
         - A return in finally overrides previous returns / exceptions.
         - Unreachable code error arises when all paths already return.
         - Avoid returning from finally for clarity and to prevent swallowing exceptions.
     */
}