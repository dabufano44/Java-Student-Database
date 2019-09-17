import java.util.*;
import java.lang.*;

public class Student {
    private double GPA;
    private int age;
    private String gender;
    private String major;
    private String the_number_of_year;
    private String name;
    private String date_enrolled;
    private String status;

    public Student()
    {
       GPA = createGPA();
       age = createAge();
       gender = createGender();
       major = createMajor();
       the_number_of_year = createThe_number_of_year();
       name = createName();
       date_enrolled = createDate();
       status = "Undergraduate";
    }

    public double getGPA(){return GPA;}
    public int getAge(){return age;}
    public String getGender(){return gender;}
    public String getMajor(){return major;}
    public String getThe_number_of_year(){return the_number_of_year;}
    public String getName(){return name;}
    public String getDate_enrolled(){return date_enrolled;}
    public String getStatus(){return status;}

    public void setAge(int age){this.age = age;}
    public void setThe_number_of_year(String the_number_of_year){this.the_number_of_year = the_number_of_year;}
    public void setStatus(String status){this.status = status;}
    public void setDate_enrolled(String date_enrolled){this.date_enrolled = date_enrolled;}

    public double createGPA()
    {
        double prob = Math.random();
        double grade;
        if (prob > .4)
            grade = 4 - Math.random();
        else if (prob <= .4 && prob > .1)
            grade = (3 - Math.random());
        else
            grade = Math.random()*4;

        double roundedGrade = Math.round(grade *1000.0)/1000.0;
        return roundedGrade;
    }

    public int createAge()
    {
        int a = ((int)(Math.random()*7))+ 17;
        return a;
    }

    public String createGender()
    {
        String g;
        double prob = Math.random();
        if (prob > .5)
            g = "Female";

        else
            g = "Male";
        return g;
    }

    public String[] majorList()
    {
        String[] majorList = {"African & African American Studies", "American Studies", "Art History", "Classical Civilization", "Classical Languages", "Comparative Literature", "English", "Fashion Studies",
                "History", "Latin American & Latino Studies", "Medieval Studies", "Middle East Studies", "Music", "Philosophy", "Urban Studies", "Visual Arts", "Women, Gender, & Sexuality Studies",
                "Film and Television", "Journalism", "Computer Science", "Economics", "Mathematics", "French Studies", "German Studies", "Italian Studies", "Jewish Studies",
                "Spanish Studies", "Chemistry", "Environmental Science", "Neuroscience", "Physics", "Psychology", "Anthropology", "Political Science", "Social Work", "Sociology", "Religious Studies"};
        return majorList;
    }

    public String createMajor()
    {
        String[] majors = majorList();
        int index = (int)(Math.random()*(majors.length));
        return majors[index];
    }

    public String createThe_number_of_year()
    {
        String[] year = {"Year 1", "Year 2", "Year 3", "Year 4"};
        int num;
        if (age < 20)
           num = (int)(Math.random()*2);
        else
            num = (int)(Math.random()*4);

        return year[num];
    }

