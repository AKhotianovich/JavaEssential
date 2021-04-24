package Lesson8.Package1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static boolean isThisDateValid(String dateToValidate, String dateFromat) {
        if (dateToValidate == null) {
            return false;
        }

        SimpleDateFormat sdf = new SimpleDateFormat(dateFromat);
        sdf.setLenient(false);

        try {
            Date date = sdf.parse(dateToValidate);
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {

        Worker[] worker = new Worker[4];

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < worker.length; i++){
            String fio = "";
            String dol = "";
            String year = "";

            System.out.print("Enter Fio: ");
            fio = bufferedReader.readLine();
            System.out.print("Enter Dol: ");
            dol = bufferedReader.readLine();
            System.out.print("Enter Year: ");
            year = bufferedReader.readLine();

            isThisDateValid(year, "yyyy");
            worker[i] = new Worker(fio, dol, year);


        }

        for (int i = 0; i < worker.length; i++){
            System.out.println(worker[i].toString());
        }

        System.out.println("Input value:");
        int value = Integer.parseInt(bufferedReader.readLine());

        int yearNow = Calendar.getInstance().get(Calendar.YEAR);

        for (int i = 0; i < worker.length; i++) {
            String year = worker[i].year;

            int staj = yearNow - Integer.parseInt(year);

            if (staj > value) {
                System.out.println(worker[i].toString());
            }
        }
    }

}
