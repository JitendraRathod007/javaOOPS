class Calculator
{
    double add(double a, double b)
    {
        return a + b;
    }
    double sub(double a, double b)
    {
        return a - b;
    }
    double mul(double a, double b)
    {
        return a * b;
    }
}

class ScientificCalculatorSI extends Calculator
{
    double square(double n)
    {
        return n * n;
    }
    double cube(double n)
    {
        return n * n * n;
    }

    public static void main(String args[])
    {
        ScientificCalculatorSI sb = new ScientificCalculatorSI();
        System.out.println(sb.add(5, 8));
    }
}