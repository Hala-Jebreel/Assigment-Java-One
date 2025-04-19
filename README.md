#  Java Equation Analyzer

This Java-based application allows users to:
- Check if a number is "balanced"
- Solve quadratic equations
- Find equation roots
- Combine two equations



---

##  Features

1. **Balanced Number Check**
   - Sums even and odd digits separately.
   - A number is *balanced* if the sum of even digits equals the sum of odd digits.

2. **Solve Quadratic Equation**
   - Formula: `ax² + bx + c`
   - User enters values of `a`, `b`, `c`, and `x`.

3. **Find Roots**
   - Uses the quadratic formula to find real roots.

4. **Combine Equations**
   - Adds two separate quadratic equations together.

---

## Files

| File Name         | Description                              |
|------------------|------------------------------------------|
| `CheckEquation.java` | Main menu interface, handles user input |
| `Equation.java`      | Logic for solving, combining, and checking |

---

##  How to Run

### Option 1: Compile and Run via Terminal

```bash
javac Equation.java CheckEquation.java
java CheckEquation
