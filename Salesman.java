public class Salesman {
    public String Name;
    public int Revenue;
    
    public Salesman(String n, int Revenue) {
        this.Name = n;
        this.Revenue = Revenue;
    }
    
    public String getName(){
        return this.Name;
    }
    
    public void setName(String Name){
        this.Name = Name;
    }
    
    public String display(){
        return this.Name + " " + this.Revenue;
    }
    
    public static Salesman[] topFive(Salesman[] sales) {
        Salesman[] fiveGuys = new Salesman[5];
        
        return sales;
    }
    
    public static Salesman[] getTopFive(Salesman[] allSales){
        Salesman[] topFive = new Salesman[allSales.length];
        for(int i = 0; i < allSales.length; i++)
        {
            Salesman current = allSales[i];
            for(int j = 0; j < 5; j++)
            {
                Salesman temp = topFive[j];
                if (temp == null)
                {
                    topFive[j] = current;
                    break;
                }
                else
                {
                    if(current.Revenue > temp.Revenue)
                    {
                        topFive[j] = current;
                        current = temp;
                    }
                }
            }
        }
        int m, n, temp;
        for(m = 0; m < allSales.length - 1; m++)
        {
            for(n = 0; n < allSales.length - m - 1; m++)
            {
                if(topFive[n].Revenue > topFive[n + 1].Revenue)
                {
                    temp = topFive[n].Revenue;
                    topFive[n].Revenue = topFive[n + 1].Revenue;
                    topFive[n + 1].Revenue = temp;
                }
            }
        }
        temp = topFive[0].Revenue;
        topFive[0].Revenue = topFive[1].Revenue;
        topFive[1].Revenue = temp;
        return topFive;
    }
    
}
    
