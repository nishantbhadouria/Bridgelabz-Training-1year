package Static_in_method_interface.Problem3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public interface DateUtils
{
    static String formatDate(LocalDate date)
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return date.format(formatter);
    }
}