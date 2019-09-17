import java.util.*;
import java.lang.*;

public class StudentDEMO {
    public static void main(String[] args)
    {
        Student[] studentDatabase = new Student[100];

        System.out.println("Undergraduate Student Database: ");
        System.out.printf("%-22s %-7s %-10s %-14s %-15s %-18s %-36s %-24s %n", "Name", "Age", "Gender","Enrollment", "Year", "Status", "Major", "GPA");
        for (int i = 0; i < studentDatabase.length; i++)
        {
            studentDatabase[i] = new Student();
            studentDatabase[i].print();
        }

        System.out.println();

        GraduateStudent[] gradStudentDatabase = new GraduateStudent[100];

        System.out.println("Graduate Student Database: ");
        System.out.printf("%-22s %-7s %-10s %-14s %-15s %-18s %-36s %-24s %n", "Name", "Age", "Gender","Enrollment", "Year", "Status", "Major", "GPA");
        for (int i = 0; i < gradStudentDatabase.length; i++)
        {
            gradStudentDatabase[i] = new GraduateStudent();
            gradStudentDatabase[i].print();
        }

        System.out.println("\nTop 10 Undergraduate GPAs: ");
        topTenGPA(studentDatabase);

        System.out.println("\nTop 10 Graduate GPAs: ");
        topTenGPA(gradStudentDatabase);

        System.out.println("\nTop 10 Graduate Females ");
        topTenFemaleGPA(gradStudentDatabase);

        System.out.println("\nTop 10 Senior Graduate Males");
        topTenSeniorMaleGPA(gradStudentDatabase);

        Student s = new Student();
        String[] majors = s.majorList();
        int[] majorCount = new int[majors.length];
        for (int i = 0; i < majors.length; i++)
        {
            majorCount[i] = 0;
            for (int j = 0; j < 100; j++)
            {
                if (studentDatabase[j].getMajor() == majors[i])
                    majorCount[i]++;
                if (gradStudentDatabase[j].getMajor() == majors[i])
                    majorCount[i]++;
            }
        }

        System.out.println("\nTop 3 Most Popular Majors:");
        topThreeMajors(majors, majorCount);
    }


    public static void topTenGPA(Student[] arr)
    {
        Arrays.sort(arr, new SortByGPA());
        for (int i = 0; i < 10; i++)
        {
            arr[i].print();
        }
    }


    public static void topTenFemaleGPA(GraduateStudent[] arr)
    {
        Arrays.sort(arr, new SortByGender());
        for (int i = 0; i < 10; i++)
        {
            arr[i].print();
        }
    }

    public static void topTenSeniorMaleGPA(GraduateStudent[] arr)
    {
        Arrays.sort(arr, new SortByGenderYear());

        int k = 0;
        while ((arr[k].getGender() != "Male") || (arr[k].getThe_number_of_year() != "Year 4"))
            k++;

        int max;
        if ((arr.length - k) > 10)
            max = k + 10;
        else
            max = arr.length;

        for (int i = k; i < max; i++)
        {
            arr[i].print();
        }
    }

    public static void topThreeMajors(String[] majors, int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
            int max_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] > arr[max_idx])
                    max_idx = j;

            int temp = arr[max_idx];
            String temps = majors[max_idx];
            arr[max_idx] = arr[i];
            majors[max_idx] = majors[i];
            arr[i] = temp;
            majors[i] = temps;
        }

        for (int i = 0; i < 3; i++)
        {
            System.out.println((i+1) + ". Major: " + majors[i] + ", Count: " + arr[i]);
        }

    }
}