    public String createName()
    {
        String firstName;
        String lastName;

        String[] maleNames = {"Liam", "Noah", "William", "James", "Logan", "Benjamin", "Mason", "Elijah", "Oliver", "Jacob", "Lucas", "Michael", "Alexander", "Ethan", "Daniel", "Matthew",
                "Aiden", "Henry", "Joseph", "Jackson", "Samuel", "Sebastian", "David", "Carter", "Wyatt", "Jayden", "John", "Owen", "Dylan", "Luke", "Gabriel", "Anthony",
                "Isaac", "Grayson", "Jack", "Julian", "Levi", "Christopher", "Joshua", "Andrew", "Lincoln", "Mateo", "Ryan", "Jaxon", "Nathan", "Aaron", "Isaiah", "Thomas",
                "Charles", "Caleb", "Josiah", "Christian", "Hunter", "Eli", "Jonathan", "Connor", "Landon", "Adrian", "Asher", "Cameron", "Leo", "Theodore", "Jeremiah",
                "Hudson", "Robert", "Easton", "Nolan", "Nicholas", "Ezra", "Colton", "Angel", "Brayden", "Jordan", "Dominic", "Austin", "Ian", "Adam", "Elias", "Jaxson",
                "Greyson", "Jose", "Ezekiel", "Carson", "Evan", "Maverick", "Bryson", "Jace", "Cooper", "Xavier", "Parker", "Roman", "Jason", "Santiago", "Chase", "Sawyer",
                "Gavin", "Leonardo", "Kayden", "Ayden", "Jameson"};

        String[] femaleNames = {"Emma", "Olivia", "Ava", "Isabella", "Sophia", "Mia", "Charlotte", "Amelia", "Evelyn", "Abigail", "Harper", "Emily", "Elizabeth", "Avery", "Sofia", "Ella",
                "Madison", "Scarlett", "Victoria", "Aria", "Grace", "Chloe", "Camila", "Penelope", "Riley", "Layla", "Lillian", "Nora", "Zoey", "Mila", "Aubrey", "Hannah", "Lily", "Addison",
                "Eleanor", "Natalie", "Luna", "Savannah", "Brooklyn", "Leah", "Zoe", "Stella", "Hazel", "Ellie", "Paisley", "Audrey", "Skylar", "Violet", "Claire", "Bella", "Aurora", "Lucy",
                "Anna", "Samantha", "Caroline", "Genesis", "Aaliyah", "Kennedy", "Kinsley", "Allison", "Maya", "Sarah", "Madelyn", "Adeline", "Alexa", "Ariana", "Elena", "Gabriella", "Naomi",
                "Alice", "Sadie", "Hailey", "Eva", "Emilia", "Autumn", "Quinn", "Nevaeh", "Piper", "Ruby", "Serenity", "Willow", "Everly", "Cora", "Kaylee", "Lydia", "Aubree", "Arianna", "Eliana",
                "Peyton", "Melanie", "Gianna", "Isabelle", "Julia", "Valentina", "Nova", "Clara", "Vivian", "Reagan", "Mackenzie", "Madeline"};

        String[] lastNames = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson", "White", "Harris", "Martin",
                "Thompson", "Garcia", "Martinez", "Robinson", "Clark", "Rodriguez", "Lewis", "Lee", "Walker", "Hall", "Allen", "Young", "Hernandez", "King", "Wright", "Lopez", "Hill", "Scott",
                "Green", "Adams", "Baker", "Gonzalez", "Nelson", "Carter", "Mitchell", "Perez", "Roberts", "Turner", "Phillips", "Campbell", "Parker", "Evans", "Edwards", "Collins", "Stewart", "Sanchez",
                "Morris", "Rogers", "Reed", "Cook", "Morgan", "Bell", "Murphy", "Bailey", "Rivera", "Cooper", "Richardson", "Cox", "Howard", "Ward", "Torres", "Peterson", "Gray", "Ramirez", "James", "Watson",
                "Brooks", "Kelly", "Sanders", "Price", "Bennett", "Wood", "Barnes", "Ross", "Henderson", "Coleman", "Jenkins", "Perry", "Powell", "Long", "Patterson", "Hughes", "Flores", "Washington", "Butler",
                "Simmons", "Foster", "Gonzales", "Bryant", "Alexander", "Russel", "Griffin", "Diaz", "Hayes"};

        int first = (int)(Math.random()*100);
        int last = (int)(Math.random()*100);

        if (gender == "Female")
            firstName = femaleNames[first];
        else
            firstName = maleNames[first];

        return firstName + " " + lastNames[last];
    }

    public String createDate()
    {
        double prob = Math.random();
        if (prob > .2) {
            if (the_number_of_year == "Year 1")
                return "Fall 2018";
            else if (the_number_of_year == "Year 2")
                return "Fall 2017";
            else if (the_number_of_year == "Year 3")
                return "Fall 2016";
            else
                return "Fall 2015";
        }
        else
        {
            if (the_number_of_year == "Year 1")
                return "Spring 2019";
            else if (the_number_of_year == "Year 2")
                return "Spring 2018";
            else if (the_number_of_year == "Year 3")
                return "Spring 2017";
            else
                return "Spring 2016";
        }
    }

    public void print()
    {
        //System.out.println("Name: " + name + "\nAge: " + age + "\nGender: " + gender + "\nMajor: " + major +
        //"\nYear: " + the_number_of_year + "\nStatus: " + status + "\n" );

        System.out.printf("%-22s %-7s %-10s %-14s %-15s %-18s %-36s %-24s %n", name, age, gender, date_enrolled, the_number_of_year, status, major, GPA);
    }

}

class SortByGPA implements Comparator<Student>
{
    @Override
    public int compare(Student s1, Student s2)
    {
        double GPADiff = s1.getGPA() - s2.getGPA();

        if(GPADiff < 0)
            return 1;
        else if (GPADiff > 0)
            return -1;
        else
            return 0;
    }
}