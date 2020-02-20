/**
 * moon
 */
class Moon {
    int eweight;
    Moon(int weight)
    {
        eweight = weight;
    }
    void moonWeight()
    {
        float weight = eweight*0.17f*9.8f;
        System.out.println("Weight on Moon = " + weight);
    }
    public static void main(String[] args) {
        Moon body[] = new Moon[3];
        body[0] = new Moon(75);
        body[1] = new Moon(81);
        body[2] = new Moon(55);
        char i = 97;
        for (Moon Body : body) {
            System.out.println("Object " + i + "\n" + "Weight on Earth = " + Body.eweight );
            Body.moonWeight();
            ++i;
        }
    }
}