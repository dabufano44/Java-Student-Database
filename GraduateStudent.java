import java.util.*;
import java.lang.*;

public class GraduateStudent extends Student {

    GraduateStudent()
    {
        super();
        setAge(getGradAge());
        setThe_number_of_year(getGradThe_number_of_year());
        setDate_enrolled(createDate());
        setStatus("Graduate");
    }

    public int getGradAge()
    {
        int a = ((int)(Math.random()*9))+ 22;
        return a;
    }

    public String getGradThe_number_of_year()
    {
        String[] year = {"Year 1", "Year 2", "Year 3", "Year 4"};
        int num;
        if (getAge() <= 24)
            num = (int)(Math.random()*2);
        else
            num = (int)(Math.random()*4);

        return year[num];
    }
}

class SortByGender<GraduateStudent extends Student> implements Comparator<GraduateStudent>
{
    @Override
    public int compare(GraduateStudent s1, GraduateStudent s2)
    {
        return s1.getGender().compareTo(s2.getGender());
    }
}

class SortByGenderYear<GraduateStudent extends Student> implements Comparator<GraduateStudent>
{
    @Override
    public int compare(GraduateStudent s1, GraduateStudent s2)
    {
        int GenderCompare = s1.getGender().compareTo(s2.getGender());
        int YearCompare = s1.getThe_number_of_year().compareTo(s2.getThe_number_of_year());
        if (GenderCompare == 0)
        {
            if (YearCompare == 0)
                return GenderCompare;
            else
                return YearCompare;
        }
        else
            return GenderCompare;
    }
}

