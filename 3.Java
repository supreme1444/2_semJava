
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class StartClass1 
{
    public static void main(String[] args) 
    {
        String path = "C:\\Users\\supre\\OneDrive\\Рабочий стол\\Новая папка (11)\\Новая папка (12)\\tor.txt";
        Pattern p = Pattern.compile("\\.\\w+$");
        Matcher m = p.matcher(path);
        m.find();
        String ext = m.group();
        System.out.println(path + " " + ext);
    }   
}
