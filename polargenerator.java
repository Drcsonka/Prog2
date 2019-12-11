public class polargenerator
{
    boolean nemTarolt = true;
    double tarolt;
    public polargenerator() 
    {
        nemTarolt = true;
    }
    public double kovetkezo()
    {
        if(nemTarolt)
        {
            double u1, u2, v1, v2, w;
            do
            {
                u1 = Math.random();
                u2 = Math.random();
                v1 = 2 * u1 - 1;
                v2 = 2 * u2 - 1;
                w = v1 * v1 + v2 * v2;
            } while(w > 1);
            double r = Math.sqrt((-2 * Math.log(w)) / w);
            tarolt = r * v2;
            nemTarolt = !nemTarolt;
            return r * v1;
        }
        else 
        {
            nemTarolt = !nemTarolt;
            return tarolt;
        }
    }
    public static void main(String[] args)
    {
        polargenerator g = new polargenerator();
        for (int i = 0; i < 10; ++i)
        {
            System.out.println(g.kovetkezo());
        }
    }
}   