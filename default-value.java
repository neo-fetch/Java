class defa
{
    int a;
    float b;
    String c;
    Double d;
    boolean e;
    byte f;
    char g;
    void print()
    {
        System.out.println("integer: " + a + " float: " + b + " String: " + c + " Double: " + d + " boolean: " + e + " byte: " + f + " char: " + g + "\n"  );
    }
    public static void main(String[] args)
    {
        defa def = new defa();
        def.print();
    }
}