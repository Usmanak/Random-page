import java.util.Random;

/**
 * Created by Muhammad Usman Akram on 11/12/2016.
 */
public class myRandomClass {
    public String getRandomWord()
{
    String r = "";
    Random s= new Random();
    for(int i = 0; i <= s.nextInt(10); i++) {
        r += (char)(Math.random() * 26 + 97);
    }
    //System.out.println(r);
    return  r;
}

     public String getRandomPage()
    {
        String page = "";
        Random r = new Random();
        int limit = r.nextInt(100);
        for(int i = 0 ;i<=limit; i++)
        {
            page+=getRandomParagraph()+"\n\n";
        }
        return page;
    }

     public String getRandomParagraph()
    {
        Random r = new Random();
        String para = "";
        int lines = r.nextInt(30);
        while(lines>0)
        {
            int line = r.nextInt(10);
            for (int i = 1; i <= line; i++) {
                para += getRandomWord() + " ";
            }
            boolean flag = r.nextBoolean();
            if(flag)
                para += ".\n";
            else
                para+=".";

            lines--;
        }
        return para;
    }
}
